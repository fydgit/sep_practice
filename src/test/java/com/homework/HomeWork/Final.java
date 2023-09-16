package com.homework.HomeWork;

public class Final {  
	//final class Final { 	//"final" modifier cannot inherited

	public void morning() {
		System.out.println("good morning");
	}
	private void noon() {
		System.out.println("good noon");
	}
	final void evening() {
	System.out.println("good evening");	
	}

	public static void main(String[] args) {
		Final obj=new Final();
		obj.morning();
		obj.noon();
		obj.evening();
	}
}
