package com.homework.HomeWork;

public class Overloading2 {

	public void fblogin(String email,String Pw) {
		String code1=email;
		String code2=Pw;
		
		if(code1=="dola@gmail.com" && code2=="abc123%"){
			System.out.println("logged in successfuly with valid email and Pw.");
		}
		else {
			System.out.println("Log in failed, email or password invalid.\n");
		}
	}
	public void fblogin(int phonenumber,String Pw) {
		int code1=phonenumber;
		String code2=Pw;
		
		if(code1==1234567890 && code2=="abc123%"){
			System.out.println("logged in successfuly with valid phonenumber and Pw.");
		}
		else {
			System.out.println("Log in failed, phonenumber or password invalid.\n");
		}	
	}
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
