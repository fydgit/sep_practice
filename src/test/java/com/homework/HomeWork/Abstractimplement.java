package com.homework.HomeWork;

public class Abstractimplement extends Abstractcode {

	public static void main(String[] args) {
		Abstractimplement obj= new Abstractimplement();
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method4();
	}

	@Override
	public void method3() {
		System.out.println("good");
		
	}

	@Override
	public void method4() {
	System.out.println("morning");
		
	}

}
