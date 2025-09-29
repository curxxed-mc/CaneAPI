package xyz.cane.command;

import org.jetbrains.annotations.NotNull;
import xyz.cane.permissions.Permissible;

/**
 * Represents a command sender, which can also have permissions.
 */
public interface CommandSender extends Permissible {

    /**
     * Gets the name of this command sender.
     * @return The sender's name.
     */
    @NotNull
    String getName();

    /**
     * Sends a message to this command sender.
     * @param message The message to send.
     */
    void sendMessage(@NotNull String message);
}
