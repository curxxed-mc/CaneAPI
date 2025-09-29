package xyz.cane.world;

import org.jetbrains.annotations.NotNull;
import xyz.cane.Material;

/**
 * Represents a chunk in a world.
 */
public interface Chunk {

    /**
     * Gets the X-coordinate of this chunk.
     * @return The chunk's X-coordinate.
     */
    int getX();

    /**
     * Gets the Z-coordinate of this chunk.
     * @return The chunk's Z-coordinate.
     */
    int getZ();

    /**
     * Gets the world that this chunk belongs to.
     * @return The World object.
     */
    @NotNull
    World getWorld();

    /**
     * Gets the material of the block at the specified coordinates within this chunk.
     *
     * @param x The X-coordinate relative to the chunk (0-15).
     * @param y The Y-coordinate (0-255).
     * @param z The Z-coordinate relative to the chunk (0-15).
     * @return The Material of the block.
     */
    @NotNull
    Material getBlockType(int x, int y, int z);

    /**
     * Gets the highest solid block at the given coordinates within this chunk.
     *
     * @param x The X-coordinate relative to the chunk (0-15).
     * @param z The Z-coordinate relative to the chunk (0-15).
     * @return The Y-coordinate of the highest solid block.
     */
    int getHighestYAt(int x, int z);
}
