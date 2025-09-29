package xyz.cane.metadata;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xyz.cane.plugin.CanePlugin;

/**
 * A FixedMetadataValue is a metadata value that is not affected by the passage
 * of time.
 */
public class FixedMetadataValue extends MetadataValue {
    private final Object internalValue;

    public FixedMetadataValue(@NotNull CanePlugin owningPlugin, @Nullable Object value) {
        super(owningPlugin);
        this.internalValue = value;
    }

    @Override
    @Nullable
    public Object value() {
        return internalValue;
    }

    @Override
    public void invalidate() {
        // Do nothing
    }
}
