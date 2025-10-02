package xyz.cane.entity;

/**
 * Represents a Ghast entity.
 */
public interface Ghast extends Monster {
    int getFireballStrength();
    void setAttacking(boolean attacking);
    boolean isAttacking();
}

