package xyz.cane.scheduler;

import org.jetbrains.annotations.NotNull;
import xyz.cane.plugin.CanePlugin;

/**
 * An interface for the server's task scheduler.
 */
public interface CaneScheduler {

    /**
     * Schedules a task to be run on the next server tick.
     *
     * @param plugin The plugin that owns the task.
     * @param task The task to be executed.
     * @return A CaneTask object representing the scheduled task.
     */
    @NotNull
    CaneTask runTask(@NotNull CanePlugin plugin, @NotNull Runnable task);

    /**
     * Schedules a task to be run asynchronously on a separate thread.
     *
     * @param plugin The plugin that owns the task.
     * @param task The task to be executed.
     * @return A CaneTask object representing the scheduled task.
     */
    @NotNull
    CaneTask runTaskAsynchronously(@NotNull CanePlugin plugin, @NotNull Runnable task);

    @NotNull
    CaneTask runTaskAsynchronouslyLater(@NotNull CanePlugin plugin, @NotNull Runnable task, long delay);

    /**
     * Schedules a task to be run after a specified delay.
     *
     * @param plugin The plugin that owns the task.
     * @param task The task to be executed.
     * @param delay The delay in server ticks.
     * @return A CaneTask object representing the scheduled task.
     */
    @NotNull
    CaneTask runTaskLater(@NotNull CanePlugin plugin, @NotNull Runnable task, long delay);

    /**
     * Schedules a repeating task.
     *
     * @param plugin The plugin that owns the task.
     * @param task The task to be executed.
     * @param delay The initial delay in server ticks.
     * @param period The period in server ticks between executions.
     * @return A CaneTask object representing the scheduled task.
     */
    @NotNull
    CaneTask runTaskTimer(@NotNull CanePlugin plugin, @NotNull Runnable task, long delay, long period);

}
