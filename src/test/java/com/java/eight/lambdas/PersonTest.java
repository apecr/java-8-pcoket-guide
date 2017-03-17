package com.java.eight.lambdas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.junit.Test;

public class PersonTest {

	@Test
	public void searchInListOfPersons() {
		// Arrange
		List<Person> listOfPersons = generateListOfPersons();
		// Act
		printPersonsOlderThan(listOfPersons, 10);
	}

	@Test
	public void searchInListOfPersonsWithCertainCheck() {
		// Arrange
		List<Person> listOfPersons = generateListOfPersons();
		// Act
		printPersons(listOfPersons,
				(Person p) -> p.getGender() == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25);
	}

	private List<Person> generateListOfPersons() {
		List<Person> listOfPersons = new ArrayList<>();
		listOfPersons.add(new Person("Sabine", LocalDate.of(2000, 1, 23), Person.Sex.FEMALE, "sabine@as.com"));
		listOfPersons.add(new Person("Joan", LocalDate.of(2010, 1, 23), Person.Sex.MALE, "Joan@as.com"));
		listOfPersons.add(new Person("Francisco", LocalDate.of(1980, 1, 23), Person.Sex.MALE, "Francisco@as.com"));
		listOfPersons.add(new Person("Alvaro", LocalDate.of(1995, 1, 23), Person.Sex.MALE, "Alvaro@as.com"));
		return listOfPersons;
	}

	private void printPersons(List<Person> listOfPersons, Predicate<Person> tester) {
		for (Person p : listOfPersons) {
			if (tester.test(p)) {
				p.printPerson();
			}
		}
	}

	private void printPersonsOlderThan(List<Person> listOfPersons, int age) {
		for (Person p : listOfPersons) {
			if (p.getAge() > age) {
				p.printPerson();
			}
		}
	}
}
 