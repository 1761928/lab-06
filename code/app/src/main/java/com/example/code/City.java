package com.example.code;

/**
 * This is a class representing a city object
 */
public class City implements Comparable {
    private String name;
    private String province;

    /**
     * This method constructs a city object
     * @param name: the name of the city
     * @param province: the name of the province
     */
    public City(String name, String province) {
        this.name = name;
        this.province = province;
    }

    /**
     * This method gets the name of the city
     * @return name: the name of the city
     */
    public String getName() {
        return name;
    }

    /**
     * This method sets the name of a city
     * @param name: the name of the city
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method gets the name of the province of a city
     * @return province: the name of the province
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method sets the province of a city
     * @param province: the name of the province
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * This method compares cities based on city name field
     * @param o: object to be compared
     * @return -1 if the caller is greater than the city name field
     */
    @Override
    public int compareTo(Object o) {
        City city = (City) o; //typecasting
        return this.name.compareTo(city.getName());
    }
}

