package xyz.cane.inventory;

import org.jetbrains.annotations.NotNull;
import xyz.cane.enchantment.Enchantment;
import xyz.cane.Material;
import java.util.List;

/**
 * Represents a stack of items.
 */
public interface ItemStack {

    /**
     * Gets the material of this item stack.
     * @return The material.
     */
    @NotNull
    Material getType();

    /**
     * Gets the amount of items in this stack.
     * @return The amount.
     */
    int getAmount();

    /**
     * Sets the amount of items in this stack.
     * @param amount The new amount.
     */
    void setAmount(int amount);

    /**
     * Gets the durability (damage) of this item.
     * @return The durability.
     */
    short getDurability();

    /**
     * Sets the durability (damage) of this item.
     * @param durability The new durability.
     */
    void setDurability(short durability);

    /**
     * Gets all enchantments on this item as API-side Enchantment objects.
     * @return List of Enchantments, empty if none.
     */
    @NotNull
    List<Enchantment> getEnchantments();
}
