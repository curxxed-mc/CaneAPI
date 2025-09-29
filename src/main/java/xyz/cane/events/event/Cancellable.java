package xyz.cane.events.event;

/**
 * An interface for events that can be cancelled.
 */
public interface Cancellable {

    /**
     * Gets the cancellation state of this event.
     * An event that is cancelled will not be executed in the server,
     * but will still be passed to other plugins.
     *
     * @return true if this event is cancelled.
     */
    boolean isCancelled();

    /**
     * Sets the cancellation state of this event.
     *
     * @param cancel true if you wish to cancel this event.
     */
    void setCancelled(boolean cancel);
}
