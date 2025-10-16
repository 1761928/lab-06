package com.example.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class holds our city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This method adds a City type object to the cities list
     * @param c: the object to add
     * @throws: IllegalArgumentException if c already exists in the cities list
     */
    public void add(City c) {
        if (cities.contains(c)) {
            throw new IllegalArgumentException();
        }
        cities.add(c);
    }

    /**
     * This method gets the city list
     * @return list: the list of cities to be returned
     */
    public List<City> getCities(){
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * This method removes a city from the list if it exists in the list otherwise throws
     * @throws: IllegalArgumentException if c already does not exists in the cities list
     */
    public void deleteCity(City city){
        if (cities.contains(city)) {
            cities.remove(city);
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    /**
     * This method checks if a city is in the list
     * @param city: the object to be checked
     * @return boolean: returns true if the city is in the list otherwise returns false
     */
    public boolean hasCity(City city){
        if (cities.contains(city)) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * This counts the amount of cities in the list
     * @return int: the number of cities in the list
     */
    public int countCities() {
        return cities.size();
    }
}
