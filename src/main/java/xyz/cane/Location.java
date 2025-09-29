package xyz.cane;

import org.jetbrains.annotations.NotNull;
import xyz.cane.world.World;

/**
 * Represents a specific location in a world, including coordinates and rotation.
 * This class is mutable.
 */
public class Location {

    private World world;
    private double x, y, z;
    private float yaw, pitch;

    public Location(@NotNull World world, double x, double y, double z) {
        this(world, x, y, z, 0, 0);
    }

    public Location(@NotNull World world, double x, double y, double z, float yaw, float pitch) {
        this.world = world;
        this.x = x;
        this.y = y;
        this.z = z;
        this.yaw = yaw;
        this.pitch = pitch;
    }

    // Getters
    @NotNull public World getWorld() { return world; }
    public double getX() { return x; }
    public double getY() { return y; }
    public double getZ() { return z; }
    public float getYaw() { return yaw; }
    public float getPitch() { return pitch; }

    // Setters
    public void setWorld(@NotNull World world) { this.world = world; }
    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }
    public void setZ(double z) { this.z = z; }
    public void setYaw(float yaw) { this.yaw = yaw; }
    public void setPitch(float pitch) { this.pitch = pitch; }

    /**
     * Gets the block at this location.
     * @return The block at this location.
     */
    @NotNull
    public xyz.cane.block.Block getBlock() {
        return world.getBlockAt(this);
    }

    // Vector Math
    @NotNull
    public Location add(double x, double y, double z) {
        this.x += x;
        this.y += y;
        this.z += z;
        return this;
    }

    @NotNull
    public Location subtract(double x, double y, double z) {
        this.x -= x;
        this.y -= y;
        this.z -= z;
        return this;
    }

    public double distance(@NotNull Location other) {
        return Math.sqrt(distanceSquared(other));
    }

    public double distanceSquared(@NotNull Location other) {
        if (other.getWorld() != this.getWorld()) {
            throw new IllegalArgumentException("Cannot measure distance between locations in different worlds.");
        }
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        double dz = this.z - other.z;
        return dx * dx + dy * dy + dz * dz;
    }

    @Override
    public String toString() {
        return "Location{" +
                "world=" + world.getName() +
                ", x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
