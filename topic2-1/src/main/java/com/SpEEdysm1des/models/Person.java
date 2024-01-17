package com.SpEEdysm1des.models;

public class Person {
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public Person(int id, String name, int age, float weight) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	private int id;
	private String name;
	private int age;
	private float weight;
}
