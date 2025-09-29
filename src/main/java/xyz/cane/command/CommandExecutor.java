package xyz.cane.command;

import org.jetbrains.annotations.NotNull;

/**
 * Represents a class which executes a command.
 */
public interface CommandExecutor {

    /**
     * Executes the given command, returning its success.
     *
     * @param sender  Source of the command.
     * @param command Command which was executed.
     * @param args    The arguments passed to the command.
     * @return true if a valid command, otherwise false.
     */
    boolean onCommand(@NotNull CommandSender sender, @NotNull String command, @NotNull String[] args);
}