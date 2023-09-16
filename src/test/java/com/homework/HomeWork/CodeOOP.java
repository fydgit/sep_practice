package com.homework.HomeWork;

public class CodeOOP {
	
	/*how to create a method:
	access modifire return type mathod name paranthesis and curlybrases.*/
	
	public void fbsignin()    //public 
	{
		//BLOCK OF CODE
		System.out.println("user will login");
	}
	private void add()    //private
	{
		int a=2;
		double w=3.3;
		double sum=a+w;
		System.out.println(sum);
		
	}
	void login()            //void/default
	{
		String rr="good";
		String yy=" morning";
		String oo=rr+yy;
		System.out.println(oo);
	}
	public void morning()
	{
		String[] year2023= {"jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};
		int [] days= {31,28,31,30,31,30,31,31,30,31,30,30};
		//int month= 9;
		System.out.println("we have total "+ year2023.length + " months and " +year2023[8] + " is 9th of the month with " + days[8] +"days");
		
	}

	public static void main(String[] args) {
		
		CodeOOP morning =new CodeOOP();
		
			//we can not sysout because under the method their is already sysout
		morning.fbsignin(); //public ,
		morning.add();      //private
		morning.login();   //default/void
		morning.morning();	
			
	}

	}


