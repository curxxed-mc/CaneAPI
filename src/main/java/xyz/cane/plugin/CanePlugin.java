package xyz.cane.plugin;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xyz.cane.command.CommandExecutor;
import xyz.cane.events.event.Listener;
import xyz.cane.logging.Logger;
import xyz.cane.server.Server;

/**
 * The base class for any Cane plugin.
 */
public abstract class CanePlugin {

    private Server server;
    private Logger logger;
    private PluginBootstrap bootstrapper;

    /**
     * Called when the plugin is enabled.
     */
    public abstract void onEnable();

    /**
     * Called when the plugin is disabled.
     */
    public abstract void onDisable();

    /**
     * Gets the logger specifically for this plugin.
     * @return The plugin's logger.
     */
    @NotNull
    public final Logger getLogger() {
        return this.logger;
    }

    /**
     * Gets the main Server instance.
     * @return The Server instance.
     */
    @NotNull
    public final Server getServer() {
        return this.server;
    }

    /**
     * Gets the server's PluginManager.
     * This is a convenience method, equivalent to getServer().getPluginManager().
     * @return The server's PluginManager.
     */
    @NotNull
    public final PluginManager getPluginManager() {
        return this.server.getPluginManager();
    }

    /**
     * Registers all event handlers in a given listener class.
     * @param listener The listener to register.
     */
    public final void registerEvents(@NotNull Listener listener) {
        getPluginManager().registerEvents(listener, this);
    }

    /**
     * Registers a command for this plugin.
     * @param name The name of the command.
     * @param executor The class that will handle the command's logic.
     */
    public final void registerCommand(@NotNull String name, @NotNull CommandExecutor executor, @Nullable String permission, @Nullable String permissionMessage) {
        getPluginManager().registerCommand(this, name, executor, permission, permissionMessage);
    }

    /**
     * This method is used by the PluginManager to initialize the plugin.
     * It should not be called by plugins.
     * @param server The Server instance.
     * @param logger The logger to inject.
     */
    public final void init(@NotNull Server server, @NotNull Logger logger) {
        if (this.server != null || this.logger != null) {
            throw new IllegalStateException("Plugin is already initialized.");
        }
        this.server = server;
        this.logger = logger;
    }

    /**
     * Gets the bootstrapper for this plugin.
     * @return The plugin's bootstrapper.
     */
    @Nullable
    public PluginBootstrap getBootstrapper() {
        return this.bootstrapper;
    }

    /**
     * Sets the bootstrapper for this plugin.
     * @param bootstrapper The bootstrapper instance.
     */
    public void setBootstrapper(@Nullable PluginBootstrap bootstrapper) {
        this.bootstrapper = bootstrapper;
    }
}
