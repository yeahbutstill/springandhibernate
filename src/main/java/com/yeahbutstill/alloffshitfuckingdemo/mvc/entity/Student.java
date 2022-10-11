package com.yeahbutstill.alloffshitfuckingdemo.mvc.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Objects;

@Entity
@Table(name = "student")
public class Student {

	private String firstName;
	private String lastName;

	private String email;

	public Student() {

		// populate country options: used ISO country code
		countryOptions = new LinkedHashMap<>();

		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
		countryOptions.put("US", "United States of America");

	}

	public Student(String firstName, String lastName, String email, String country, LinkedHashMap<String, String> countryOptions, String favoriteLanguage, String[] operatingSystems) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.country = country;
		this.countryOptions = countryOptions;
		this.favoriteLanguage = favoriteLanguage;
		this.operatingSystems = operatingSystems;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	private String country;
	
	private LinkedHashMap<String, String> countryOptions;
	
	private String favoriteLanguage;
	
	private String[] operatingSystems;

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

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Student student = (Student) o;

		if (!Objects.equals(firstName, student.firstName)) return false;
		if (!Objects.equals(lastName, student.lastName)) return false;
		if (!Objects.equals(email, student.email)) return false;
		if (!Objects.equals(country, student.country)) return false;
		if (!Objects.equals(countryOptions, student.countryOptions))
			return false;
		if (!Objects.equals(favoriteLanguage, student.favoriteLanguage))
			return false;
		// Probably incorrect - comparing Object[] arrays with Arrays.equals
		return Arrays.equals(operatingSystems, student.operatingSystems);
	}

	@Override
	public int hashCode() {
		int result = firstName != null ? firstName.hashCode() : 0;
		result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
		result = 31 * result + (email != null ? email.hashCode() : 0);
		result = 31 * result + (country != null ? country.hashCode() : 0);
		result = 31 * result + (countryOptions != null ? countryOptions.hashCode() : 0);
		result = 31 * result + (favoriteLanguage != null ? favoriteLanguage.hashCode() : 0);
		result = 31 * result + Arrays.hashCode(operatingSystems);
		return result;
	}

	@Override
	public String toString() {
		return "Student{" +
				"firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", email='" + email + '\'' +
				", country='" + country + '\'' +
				", countryOptions=" + countryOptions +
				", favoriteLanguage='" + favoriteLanguage + '\'' +
				", operatingSystems=" + Arrays.toString(operatingSystems) +
				'}';
	}
}
