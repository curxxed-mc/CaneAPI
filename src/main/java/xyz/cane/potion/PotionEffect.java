package xyz.cane.potion;

import org.jetbrains.annotations.NotNull;

/**
 * Represents a potion effect that can be applied to a living entity.
 */
public class PotionEffect {

    private final PotionEffectType type;
    private int duration;
    private int amplifier;
    private boolean ambient;
    private boolean particles;

    public PotionEffect(@NotNull PotionEffectType type, int duration, int amplifier, boolean ambient, boolean particles) {
        this.type = type;
        this.duration = duration;
        this.amplifier = amplifier;
        this.ambient = ambient;
        this.particles = particles;
    }

    @NotNull
    public PotionEffectType getType() {
        return type;
    }

    public int getDuration() {
        return duration;
    }

    public int getAmplifier() {
        return amplifier;
    }

    public boolean isAmbient() {
        return ambient;
    }

    public boolean hasParticles() {
        return particles;
    }
}
