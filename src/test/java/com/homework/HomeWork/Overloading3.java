package com.homework.HomeWork;

public class Overloading3 {

	public static void main(String[] args) {
Overloading2 loading=new Overloading2();
		
		System.out.println("happy path testcase:\n");
		
		loading.fblogin("dola@gmail.com","abc123%" );
		loading.fblogin(1234567890, "abc123%");
		
		System.out.println("\nNegative testcase:\n");
		
		System.out.println("invalid email and valid password:");
		loading.fblogin("dola@gmailcon", "abc123%");
		System.out.println("valid email and invalid password:");
		loading.fblogin("dola@gmail.com", "a0l");
		System.out.println("invalid email and invalid password:");
		loading.fblogin("dola@gmailcon", "ml9");
		
		System.out.println("invalid phonenumber and valid password:");
		loading.fblogin(1890, "abc123%");
		System.out.println("valid phonenumber and invalid password:");
		loading.fblogin(1234567890, "nn9");
		System.out.println("invalid phonenumber and invalid password:");
		loading.fblogin(190, "a3%");
	}

}
