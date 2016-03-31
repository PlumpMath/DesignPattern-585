package com.example;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person.Builder(18, "mwg", true).setHeight(173).setWeight(80).build();
		
		System.out.println(person);
	}

}
