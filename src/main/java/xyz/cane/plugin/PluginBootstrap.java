package xyz.cane.plugin;

import xyz.cane.server.Server;
import xyz.cane.logging.Logger;

/**
 * Interface for plugin bootstrappers, allowing custom plugin initialization.
 */
public interface PluginBootstrap {
    /**
     * Bootstrap and initialize the plugin instance.
     * @param server The server instance.
     * @param logger The plugin logger.
     * @param args Optional arguments for plugin construction.
     * @return The initialized CanePlugin instance.
     */
    CanePlugin bootstrap(Server server, Logger logger, Object... args);
}

