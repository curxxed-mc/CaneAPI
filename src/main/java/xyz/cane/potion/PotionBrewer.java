package xyz.cane.potion;

import org.jetbrains.annotations.NotNull;
import xyz.cane.inventory.ItemStack;

import java.util.Collection;

/**
 * An interface for brewing potions.
 */
public interface PotionBrewer {

    /**
     * Creates a potion from a collection of effects.
     * @param type The type of potion to create.
     * @param effects The effects to add to the potion.
     * @return The created Potion.
     */
    @NotNull
    Potion createPotion(@NotNull PotionType type, @NotNull Collection<PotionEffect> effects);

    /**
     * Gets the potion effects from an ItemStack.
     * @param item The ItemStack to check.
     * @return A collection of potion effects, or an empty collection if none.
     */
    @NotNull
    Collection<PotionEffect> getEffects(@NotNull ItemStack item);
}
