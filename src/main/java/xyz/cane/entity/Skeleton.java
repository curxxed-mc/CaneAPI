package xyz.cane.entity;

/**
 * Represents a Skeleton entity.
 */
public interface Skeleton extends Monster {
    /**
     * Returns true if this skeleton is a wither skeleton variant.
     */
    boolean isWitherSkeleton();

    /**
     * Sets whether this skeleton is a wither skeleton variant.
     */
    void setWitherSkeleton(boolean wither);

    /**
     * Returns true if this skeleton is a stray (snow variant).
     */
    boolean isStray();

    /**
     * Sets whether this skeleton is a stray.
     */
    void setStray(boolean stray);
}

