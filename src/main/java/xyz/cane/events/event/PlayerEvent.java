package xyz.cane.events.event;

import xyz.cane.entity.Player;

/**
 * A base class for any event involving a player.
 */
public abstract class PlayerEvent extends Event {

    protected Player player;

    public PlayerEvent(Player player) {
        this.player = player;
    }

    /**
     * Gets the player involved in this event.
     * @return The Player object.
     */
    public Player getPlayer() {
        return this.player;
    }
}
