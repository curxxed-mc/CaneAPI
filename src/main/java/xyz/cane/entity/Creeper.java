package xyz.cane.entity;

/**
 * Represents a Creeper entity.
 */
public interface Creeper extends Monster {
    boolean isPowered();
    void setPowered(boolean powered);
    boolean hasIgnited();
    void ignite();
    int getCreeperState();
    void setCreeperState(int state);
}

