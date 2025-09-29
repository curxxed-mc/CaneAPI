package xyz.cane.plugin;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xyz.cane.command.CommandExecutor;
import xyz.cane.events.event.Event;
import xyz.cane.events.event.Listener;
import java.util.List;

/**
 * An interface for managing plugins and the event system.
 */
public interface PluginManager {

    /**
     * Registers all event handlers in a given listener class.
     * @param listener The listener to register.
     * @param plugin The plugin that owns this listener.
     */
    void registerEvents(@NotNull Listener listener, @NotNull CanePlugin plugin);

    /**
     * Calls an event and notifies all registered listeners.
     * @param event The event to call.
     */
    void callEvent(@NotNull Event event);

    /**
     * Gets an unmodifiable list of all loaded plugins.
     * @return List of currently loaded plugins
     */
    @NotNull List<CanePlugin> getPlugins();

    /**
     * Registers a command.
     * @param plugin The plugin that owns this command.
     * @param name The name of the command.
     * @param executor The executor for this command.
     * @param permission The permission node required to use this command, or null.
     * @param permissionMessage The message to send if the user lacks permission.
     */
    void registerCommand(@NotNull CanePlugin plugin, @NotNull String name, @NotNull CommandExecutor executor, @Nullable String permission, @Nullable String permissionMessage);
}
