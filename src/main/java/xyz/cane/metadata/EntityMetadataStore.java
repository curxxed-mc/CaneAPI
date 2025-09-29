package xyz.cane.metadata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import xyz.cane.entity.Entity;
import xyz.cane.plugin.CanePlugin;

/**
 * An EntityMetadataStore stores metadata for all {@link Entity} objects on the
 * server.
 */
public class EntityMetadataStore implements MetadataStore<Entity> {
    private final Map<UUID, Map<String, Map<CanePlugin, MetadataValue>>> metadata = new HashMap<>();

    @Override
    public void setMetadata(Entity subject, String metadataKey, MetadataValue newMetadataValue) {
        CanePlugin owningPlugin = newMetadataValue.getOwningPlugin();
        if (owningPlugin == null) {
            throw new IllegalArgumentException("Metadata value must have an owning plugin");
        }
        metadata.computeIfAbsent(subject.getUniqueId(), k -> new HashMap<>())
                .computeIfAbsent(metadataKey, k -> new HashMap<>())
                .put(owningPlugin, newMetadataValue);
    }

    @Override
    public List<MetadataValue> getMetadata(Entity subject, String metadataKey) {
        Map<String, Map<CanePlugin, MetadataValue>> subjectMetadata = metadata.get(subject.getUniqueId());
        if (subjectMetadata == null) {
            return Collections.emptyList();
        }
        Map<CanePlugin, MetadataValue> values = subjectMetadata.get(metadataKey);
        if (values == null) {
            return Collections.emptyList();
        }
        return new ArrayList<>(values.values());
    }

    @Override
    public boolean hasMetadata(Entity subject, String metadataKey) {
        Map<String, Map<CanePlugin, MetadataValue>> subjectMetadata = metadata.get(subject.getUniqueId());
        return subjectMetadata != null && subjectMetadata.containsKey(metadataKey);
    }

    @Override
    public void removeMetadata(Entity subject, String metadataKey, CanePlugin owningPlugin) {
        Map<String, Map<CanePlugin, MetadataValue>> subjectMetadata = metadata.get(subject.getUniqueId());
        if (subjectMetadata == null) {
            return;
        }
        Map<CanePlugin, MetadataValue> values = subjectMetadata.get(metadataKey);
        if (values == null) {
            return;
        }
        values.remove(owningPlugin);
        if (values.isEmpty()) {
            subjectMetadata.remove(metadataKey);
        }
        if (subjectMetadata.isEmpty()) {
            metadata.remove(subject.getUniqueId());
        }
    }

    @Override
    public void invalidateAll(CanePlugin owningPlugin) {
        for (Map<String, Map<CanePlugin, MetadataValue>> subjectMetadata : metadata.values()) {
            for (Map<CanePlugin, MetadataValue> values : subjectMetadata.values()) {
                if (values.containsKey(owningPlugin)) {
                    values.get(owningPlugin).invalidate();
                }
            }
        }
    }
}
