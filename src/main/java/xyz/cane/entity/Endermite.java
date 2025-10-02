package xyz.cane.entity;

/**
 * Represents an Endermite entity.
 */
public interface Endermite extends Monster {
    boolean isSpawnedByPlayer();
    void setSpawnedByPlayer(boolean spawned);
}

