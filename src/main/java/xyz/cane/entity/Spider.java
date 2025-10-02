package xyz.cane.entity;

/**
 * Represents a Spider entity.
 */
public interface Spider extends Monster {
    /**
     * Returns true if the spider is beside a climbable block (can climb like ladder).
     */
    boolean isClimbing();

    /**
     * Sets whether the spider is considered beside a climbable block.
     */
    void setClimbing(boolean climbing);
}

