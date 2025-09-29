package xyz.cane.potion;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents a type of potion effect.
 */
public class PotionEffectType {

    private static final Map<Integer, PotionEffectType> byId = new HashMap<>();

    // Vanilla Potion Effects
    public static final PotionEffectType SPEED = new PotionEffectType(1, "speed");
    public static final PotionEffectType SLOW = new PotionEffectType(2, "slowness");
    public static final PotionEffectType FAST_DIGGING = new PotionEffectType(3, "haste");
    public static final PotionEffectType SLOW_DIGGING = new PotionEffectType(4, "mining_fatigue");
    public static final PotionEffectType INCREASE_DAMAGE = new PotionEffectType(5, "strength");
    public static final PotionEffectType HEAL = new PotionEffectType(6, "instant_health");
    public static final PotionEffectType HARM = new PotionEffectType(7, "instant_damage");
    public static final PotionEffectType JUMP = new PotionEffectType(8, "jump_boost");
    public static final PotionEffectType CONFUSION = new PotionEffectType(9, "nausea");
    public static final PotionEffectType REGENERATION = new PotionEffectType(10, "regeneration");
    public static final PotionEffectType DAMAGE_RESISTANCE = new PotionEffectType(11, "resistance");
    public static final PotionEffectType FIRE_RESISTANCE = new PotionEffectType(12, "fire_resistance");
    public static final PotionEffectType WATER_BREATHING = new PotionEffectType(13, "water_breathing");
    public static final PotionEffectType INVISIBILITY = new PotionEffectType(14, "invisibility");
    public static final PotionEffectType BLINDNESS = new PotionEffectType(15, "blindness");
    public static final PotionEffectType NIGHT_VISION = new PotionEffectType(16, "night_vision");
    public static final PotionEffectType HUNGER = new PotionEffectType(17, "hunger");
    public static final PotionEffectType WEAKNESS = new PotionEffectType(18, "weakness");
    public static final PotionEffectType POISON = new PotionEffectType(19, "poison");
    public static final PotionEffectType WITHER = new PotionEffectType(20, "wither");
    public static final PotionEffectType HEALTH_BOOST = new PotionEffectType(21, "health_boost");
    public static final PotionEffectType ABSORPTION = new PotionEffectType(22, "absorption");
    public static final PotionEffectType SATURATION = new PotionEffectType(23, "saturation");

    private final int id;
    private final String name;

    public PotionEffectType(int id, @NotNull String name) {
        this.id = id;
        this.name = name;
        byId.put(id, this); // Register the new type
    }

    public int getId() {
        return id;
    }

    @NotNull
    public String getName() {
        return name;
    }

    @Nullable
    public static PotionEffectType getById(int id) {
        return byId.get(id);
    }
}
