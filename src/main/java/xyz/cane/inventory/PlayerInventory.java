package xyz.cane.inventory;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Represents a player's inventory.
 */
public interface PlayerInventory {

    /**
     * Gets all items in the inventory.
     * @return An array of ItemStacks.
     */
    @NotNull
    ItemStack[] getContents();

    /**
     * Sets the contents of the inventory.
     * @param items The items to set.
     */
    void setContents(@NotNull ItemStack[] items);

    /**
     * Adds an item to the inventory.
     * @param item The item to add.
     */
    void addItem(@NotNull ItemStack item);

    /**
     * Clears the inventory.
     */
    void clear();

    /**
     * Gets the item in the player's main hand.
     * @return The item in hand, or null if empty.
     */
    @Nullable
    ItemStack getItemInHand();

    /**
     * Sets the item in the player's main hand.
     * @param item The item to set.
     */
    void setItemInHand(@Nullable ItemStack item);
}
