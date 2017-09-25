package com.telusko.demoHb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table (name ="alien")
public class Alien {

	@Id
	protected int id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column
	protected int age;
	
	@Column
	protected String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		
		return "Alien [id=" + id + ", age=" + age + ", name=" + name + "]";
	
	}
	public Alien(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}
	public Alien() {
		// TODO Auto-generated constructor stub
	}
	
}
