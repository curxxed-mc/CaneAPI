package xyz.cane.events.player;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xyz.cane.events.event.PlayerEvent;
import xyz.cane.entity.Player;

/**
 * Called when a player joins the server.
 */
public class PlayerJoinEvent extends PlayerEvent {

    private String joinMessage;
    private boolean handled = false;

    public PlayerJoinEvent(@NotNull Player player, @NotNull String joinMessage) {
        super(player);
        this.joinMessage = joinMessage;
    }

    /**
     * Gets the join message that will be broadcast to the server.
     * @return The join message, or null if it is to be hidden.
     */
    @Nullable
    public String getJoinMessage() {
        return this.joinMessage;
    }

    /**
     * Sets the join message that will be broadcast to the server.
     * Set this to null to hide the join message entirely.
     * @param joinMessage The new join message, or null to hide it.
     * @param handled Whether this message has been handled (sent) by the plugin
     */
    public void setJoinMessage(@Nullable String joinMessage, boolean handled) {
        this.joinMessage = joinMessage;
        this.handled = handled;
    }

    /**
     * Sets the join message that will be broadcast to the server.
     * Set this to null to hide the join message entirely.
     * Does not mark the message as handled.
     * @param joinMessage The new join message, or null to hide it.
     */
    public void setJoinMessage(@Nullable String joinMessage) {
        this.joinMessage = joinMessage;
    }

    /**
     * Returns true if a plugin has handled sending this join message.
     * @return true if the message has been handled
     */
    public boolean isHandled() {
        return this.handled;
    }

    /**
     * Mark this join message as handled by a plugin.
     * @param handled true if the plugin has sent the message
     */
    public void setHandled(boolean handled) {
        this.handled = handled;
    }
}
