package xyz.cane.events.world;

import org.jetbrains.annotations.NotNull;
import xyz.cane.events.event.Event;
import xyz.cane.world.Chunk;

/**
 * Called when a chunk is loaded.
 */
public class ChunkLoadEvent extends Event {
    private final Chunk chunk;

    public ChunkLoadEvent(@NotNull Chunk chunk) {
        this.chunk = chunk;
    }

    @NotNull
    public Chunk getChunk() {
        return chunk;
    }
}

