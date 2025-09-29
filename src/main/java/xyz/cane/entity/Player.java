package xyz.cane.entity;

import org.jetbrains.annotations.NotNull;
import xyz.cane.Location;
import xyz.cane.command.CommandSender;
import xyz.cane.inventory.ItemStack;
import xyz.cane.inventory.PlayerInventory;
import xyz.cane.metadata.Metadatable;

import java.util.UUID;

/**
 * Represents a Player on the server.
 * This interface provides a stable API, independent of the underlying server implementation.
 */
public interface Player extends HumanEntity, CommandSender, Metadatable {

    /**
     * Gets the unique and persistent identifier for this player.
     * @return The player's non-null UUID.
     */
    @NotNull
    UUID getUniqueId();

    /**
     * Sends a chat message to this player.
     * @param message The non-null message to send.
     */
    void sendMessage(@NotNull String message);

    /**
     * Checks if this player has the specified permission.
     * @param permission The permission node to check.
     * @return true if the player has the permission, otherwise false.
     */
    boolean hasPermission(@NotNull String permission);

    /**
     * Adds a permission to this player.
     * @param permission The permission node to add.
     * @param value true for granted, false for revoked.
     */
    void addPermission(@NotNull String permission, boolean value);

    /**
     * Checks if this player is an operator.
     * @return true if the player is an operator.
     */
    boolean isOp();

    /**
     * Sets the operator status of this player.
     * @param value true to make the player an operator, false otherwise.
     */
    void setOp(boolean value);

    /**
     * Gets the item stack the player is currently holding.
     * @return The held ItemStack, or null if empty.
     */
    @NotNull
    ItemStack getHeldItem();

    /**
     * Gets the player's current experience progress (0.0-1.0).
     */
    float getExp();

    /**
     * Sets the player's experience progress (0.0-1.0).
     */
    void setExp(float exp);

    /**
     * Gets the player's current level.
     */
    int getLevel();

    /**
     * Sets the player's level.
     */
    void setLevel(int level);

    /**
     * Gets the player's display name.
     */
    @NotNull
    String getDisplayName();

    /**
     * Sets the player's display name.
     */
    void setDisplayName(@NotNull String name);

    /**
     * Gets the player's ping.
     */
    int getPing();

    /**
     * Gets the player's IP address as a string.
     */
    @NotNull
    String getAddress();

    /**
     * Gets whether the player is currently online.
     */
    boolean isOnline();

    /**
     * Gets whether the player is sneaking.
     */
    boolean isSneaking();

    /**
     * Gets whether the player is sprinting.
     */
    boolean isSprinting();

    void teleport(@NotNull Location location);

    @NotNull
    PlayerInventory getInventory();

    Object getEnderChest();

    void setBedSpawnLocation(Location location);

    /**
     * Kicks the player from the server with a specific reason.
     *
     * @param reason The reason for kicking the player.
     */
    void kick(@NotNull String reason);

    /**
     * Bans the player from the server.
     *
     * @param reason The reason for the ban.
     */
    void ban(@NotNull String reason);

    /**
     * Unbans the player from the server.
     */
    void unban();

    /**
     * Checks if the player is banned.
     *
     * @return True if the player is banned, false otherwise.
     */
    boolean isBanned();

    /**
     * Closes the player's currently open inventory window.
     */
    void closeInventory();

    /**
     * Plays a sound at the player's location.
     *
     * @param sound  The sound to play.
     * @param volume The volume of the sound.
     * @param pitch  The pitch of the sound.
     */
    void playSound(@NotNull String sound, float volume, float pitch);


    /**
     * Resets the title displayed to the player.
     */
    void resetTitle();

    /**
     * Sends a title to the player.
     *
     * @param title    The main title text.
     * @param subtitle The subtitle text.
     * @param fadeIn   The time in ticks for the title to fade in.
     * @param stay     The time in ticks for the title to stay on screen.
     * @param fadeOut  The time in ticks for the title to fade out.
     */
    void sendTitle(@NotNull String title, @NotNull String subtitle, int fadeIn, int stay, int fadeOut);

    /**
     * Sends a message to the player's action bar.
     *
     * @param message The message to send.
     */
    void sendActionBar(@NotNull String message);

    /**
     * Sets whether the player is currently flying.
     *
     * @param flying True to make the player fly, false to stop.
     */
    void setFlying(boolean flying);

    /**
     * Checks if the player is currently flying.
     *
     * @return True if the player is flying, false otherwise.
     */
    boolean isFlying();

    /**
     * Sets whether the player is allowed to fly.
     *
     * @param allow True to allow flight, false to disallow.
     */
    void setAllowFlight(boolean allow);

    /**
     * Checks if the player is allowed to fly.
     *
     * @return True if flight is allowed, false otherwise.
     */
    boolean getAllowFlight();

    /**
     * Sets the player's flight speed.
     *
     * @param speed The new flight speed.
     */
    void setFlySpeed(float speed);

    /**
     * Gets the player's current flight speed.
     *
     * @return The current flight speed.
     */
    float getFlySpeed();

    /**
     * Sets the player's walking speed.
     *
     * @param speed The new walking speed.
     */
    void setWalkSpeed(float speed);

    /**
     * Gets the player's current walking speed.
     *
     * @return The current walking speed.
     */
    float getWalkSpeed();
}
