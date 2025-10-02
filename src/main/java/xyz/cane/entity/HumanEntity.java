package xyz.cane.entity;

import org.jetbrains.annotations.NotNull;
import xyz.cane.GameMode;
import xyz.cane.inventory.ItemStack;
import xyz.cane.Location;

/**
 * Represents a human entity, such as a player.
 */
public interface HumanEntity extends LivingEntity {

    /**
     * Gets the name of this human entity.
     * @return The entity's name.
     */
    @NotNull
    String getName();

    /**
     * Gets the item on the cursor of this human entity.
     * @return The item on the cursor.
     */
    @NotNull
    ItemStack getItemOnCursor();

    /**
     * Sets the item on the cursor of this human entity.
     * @param item The new item on the cursor.
     */
    void setItemOnCursor(@NotNull ItemStack item);

    /**
     * Gets the current game mode of this human entity.
     * @return The current game mode.
     */
    @NotNull
    GameMode getGameMode();

    /**
     * Sets the game mode of this human entity.
     * @param mode The new game mode.
     */
    void setGameMode(@NotNull GameMode mode);

    /**
     * Gets the bed spawn location of this human entity.
     * @return The bed spawn location, or the world's spawn point if none is set.
     */
    @NotNull
    Location getBedSpawnLocation();

    /**
     * Checks if this human entity is sleeping.
     * @return True if the entity is sleeping.
     */
    boolean isSleeping();

    /**
     * Gets the food level of this human entity.
     * @return The food level.
     */
    int getFoodLevel();

    /**
     * Sets the food level of this human entity.
     * @param level The new food level.
     */
    void setFoodLevel(int level);

    /**
     * Gets the saturation level of this human entity.
     * @return The saturation level.
     */
    float getSaturation();

    /**
     * Sets the saturation level of this human entity.
     * @param saturation The new saturation level.
     */
    void setSaturation(float saturation);
}

