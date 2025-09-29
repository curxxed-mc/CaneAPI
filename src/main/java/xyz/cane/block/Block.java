package xyz.cane.block;

import org.jetbrains.annotations.NotNull;
import xyz.cane.Location;
import xyz.cane.Material;
import xyz.cane.world.Chunk;
import xyz.cane.world.World;

/**
 * Represents a block in a world.
 */
public interface Block {

    /**
     * Gets the location of this block.
     * @return The block's location.
     */
    @NotNull
    Location getLocation();

    /**
     * Gets the world this block is in.
     * @return The world.
     */
    @NotNull
    World getWorld();

    /**
     * Gets the chunk this block is in.
     * @return The chunk.
     */
    @NotNull
    Chunk getChunk();

    /**
     * Gets the material type of this block.
     * @return The material.
     */
    @NotNull
    Material getType();

    /**
     * Sets the material type of this block.
     * @param material The new material.
     */
    void setType(@NotNull Material material);

    /**
     * Gets the metadata of this block.
     * @return The metadata value (0-15).
     */
    byte getData();

    /**
     * Sets the metadata of this block.
     * @param data The new metadata value (0-15).
     */
    void setData(byte data);

    /**
     * Gets the X-coordinate of this block.
     * @return The X-coordinate.
     */
    int getX();

    /**
     * Gets the Y-coordinate of this block.
     * @return The Y-coordinate.
     */
    int getY();

    /**
     * Gets the Z-coordinate of this block.
     * @return The Z-coordinate.
     */
    int getZ();
}
