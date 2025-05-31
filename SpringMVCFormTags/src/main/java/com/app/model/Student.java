package com.app.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	private Map<String,String> countryOptions;
	private String favoriteLanguage;
	private String[] operatingSystem;
	
	public Student()
	{
		countryOptions = new HashMap<String,String>();
		countryOptions.put("IN", "India");
		countryOptions.put("DE", "Germany");
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
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

	public Map<String, String> getCountryOptions() {
		return countryOptions;
	}

	public void setCountryOptions(Map<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String[] getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String[] operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", country=" + country
				+ ", countryOptions=" + countryOptions + ", favoriteLanguage=" + favoriteLanguage + ", operatingSystem="
				+ Arrays.toString(operatingSystem) + "]";
	}
	
	

}
