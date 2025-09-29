package xyz.cane;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xyz.cane.command.CommandSender;
import xyz.cane.entity.Player;
import xyz.cane.inventory.ItemStack;
import xyz.cane.logging.Logger;
import xyz.cane.scheduler.CaneScheduler;
import xyz.cane.server.Server;

/**
 * A static class providing a global entry point to the Cane API.
 * This is analogous to the Bukkit class in the Bukkit API.
 */
public final class Cane {

    private static Server server;

    /**
     * Private constructor to prevent instantiation of this utility class.
     */
    private Cane() {}

    /**
     * Gets the currently running Server instance.
     * @return The Server instance.
     * @throws IllegalStateException if the server has not been initialized yet.
     */
    @NotNull
    public static Server getServer() {
        if (server == null) {
            throw new IllegalStateException("The Cane Server has not been initialized yet!");
        }
        return server;
    }

    public static Logger getLogger() {
        return getServer().getLogger();
    }

    /**
     * Sets the server instance. This method should only be called by the server
     * implementation during startup.
     * @param server The server instance to set.
     */
    public static void setServer(@Nullable Server server) {
        if (Cane.server != null) {
            throw new UnsupportedOperationException("Cannot redefine the server instance.");
        }
        Cane.server = server;
    }

    /**
     * Gets the server's task scheduler.
     * This is a convenience method for API users.
     * @return The CaneScheduler instance.
     * @throws IllegalStateException if the server has not been initialized yet.
     */
    @NotNull
    public static CaneScheduler getScheduler() {
        return getServer().getScheduler();
    }

    /**
     * Gets the server's plugin manager.
     * @return The PluginManager instance.
     */
    @NotNull
    public static xyz.cane.plugin.PluginManager getPluginManager() {
        return getServer().getPluginManager();
    }

    /**
     * Gets a collection of all online players.
     * @return A collection of online players.
     */
    @NotNull
    public static java.util.Collection<Player> getOnlinePlayers() {
        return getServer().getOnlinePlayers();
    }

    /**
     * Gets a player by their exact name.
     * @param name The name of the player to retrieve.
     * @return The player object, or null if not found.
     */
    @Nullable
    public static Player getPlayer(@NotNull String name) {
        return getServer().getPlayer(name);
    }

    /**
     * Broadcasts a message to all online players.
     */
    public static void broadcastMessage(@NotNull String message) {
        getServer().broadcastMessage(message);
    }

    /**
     * Gets the server's MOTD.
     */
    @NotNull
    public static String getMotd() {
        return getServer().getMotd();
    }

    /**
     * Gets the server's version string.
     */
    @NotNull
    public static String getVersion() {
        return getServer().getVersion();
    }

    /**
     * Gets the server's IP address.
     */
    @NotNull
    public static String getIp() {
        return getServer().getIp();
    }

    /**
     * Gets the server's port.
     */
    public static int getPort() {
        return getServer().getPort();
    }

    /**
     * Gets the server's max player count.
     */
    public static int getMaxPlayers() {
        return getServer().getMaxPlayers();
    }

    /**
     * Gets whether the server is in online mode.
     */
    public static boolean isOnlineMode() {
        return getServer().isOnlineMode();
    }

    /**
     * Gets the console sender.
     */
    @NotNull
    public static CommandSender getConsoleSender() {
        return getServer().getConsoleSender();
    }

    /**
     * Dispatches a command as the given sender.
     */
    public static boolean dispatchCommand(@NotNull CommandSender sender, @NotNull String command) {
        return getServer().dispatchCommand(sender, command);
    }

    /**
     * Gets a player by their UUID.
     */
    @Nullable
    public static Player getPlayer(@NotNull java.util.UUID uuid) {
        return getServer().getPlayer(uuid);
    }

    /**
     * Gets the current server tick count.
     */
    public static long getTicks() {
        return getServer().getTicks();
    }

    /**
     * Gets the current server TPS (ticks per second).
     */
    public static double getTps() {
        return getServer().getTps();
    }

    /**
     * Gets the first played timestamp for a player.
     */
    public static long getFirstPlayed(@NotNull Player player) {
        return getServer().getFirstPlayed(player);
    }

    /**
     * Gets the last played timestamp for a player.
     */
    public static long getLastPlayed(@NotNull Player player) {
        return getServer().getLastPlayed(player);
    }

    /**
     * Creates a new ItemStack.
     * @param type The material of the item.
     * @param amount The amount of the item.
     * @return The new ItemStack.
     */
    @NotNull
    public static ItemStack createItemStack(@NotNull Material type, int amount) {
        return getServer().createItemStack(type, amount);
    }
}
