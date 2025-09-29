package xyz.cane.events.player;

import org.jetbrains.annotations.NotNull;
import xyz.cane.events.event.Cancellable;
import xyz.cane.events.event.PlayerEvent;
import xyz.cane.entity.Player;

/**
 * Called when a player attempts to send a chat message.
 * This event can be fired synchronously or asynchronously.
 */
public class PlayerChatEvent extends PlayerEvent implements Cancellable {

    private String message;
    private boolean cancelled = false;
    private final boolean isAsync;

    /**
     * Creates a new, synchronous PlayerChatEvent.
     */
    public PlayerChatEvent(@NotNull Player player, @NotNull String message) {
        this(player, message, false);
    }

    /**
     * Creates a PlayerChatEvent with a specified async flag.
     * @param isAsync true if the event is being fired asynchronously.
     */
    public PlayerChatEvent(@NotNull Player player, @NotNull String message, boolean isAsync) {
        super(player);
        this.message = message;
        this.isAsync = isAsync;
    }

    /**
     * Gets the message that the player is trying to send.
     * @return The chat message.
     */
    @NotNull
    public String getMessage() {
        return this.message;
    }

    /**
     * Sets the message that will be sent to the server.
     * @param message The new message.
     */
    public void setMessage(@NotNull String message) {
        this.message = message;
    }

    /**
     * Returns whether this event is being processed asynchronously.
     * @return true if the event is async.
     */
    public final boolean isAsynchronous() {
        return this.isAsync;
    }

    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }
}
