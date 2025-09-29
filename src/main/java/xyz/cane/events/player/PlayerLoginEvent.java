package xyz.cane.events.player;

import org.jetbrains.annotations.NotNull;
import xyz.cane.events.event.PlayerEvent;
import xyz.cane.entity.Player;
import java.net.InetAddress;

/**
 * This event is fired when a player has been authenticated and is about to join the server.
 * It allows plugins to deny entry based on server capacity, whitelist, or other conditions.
 */
public class PlayerLoginEvent extends PlayerEvent {

    public enum Result {
        ALLOWED,
        KICK_FULL,
        KICK_BANNED,
        KICK_WHITELIST,
        KICK_OTHER
    }

    private Result result = Result.ALLOWED;
    private String kickMessage = "You are not allowed to join this server.";
    private final InetAddress address;

    public PlayerLoginEvent(@NotNull Player player, @NotNull InetAddress address) {
        super(player);
        this.address = address;
    }

    @NotNull
    public InetAddress getAddress() {
        return this.address;
    }

    @NotNull
    public Result getResult() {
        return result;
    }

    public void setResult(@NotNull Result result) {
        this.result = result;
    }

    @NotNull
    public String getKickMessage() {
        return kickMessage;
    }

    public void setKickMessage(@NotNull String kickMessage) {
        this.kickMessage = kickMessage;
    }

    /**
     * Allows the player to log in.
     */
    public void allow() {
        this.result = Result.ALLOWED;
    }

    /**
     * Disallows the player from logging in with the given reason.
     * @param result The reason for the kick.
     * @param message The message to display to the player.
     */
    public void disallow(@NotNull Result result, @NotNull String message) {
        this.result = result;
        this.kickMessage = message;
    }
}
