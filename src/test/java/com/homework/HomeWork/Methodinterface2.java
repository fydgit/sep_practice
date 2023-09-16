package com.homework.HomeWork;

public class Methodinterface2 implements Interfaceconcept {

	
		
	public void method1() {
		System.out.println("hello world");
		
	}

	public void method2() {
		int a=44;
		int b=44;
		int u=a*b;
		System.out.println(u);
		
	}

	public void method3() {
		System.out.println("hi");
	}

}
class myname{
	public static void main(String[] args) {
		Methodinterface2 in=new Methodinterface2 ();
		in.method1();
		in.method2();
		in.method3();
	}
}