package xyz.cane.command;

import org.jetbrains.annotations.NotNull;
import java.util.List;

/**
 * Represents a class that can provide tab-completion suggestions for a command.
 */
public interface TabCompleter {

    /**
     * Requests a list of possible completions for a command argument.
     *
     * @param sender Source of the command.
     * @param command Command which was executed.
     * @param args The arguments passed to the command.
     * @return A list of possible completions for the final argument, or null for default behavior.
     */
    List<String> onTabComplete(@NotNull CommandSender sender, @NotNull String command, @NotNull String[] args);
}