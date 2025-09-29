package xyz.cane.events.player;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xyz.cane.events.event.PlayerEvent;
import xyz.cane.entity.Player;

/**
 * Called when a player leaves the server.
 */
public class PlayerQuitEvent extends PlayerEvent {

    private String quitMessage;

    public PlayerQuitEvent(@NotNull Player player, @NotNull String quitMessage) {
        super(player);
        this.quitMessage = quitMessage;
    }

    /**
     * Gets the quit message that will be broadcast to the server.
     * @return The quit message, or null if it is to be hidden.
     */
    @Nullable
    public String getQuitMessage() {
        return this.quitMessage;
    }

    /**
     * Sets the quit message that will be broadcast to the server.
     * Set this to null to hide the quit message entirely.
     * @param quitMessage The new quit message, or null to hide it.
     */
    public void setQuitMessage(@Nullable String quitMessage) {
        this.quitMessage = quitMessage;
    }
}
