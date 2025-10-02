package xyz.cane.entity;

/**
 * Represents a Zombie entity.
 */
public interface Zombie extends Monster {
    boolean isChild();
    void setChild(boolean child);
    boolean isVillager();
    void setVillager(boolean villager);
    boolean isConverting();
}

