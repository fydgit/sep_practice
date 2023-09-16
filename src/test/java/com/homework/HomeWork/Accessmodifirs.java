package com.homework.HomeWork;

public class Accessmodifirs {
	// public attribute
	public int num;

	//default attribute
	int num1=20;

	//private attribute
	private int num3=30;
	
	//final; If we don't want to override existing values, declare the attribute as final:
	final String moon="hello World";
	final int x=9;
	final double r=3.8;
	
	public static void main(String[] args) {
//create an object syntax Classname objectname = new Classname ( ) ; 
		Accessmodifirs myobj=new Accessmodifirs();
		
		myobj.num=50;      //num is now 50
		System.out.println(myobj.num);      //public
		
		myobj.num1=100;    // num1 is now 100
		System.out.println(myobj.num1);    //default
		
		System.out.println(myobj.num3);    //private
	
	
		System.out.println(myobj.moon);      //final
		//myobj.x=7;    // // will generate an error: cannot assign a value to a final variable
		System.out.println(myobj.x);        //final
		System.out.println(myobj.r);       //final
		 
		}  
	}













