package xyz.cane.metadata;

import java.lang.ref.WeakReference;
import xyz.cane.plugin.CanePlugin;
import org.jetbrains.annotations.Nullable;

/**
 * Represents a metadata value that can be stored on a {@link Metadatable}
 * object.
 */
public abstract class MetadataValue {

    protected final WeakReference<CanePlugin> owningPlugin;

    protected MetadataValue(@Nullable CanePlugin owningPlugin) {
        this.owningPlugin = new WeakReference<>(owningPlugin);
    }

    @Nullable
    public CanePlugin getOwningPlugin() {
        return owningPlugin.get();
    }

    @Nullable
    public abstract Object value();

    public abstract void invalidate();
}
