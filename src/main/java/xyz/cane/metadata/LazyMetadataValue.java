package xyz.cane.metadata;

import java.util.concurrent.Callable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xyz.cane.plugin.CanePlugin;

/**
 * A LazyMetadataValue is a self-expiring metadata value that is only calculated
 * when it is first accessed.
 */
public class LazyMetadataValue extends MetadataValue {
    private final Callable<Object> lazyValue;
    private Object internalValue;

    public LazyMetadataValue(@NotNull CanePlugin owningPlugin, @NotNull Callable<Object> lazyValue) {
        super(owningPlugin);
        this.lazyValue = lazyValue;
    }

    @Override
    @Nullable
    public Object value() {
        if (internalValue == null) {
            try {
                internalValue = lazyValue.call();
            } catch (Exception e) {
                // Return null if the calculation fails
                return null;
            }
        }
        return internalValue;
    }

    @Override
    public void invalidate() {
        internalValue = null;
    }
}
