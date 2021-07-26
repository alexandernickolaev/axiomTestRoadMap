package container.impl;

import container.RoadMap;
import entity.City;
import entity.Road;
import exception.DuplicatedRoadException;
import util.Pair;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class RoadMapImpl extends ConcurrentHashMap<City, Pair<Road>> implements RoadMap {

    public RoadMapImpl() {}

    public boolean addCity(City city) {
        this.put(city, new Pair<>());
        return this.containsKey(city);
    }

    public void addLeftRoadToCity(City city, Road road) {
        if (road != null && road.equals(this.get(city).getRight())) {
            throw new DuplicatedRoadException();
        }
        this.get(city).setLeft(road);
    }

    public void addRightRoadToCity(City city, Road road) {
        if (road != null && road.equals(this.get(city).getLeft())) {
            throw new DuplicatedRoadException();
        }
        this.get(city).setRight(road);
    }

    public void removeRoad(Road road) {
        for (Pair<Road> pair : this.values()) {
            pair.remove(road);
        }
    }

    public City getCityByName(String name) {
        if (name == null) {
            return null;
        }
        return this.keySet().stream()
                .filter(city -> name.equals(city.getName()))
                .findFirst()
                .orElse(null);
    }

    public Set<Road> getRoadsByCityName(String name) {
        if (name == null) {
            return null;
        }
        Pair<Road> pair = this.get(this.getCityByName(name));
        return Set.of(pair.getLeft(), pair.getRight());
    }
}
