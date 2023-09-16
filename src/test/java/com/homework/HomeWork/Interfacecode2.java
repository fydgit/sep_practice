package com.homework.HomeWork;


class Interfacecode2  implements Interfacecode, FirstInterface, SecondInterface {
		 public void myMethod() {
		 System.out.println("Some text..");
		 }
		 public void myOtherMethod() {
		 System.out.println("Some other text...");
		 }
		public void morning() {
			System.out.println("good morning");
			
		}
		}
		class Main {
		 public static void main(String[] args) {
			 Interfacecode2 myObj = new Interfacecode2();
		 myObj.myMethod();
		 myObj.myOtherMethod();
		 myObj.morning(); 
		 }
		}


