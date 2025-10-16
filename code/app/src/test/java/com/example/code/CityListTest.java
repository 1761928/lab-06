package com.example.code;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CityListTest {
    private CityList mockCityList() {
        CityList cityList = new CityList();
        cityList.add(mockCity());
        return cityList;
    }

    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }

    @Test
    void testAdd() {
        CityList cityList = mockCityList();
        assertEquals(1, cityList.getCities().size());
        City city = new City("Regina", "Saskatchewan");
        cityList.add(city);
        assertTrue(cityList.getCities().contains(city));
    }

    @Test
    void testAddException() {
        CityList cityList = mockCityList();
        City city = new City("Yellowknife", "Northwest Territories");
        cityList.add(city);
        assertThrows(IllegalArgumentException.class, () -> {
            cityList.add(city);
        });
    }

    @Test
    void testGetCities() {
        CityList cityList = mockCityList();
        assertEquals(0, mockCity().compareTo(cityList.getCities().get(0)));
        City city = new City("Charlottetown", "Prince Edward Island");
        cityList.add(city);
        assertEquals(0, city.compareTo(cityList.getCities().get(0)));
        assertEquals(0, mockCity().compareTo(cityList.getCities().get(1)));
    }

    @Test
    void testHasCity() {
        CityList cityList = mockCityList();
        City city = new City("Regina", "Saskatchewan");
        cityList.add(city);
        assertEquals(2, cityList.getCities().size());
        assertTrue(cityList.hasCity(city));
        City city2 = new City("Charlottetown", "Prince Edward Island");
        assertFalse(cityList.hasCity(city2));
    }

    @Test
    void testDeleteCity() {
        CityList cityList = mockCityList();
        City city = new City("Regina", "Saskatchewan");
        cityList.add(city);
        assertEquals(2, cityList.getCities().size());
        cityList.deleteCity(city);
        assertEquals(1, cityList.getCities().size());
        assertFalse(cityList.getCities().contains(city));
        assertThrows(IllegalArgumentException.class, () -> {
            cityList.deleteCity(city);
        });
    }

    @Test
    void testCountCities() {
        CityList cityList = mockCityList();
        City city = new City("Regina", "Saskatchewan");
        cityList.add(city);
        assertEquals(2, cityList.getCities().size());
        assertEquals(2, cityList.countCities());
        City city2 = new City("Charlottetown", "Prince Edward Island");
        cityList.add(city2);
        assertEquals(3, cityList.getCities().size());
        assertEquals(3, cityList.countCities());
        cityList.deleteCity(city);
        assertEquals(2, cityList.getCities().size());
        assertEquals(2, cityList.countCities());
    }
}
