package com.example.demo;



public class Person {
	
	private String name;
	private int age;
	private String hobbies;
	private String major;
	
	
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public Person() {}
	
	public Person(String name, int age, String hobbies, String major) {
		super();
		this.name = name;
		this.age = age;
		this.hobbies = hobbies;
		this.major = major;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	
	
}
