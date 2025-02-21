package com.hardeep.practice;

public class MethodChaining {

	private String firstName;
	private String lastName;
	private int age;

	public MethodChaining setFirst(String fname) {
		this.firstName = fname;
		return this;
	}

	public MethodChaining setLast(String lname) {
		this.lastName = lname;
		return this;
	}

	public MethodChaining setAge(int age) {
		this.age = age;
		return this;
	}

	public static void main(String[] args) {
		MethodChaining obj = new MethodChaining();
		
		obj.setFirst("Hardeep").setLast("Singh").setAge(28);

		System.out.println("firstName : "+obj.firstName+" , lastName : "+obj.lastName+" , age"+obj.age);
	}

}
