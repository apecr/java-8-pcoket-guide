package com.java.eight.lambdas;

@FunctionalInterface
public interface Comparator<T> {

	//Only one abstract method is allowed
	int compare(T o2, T o1);
	//Overriding allowed
	boolean equals(Object obj);
	//Optional default methods allowed
}
