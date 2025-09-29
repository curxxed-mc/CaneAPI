package xyz.cane.scheduler;

import org.jetbrains.annotations.NotNull;
import xyz.cane.plugin.CanePlugin;

/**
 * Represents a task being executed by the scheduler.
 */
public interface CaneTask {

    /**
     * Gets the plugin that owns this task.
     * @return The owning plugin.
     */
    @NotNull
    CanePlugin getOwner();

    /**
     * Returns true if the task is being run synchronously on the main server thread.
     * @return true if the task is synchronous.
     */
    boolean isSync();

    /**
     * Returns true if the task has been cancelled.
     * @return true if the task is cancelled.
     */
    boolean isCancelled();

    /**
     * Attempts to cancel this task.
     */
    void cancel();
}
