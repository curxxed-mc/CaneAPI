package xyz.cane.events.world;

import org.jetbrains.annotations.NotNull;
import xyz.cane.events.event.Event;
import xyz.cane.world.Chunk;

/**
 * Called when a chunk is about to be unloaded.
 */
public class ChunkUnloadEvent extends Event {
    private final Chunk chunk;

    public ChunkUnloadEvent(@NotNull Chunk chunk) {
        this.chunk = chunk;
    }

    @NotNull
    public Chunk getChunk() {
        return chunk;
    }
}

