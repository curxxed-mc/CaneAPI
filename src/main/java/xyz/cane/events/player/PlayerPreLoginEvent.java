package xyz.cane.events.player;

import org.jetbrains.annotations.NotNull;
import xyz.cane.events.event.Event;
import java.net.InetAddress;

/**
 * This event is fired asynchronously, before the player has been fully authenticated.
 * It is the first opportunity for plugins to deny a connection.
 * As this is asynchronous, plugins should not modify any main-thread-only data.
 */
public class PlayerPreLoginEvent extends Event {

    public enum Result {
        ALLOWED,
        KICK_BANNED,
        KICK_OTHER
    }

    private Result result = Result.ALLOWED;
    private String kickMessage = "You are not allowed to join this server.";
    private final String name;
    private final InetAddress ipAddress;

    public PlayerPreLoginEvent(@NotNull String name, @NotNull InetAddress ipAddress) {
        this.name = name;
        this.ipAddress = ipAddress;
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
     * @param message The message to display to the player.
     */
    public void disallow(@NotNull Result result, @NotNull String message) {
        this.result = result;
        this.kickMessage = message;
    }

    @NotNull
    public String getName() {
        return this.name;
    }

    @NotNull
    public InetAddress getIpAddress() {
        return this.ipAddress;
    }
}

