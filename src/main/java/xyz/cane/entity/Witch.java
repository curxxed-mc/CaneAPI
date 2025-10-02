package xyz.cane.entity;

/**
 * Represents a Witch entity.
 */
public interface Witch extends Monster {
    boolean isAggressive();
    void setAggressive(boolean aggressive);
}

