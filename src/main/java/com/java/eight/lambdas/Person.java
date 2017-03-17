package com.java.eight.lambdas;

import java.time.LocalDate;
import java.util.List;

public class Person {
	public enum Sex {
		MALE, FEMALE
	}

	private String name;
	private LocalDate birthday;
	private Sex gender;
	private String emailAddress;

	public Person(String name, LocalDate birthday, Sex gender, String emailAddress) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.setGender(gender);
		this.emailAddress = emailAddress;
	}

	public int getAge() {
		LocalDate today = LocalDate.now();
		int age = today.getYear() - this.birthday.getYear();
		if (today.getMonthValue() < this.birthday.getMonthValue()) {
			age--;
		}
		return age;
	}

	public void printPerson() {
		System.out.println("Persona que cumple el parametro: " + this.name);
	}

	public static void printPersonsOlderThan(List<Person> roster, int age) {
		for (Person p : roster) {
			if (p.getAge() >= age) {
				p.printPerson();
			}
		}
	}

	public Sex getGender() {
		return gender;
	}

	public void setGender(Sex gender) {
		this.gender = gender;
	}

}
