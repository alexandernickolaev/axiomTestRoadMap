package container;

import entity.City;
import entity.Road;
import exception.DuplicatedRoadException;

import java.util.Set;

public interface RoadMap {

    /**
     * adds new city with empty road pair
     * @param city
     * @return true if successfully added
     */
    boolean addCity(City city);

    void addLeftRoadToCity(City city, Road road);

    void addRightRoadToCity(City city, Road road);

    /**
     * removes all entries of the specified road in map values
     * @param road
     */
    void removeRoad(Road road);

    City getCityByName(String name);

    Set<Road> getRoadsByCityName(String name);

}
