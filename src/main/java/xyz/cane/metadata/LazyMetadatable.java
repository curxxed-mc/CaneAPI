package xyz.cane.metadata;

/**
 * The LazyMetadatable interface is a marker interface for all objects that
 * may have their metadata cleared at any time.
 * <p>
 * This interface is used for all objects that have a lifespan shorter than
 * the server's lifespan, such as Entities.
 */
public interface LazyMetadatable extends Metadatable {
}
