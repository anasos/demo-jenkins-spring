package rh.tuto.start.hTuto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

	private String name;
	private int age;
	private Laptop laptop;

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(final int age) {
		this.age = age;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(final Laptop laptop) {
		this.laptop = laptop;
	}

	@Autowired
	public Student(final Laptop laptop) {
		this.laptop = laptop;
	}

	public Student() {
	}

	public void present(){
		System.out.println("My name is "+ name + " and i'm " + age +" years old");
		System.out.println("I'm using a "+ laptop.getModel());
	}
}
