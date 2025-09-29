package xyz.cane.entity;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xyz.cane.inventory.ItemStack;
import xyz.cane.potion.PotionEffect;
import xyz.cane.potion.PotionEffectType;

import java.util.Collection;

/**
 * Represents a living entity, such as a player, monster, or animal.
 */
public interface EntityLiving extends Entity {

    /**
     * Gets the current health of this entity.
     * @return The current health.
     */
    float getHealth();

    /**
     * Sets the current health of this entity.
     * @param health The new health value.
     */
    void setHealth(double health);

    /**
     * Gets the maximum health of this entity.
     * @return The maximum health.
     */
    float getMaxHealth();

    /**
     * Sets the maximum health of this entity.
     * @param maxHealth The new maximum health.
     */
    void setMaxHealth(double maxHealth);

    /**
     * Gets the item stack in the entity's main hand.
     * @return The item in the main hand, or null if empty.
     */
    @Nullable
    ItemStack getEquipmentInHand();

    /**
     * Sets the item stack in the entity's main hand.
     * @param item The new item stack.
     */
    void setEquipmentInHand(@Nullable ItemStack item);

    /**
     * Gets the entity's custom name.
     * @return The custom name, or null if not set.
     */
    @Nullable
    String getCustomName();

    /**
     * Sets the entity's custom name.
     * @param name The new custom name.
     */
    void setCustomName(@Nullable String name);

    /**
     * Checks if the entity's custom name is visible.
     * @return True if the custom name is visible.
     */
    boolean isCustomNameVisible();

    /**
     * Sets whether the entity's custom name is visible.
     * @param visible True to make the custom name visible.
     */
    void setCustomNameVisible(boolean visible);

    /**
     * Checks if the entity is alive.
     * @return True if the entity is alive.
     */
    boolean isAlive();

    /**
     * Gets all active potion effects on this entity.
     *
     * @return A collection of active potion effects (Cane API type).
     */
    @NotNull Collection<PotionEffect> getActivePotionEffects();

    /**
     * Adds a potion effect to this entity.
     * @param effect The potion effect to add.
     */
    void addPotionEffect(@NotNull PotionEffect effect);

    /**
     * Removes a potion effect from this entity.
     * @param type The type of potion effect to remove.
     */
    void removePotionEffect(@NotNull PotionEffectType type);

    /**
     * Checks if the entity has a specific potion effect.
     * @param type The type of potion effect to check for.
     * @return True if the entity has the potion effect.
     */
    boolean hasPotionEffect(@NotNull PotionEffectType type);
}
