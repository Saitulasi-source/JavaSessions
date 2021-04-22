package ConstructorAssignment;

import java.util.ArrayList;

public class University {

//	1. Design a University class template with the following features:
//		 variables:
//		name
//		country
//		stablishedDate
//		List of course provided in Array List<String>
//
//		--Design the constructor of this class with different parameters and all parameters.
//
//		--Write the get method of each variable with return keyword. 

	String name;
	String country;
	String establishedDate;
	ArrayList<String> course;

	public University(String name) {
		this.name = name;
	}

	public University(String name, String country) {
		this.name = name;
		this.country = country;
	}

	public University(String name, ArrayList<String> course) {
		this.name = name;
		this.course = course;
	}

	public University(String name, String country, String establishedDate) {
		this.name = name;
		this.country = country;
		this.establishedDate = establishedDate;
	}

	public University(String name, String country, ArrayList<String> course) {
		this.name = name;
		this.country = country;
		this.course = course;
	}

	public University(String name, String country, String establishedDate, ArrayList<String> course) {
		this.name = name;
		this.country = country;
		this.establishedDate = establishedDate;
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public String getCountry() {
		return country;
	}

	public String getEstablishedDate() {
		return establishedDate;
	}

	public ArrayList<String> getCourse() {
		return course;
	}
}