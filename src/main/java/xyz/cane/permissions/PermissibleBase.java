package xyz.cane.permissions;

import org.jetbrains.annotations.NotNull;
import java.util.HashMap;
import java.util.Map;

/**
 * A base class for implementing the Permissible interface.
 */
public class PermissibleBase implements Permissible {

    private final Permissible owner;
    private final Map<String, Boolean> permissions = new HashMap<>();

    public PermissibleBase(@NotNull Permissible owner) {
        this.owner = owner;
    }

    @Override
    public boolean hasPermission(@NotNull String permission) {
        // Operators have all permissions by default.
        if (isOp()) {
            return true;
        }
        return permissions.getOrDefault(permission.toLowerCase(), false);
    }

    @Override
    public boolean isOp() {
        // Delegate the OP check to the actual owner (e.g., CanePlayer).
        return this.owner.isOp();
    }

    @Override
    public void setOp(boolean value) {
        this.owner.setOp(value);
    }

    @Override
    public void addPermission(@NotNull String permission, boolean value) {
        this.permissions.put(permission.toLowerCase(), value);
    }
}
