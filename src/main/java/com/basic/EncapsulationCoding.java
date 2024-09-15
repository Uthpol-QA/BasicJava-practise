package com.basic;

public class EncapsulationCoding {

	private String name;
	private int age;

	public String getName() {
		System.out.println("name =" + name);
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		System.out.println("Age =" + age);
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		EncapsulationCoding obj = new EncapsulationCoding();
		obj.setName("Nath Pol");
		obj.setAge(25);

		obj.getName();
		obj.getAge();
	}
}
