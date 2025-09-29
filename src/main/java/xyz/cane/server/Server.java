package xyz.cane.server;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xyz.cane.command.CommandSender;
import xyz.cane.entity.Player;
import xyz.cane.inventory.ItemStack;
import xyz.cane.logging.Logger;
import xyz.cane.Material;
import xyz.cane.plugin.PluginManager;
import xyz.cane.scheduler.CaneScheduler;
import xyz.cane.world.World;

import java.util.Collection;
import java.util.UUID;

/**
 * An interface representing the server.
 */
public interface Server {

    @NotNull
    PluginManager getPluginManager();

    /**
     * Gets a collection of all online players.
     * @return A collection of online players.
     */
    @NotNull
    Collection<Player> getOnlinePlayers();

    /**
     * Gets a player by their exact name.
     * @param name The name of the player to retrieve.
     * @return The player object, or null if not found.
     */
    @Nullable
    Player getPlayer(@NotNull String name);

    /**
     * Gets the server's task scheduler.
     * @return The CaneScheduler instance.
     */
    @NotNull
    CaneScheduler getScheduler();

    /**
     * Gets a collection of all loaded worlds.
     * @return A collection of worlds.
     */
    @NotNull
    Collection<World> getWorlds();

    /**
     * Gets a world by its exact name.
     * @param name The name of the world to retrieve.
     * @return The World object, or null if not found.
     */
    @Nullable
    World getWorld(@NotNull String name);

    /**
     * Broadcasts a message to all online players.
     */
    void broadcastMessage(@NotNull String message);

    /**
     * Gets the server's MOTD.
     */
    @NotNull
    String getMotd();

    /**
     * Gets the server's version string.
     */
    @NotNull
    String getVersion();

    /**
     * Gets the server's IP address.
     */
    @NotNull
    String getIp();

    /**
     * Gets the server's port.
     */
    int getPort();

    /**
     * Gets the server's max player count.
     */
    int getMaxPlayers();

    /**
     * Gets whether the server is in online mode.
     */
    boolean isOnlineMode();

    /**
     * Gets the console sender.
     */
    @NotNull
    CommandSender getConsoleSender();

    /**
     * Dispatches a command as the given sender.
     */
    boolean dispatchCommand(@NotNull CommandSender sender, @NotNull String command);

    /**
     * Gets a player by their UUID.
     */
    @Nullable
    Player getPlayer(@NotNull UUID uuid);

    /**
     * Gets the current server tick count.
     */
    long getTicks();

    /**
     * Gets the current server TPS (ticks per second).
     */
    double getTps();

    /**
     * Gets the first played timestamp for a player.
     */
    long getFirstPlayed(@NotNull Player player);

    /**
     * Gets the last played timestamp for a player.
     */
    long getLastPlayed(@NotNull Player player);

    /**
     * Shuts down the server.
     */
    void shutdown();

    /**
     * Reloads the server, including plugins and configuration.
     */
    void reload();

    Logger getLogger();

    /**
     * Creates a new ItemStack.
     * @param type The material of the item.
     * @param amount The amount of the item.
     * @return The new ItemStack.
     */
    @NotNull
    ItemStack createItemStack(@NotNull Material type, int amount);
}
