package xyz.cane.permissions;

import org.jetbrains.annotations.NotNull;

/**
 * Represents an object that can be assigned permissions.
 */
public interface Permissible {

    /**
     * Checks if this object has the specified permission.
     *
     * @param permission The permission node to check (e.g., "cane.command.plugins").
     * @return true if the object has the permission, otherwise false.
     */
    boolean hasPermission(@NotNull String permission);


    /**
     * Adds a permission to this object.
     * @param permission The permission node to add.
     * @param value The value (true for granted, false for revoked).
     */
    void addPermission(@NotNull String permission, boolean value);

    /**
     * Checks if this object is an operator.
     *
     * @return true if the object is an operator.
     */
    boolean isOp();

    /**
     * Sets the operator status of this object.
     *
     * @param value true to make the object an operator, false otherwise.
     */
    void setOp(boolean value);
}
