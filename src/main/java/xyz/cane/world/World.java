package xyz.cane.world;

import org.jetbrains.annotations.NotNull;
import xyz.cane.Location;
import xyz.cane.Material;
import xyz.cane.block.Block;
import xyz.cane.entity.Entity;
import xyz.cane.entity.Player;

import java.util.Collection;
import java.util.UUID;

/**
 * Represents a world on the server.
 */
public interface World {

    /**
     * Gets the name of this world.
     * @return The world's name.
     */
    @NotNull
    String getName();

    /**
     * Gets the unique identifier of this world.
     * @return The world's UUID.
     */
    @NotNull
    UUID getUID();

    /**
     * Gets the chunk at the specified chunk coordinates.
     * @param x The X-coordinate of the chunk.
     * @param z The Z-coordinate of the chunk.
     * @return The Chunk object.
     */
    @NotNull
    Chunk getChunkAt(int x, int z);

    /**
     * Gets the block at the given location.
     * @param location The location of the block.
     * @return The Block at the specified location.
     */
    @NotNull
    Block getBlockAt(@NotNull Location location);

    /**
     * Gets the material of the block at the specified coordinates.
     * This is more efficient than getting the full Block object.
     *
     * @param x The X-coordinate of the block.
     * @param y The Y-coordinate of the block.
     * @param z The Z-coordinate of the block.
     * @return The Material of the block.
     */
    @NotNull
    Material getBlockType(int x, int y, int z);

    /**
     * Gets the highest solid block at the given coordinates.
     *
     * @param x The X-coordinate.
     * @param z The Z-coordinate.
     * @return The Y-coordinate of the highest solid block.
     */
    int getHighestYAt(int x, int z);

    /**
     * Gets the sea level for this world.
     *
     * @return The sea level.
     */
    int getSeaLevel();

    /**
     * Gets the current time of this world.
     *
     * @return The world time.
     */
    long getTime();

    /**
     * Sets the time of this world.
     *
     * @param time The new world time.
     */
    void setTime(long time);

    /**
     * Gets a collection of all loaded chunks in this world.
     *
     * @return A collection of loaded chunks.
     */
    @NotNull
    Collection<Chunk> getLoadedChunks();

    /**
     * Gets a collection of all entities in this world.
     * @return A collection of entities.
     */
    @NotNull
    Collection<Entity> getEntities();

    /**
     * Gets a collection of all players in this world.
     * @return A collection of players.
     */
    @NotNull
    Collection<Player> getPlayers();
}
