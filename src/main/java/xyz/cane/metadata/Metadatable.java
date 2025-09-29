package xyz.cane.metadata;

import java.util.List;
import xyz.cane.plugin.CanePlugin;

/**
 * This interface is implemented by all objects that can provide metadata.
 */
public interface Metadatable {

    /**
     * Sets a metadata value in the implementing object's metadata store.
     *
     * @param metadataKey A unique key to identify this metadata.
     * @param newMetadataValue The metadata value to store.
     */
    void setMetadata(String metadataKey, MetadataValue newMetadataValue);

    /**
     * Returns a list of previously set metadata values from the implementing
     * object's metadata store.
     *
     * @param metadataKey the unique metadata key being sought.
     * @return A list of values, one for each plugin that has set the
     * requested metadata.
     */
    List<MetadataValue> getMetadata(String metadataKey);

    /**
     * Tests to see whether the implementing object contains metadata initiated by any plugin.
     *
     * @param metadataKey the unique metadata key being sought.
     * @return true if the metadata exists, otherwise false.
     */
    boolean hasMetadata(String metadataKey);

    /**
     * Removes a metadata value from the implementing object's metadata store.
     *
     * @param metadataKey the unique metadata key being sought.
     * @param owningPlugin the plugin that initiated the metadata to be removed.
     */
    void removeMetadata(String metadataKey, CanePlugin owningPlugin);
}
