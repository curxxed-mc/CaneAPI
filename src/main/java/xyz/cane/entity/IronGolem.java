package xyz.cane.entity;

/**
 * Represents an Iron Golem entity.
 */
public interface IronGolem extends Monster {
    boolean isPlayerCreated();
    void setPlayerCreated(boolean created);
    void setHoldingRose(boolean holding);
    int getHoldRoseTick();
}

