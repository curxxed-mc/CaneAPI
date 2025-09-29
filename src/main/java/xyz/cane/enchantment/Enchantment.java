package xyz.cane.enchantment;


import org.jetbrains.annotations.NotNull;

/**
 * Represents an enchantment that can be applied to items
 */
public record Enchantment(String id, String name, int minLevel, int maxLevel, String description) {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Enchantment that = (Enchantment) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public @NotNull String toString() {
        return "Enchantment{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", minLevel=" + minLevel +
                ", maxLevel=" + maxLevel +
                ", description='" + description + '\'' +
                '}';
    }
}
