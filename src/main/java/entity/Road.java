package entity;

import java.util.Objects;

public class Road {

    /**
     * Road name
     */
    private String name;

    /**
     * Road length in meters
     */
    private int length;

    public Road() {
    }

    public Road(String name, int length) {
        this.name = name;
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Road road = (Road) o;
        return name.equals(road.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
