package com.yeahbutstill.springandhibernate.mvcjsp.entity;

import java.util.LinkedHashMap;

public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private LinkedHashMap<String, String> countryOptions;
    private String favoriteLanguage;

    public Student() {

        // populate country options: used ISO country code
        countryOptions = new LinkedHashMap<>();
        countryOptions.put("CTM", "Citayam");
        countryOptions.put("DPK", "Depok");
        countryOptions.put("BGR", "Bogor");
        countryOptions.put("BDG", "Bandung");
        countryOptions.put("JKT", "Jakarta");

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
        this.countryOptions = countryOptions;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

}
