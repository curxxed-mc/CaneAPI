package xyz.cane.potion;

import org.jetbrains.annotations.NotNull;
import xyz.cane.inventory.ItemStack;

import java.util.Collection;

/**
 * Represents a potion.
 */
public class Potion {

    private final PotionType type;
    private final Collection<PotionEffect> effects;

    public Potion(@NotNull PotionType type, @NotNull Collection<PotionEffect> effects) {
        this.type = type;
        this.effects = effects;
    }

    @NotNull
    public PotionType getType() {
        return type;
    }

    @NotNull
    public Collection<PotionEffect> getEffects() {
        return effects;
    }

    /**
     * Converts this potion to an ItemStack.
     * @return The ItemStack representation of this potion.
     */
    @NotNull
    public ItemStack toItemStack() {
        // Attempt to create a new ItemStack of type POTION
        // Since ItemStack is an interface and no implementation is visible,
        // this is a placeholder for your actual ItemStack creation logic.
        // Replace 'YourItemStackImpl' with your actual implementation or factory method.
        // Example:
        // ItemStack stack = new YourItemStackImpl(Material.POTION);
        // stack.setAmount(1);
        //
        // TODO: Encode potion type and effects into the ItemStack metadata/tags if supported by your API.
        // If your ItemStack implementation supports custom data, set potion type and effects here.
        // Otherwise, this will just return a basic potion item.
        throw new UnsupportedOperationException("ItemStack creation not implemented. Please provide an ItemStack implementation or factory method.");
    }
}
