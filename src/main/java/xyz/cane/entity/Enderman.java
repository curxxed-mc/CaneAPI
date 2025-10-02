package xyz.cane.entity;

/**
 * Represents an Enderman entity.
 */
public interface Enderman extends Monster {
    boolean isScreaming();
    void setScreaming(boolean screaming);

    /**
     * Returns the held block state id (Block state id used by NMS Block.getStateById).
     */
    int getHeldBlockStateId();

    /**
     * Sets the held block state by state id (Block.getStateById).
     */
    void setHeldBlockStateId(int stateId);
}

