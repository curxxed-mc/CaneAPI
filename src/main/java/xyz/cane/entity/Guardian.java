package xyz.cane.entity;

/**
 * Represents a Guardian entity.
 */
public interface Guardian extends Monster {
    boolean isElder();
    void setElder(boolean elder);
    boolean hasTargetedEntity();
    LivingEntity getTargetedEntity();
}

