package xyz.cane.entity;

import org.jetbrains.annotations.NotNull;
import xyz.cane.Location;
import xyz.cane.metadata.LazyMetadatable;
import xyz.cane.util.Vector;
import xyz.cane.world.World;

import java.util.UUID;

/**
 * Represents a generic entity in the world.
 */
public interface Entity extends LazyMetadatable {

    /**
     * Gets the location of this entity.
     * @return The entity's current location.
     */
    @NotNull
    Location getLocation();

    /**
     * Teleports this entity to the given location.
     * @param location The new location for the entity.
     */
    void teleport(@NotNull Location location);

    /**
     * Gets the velocity of this entity as a Vector.
     * @return The entity's velocity vector.
     */
    @NotNull
    Vector getVelocityVector();

    /**
     * Sets the velocity of this entity using a Vector.
     * @param velocity The new velocity vector.
     */
    void setVelocityVector(@NotNull Vector velocity);

    /**
     * Gets the world this entity is in.
     * @return The world.
     */
    @NotNull
    World getWorld();

    /**
     * Checks if this entity is on the ground.
     * @return True if on the ground.
     */
    boolean isOnGround();

    /**
     * Checks if this entity is dead.
     * @return True if dead.
     */
    boolean isDead();

    /**
     * Removes this entity from the world.
     */
    void remove();

    /**
     * Gets the unique ID of this entity.
     * @return The UUID.
     */
    @NotNull
    UUID getUniqueId();
}
