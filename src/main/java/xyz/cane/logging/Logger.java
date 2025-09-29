package xyz.cane.logging;

import org.jetbrains.annotations.NotNull;

/**
 * A simple logger interface for plugins to use.
 */
public interface Logger {

    /**
     * Logs a debug message.
     * @param message The message to log.
     */
    void debug(@NotNull String message);

    /**
     * Logs an informational message.
     * @param message The message to log.
     */
    void info(@NotNull String message);

    /**
     * Logs a warning message.
     * @param message The message to log.
     */
    void warn(@NotNull String message);

    /**
     * Logs an error message.
     * @param message The message to log.
     */
    void error(@NotNull String message);

    /**
     * Logs an error message along with a throwable's stack trace.
     * @param message The message to log.
     * @param throwable The throwable to log.
     */
    void error(@NotNull String message, @NotNull Throwable throwable);

    /**
     * Logs a fatal error message.
     * @param message The message to log.
     */
    void fatal(@NotNull String message);

    /**
     * Logs a fatal error message along with a throwable's stack trace.
     * @param message The message to log.
     * @param throwable The throwable to log.
     */
    void fatal(@NotNull String message, @NotNull Throwable throwable);
}
