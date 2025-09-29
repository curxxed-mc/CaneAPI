package xyz.cane.metadata;

import java.util.List;
import xyz.cane.plugin.CanePlugin;

/**
 * A MetadataStore stores metadata values for a single {@link Metadatable}
 * object.
 *
 * @param <T> The type of object that this metadata store is for.
 */
public interface MetadataStore<T> {

    /**
     * Sets a metadata value for a {@link Metadatable} object.
     *
     * @param subject The object to set the metadata for.
     * @param metadataKey A unique key to identify this metadata.
     * @param newMetadataValue The metadata value to store.
     */
    void setMetadata(T subject, String metadataKey, MetadataValue newMetadataValue);

    /**
     * Returns a list of metadata values for a {@link Metadatable} object.
     *
     * @param subject The object to get the metadata for.
     * @param metadataKey The unique metadata key being sought.
     * @return A list of values, one for each plugin that has set the
     * requested metadata.
     */
    List<MetadataValue> getMetadata(T subject, String metadataKey);

    /**
     * Tests to see whether a {@link Metadatable} object has the given
     * metadata value initiated by a given plugin.
     *
     * @param subject The object to check for the metadata.
     * @param metadataKey The unique metadata key being sought.
     * @return true if the metadata exists, otherwise false.
     */
    boolean hasMetadata(T subject, String metadataKey);

    /**
     * Removes a metadata value from a {@link Metadatable} object.
     *
     * @param subject The object to remove the metadata from.
     * @param metadataKey The unique metadata key being sought.
     * @param owningPlugin The plugin that initiated the metadata to be
     * removed.
     */
    void removeMetadata(T subject, String metadataKey, CanePlugin owningPlugin);

    /**
     * Invalidates all metadata in the metadata store that originates from the
     * given plugin.
     *
     * @param owningPlugin The plugin to invalidate the metadata for.
     */
    void invalidateAll(CanePlugin owningPlugin);
}
