package com.yeahbutstill.springandhibernate.mvcjsp.entity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Student {

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String firstName;

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String lastName;

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String country;

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private LinkedHashMap<String, String> countryOptions;

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String favoriteLanguage;

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private LinkedHashMap<String, String> favoriteLanguageOptions;

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String operatingSystem;

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private ArrayList<String> operatingSystemOptions;

    public Student() {

        // populate country options: used ISO country code
        countryOptions = new LinkedHashMap<>();
        countryOptions.put("CTM", "Citayam");
        countryOptions.put("DPK", "Depok");
        countryOptions.put("BGR", "Bogor");
        countryOptions.put("BDG", "Bandung");
        countryOptions.put("JKT", "Jakarta");

        favoriteLanguageOptions = new LinkedHashMap<>();
        favoriteLanguageOptions.put("Java", "Java");
        favoriteLanguageOptions.put("C#", "C#");
        favoriteLanguageOptions.put("PHP", "PHP");
        favoriteLanguageOptions.put("Ruby", "Ruby");

        operatingSystemOptions = new ArrayList<>();
        operatingSystemOptions.add("Linux");
        operatingSystemOptions.add("Mac OS");
        operatingSystemOptions.add("Windows");
    }

    public ArrayList<String> getOperatingSystemOptions() {
        return operatingSystemOptions;
    }

    public void setOperatingSystemOptions(ArrayList<String> operatingSystemOptions) {
        this.operatingSystemOptions = operatingSystemOptions;
    }

    public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
        return favoriteLanguageOptions;
    }

    public void setFavoriteLanguageOptions(LinkedHashMap<String, String> favoriteLanguageOptions) {
        this.favoriteLanguageOptions = favoriteLanguageOptions;
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

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}
