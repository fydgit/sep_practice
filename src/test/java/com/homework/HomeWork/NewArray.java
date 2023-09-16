package com.homework.HomeWork;

public class NewArray {

	public static void main(String[] args) {
		/*We have an Array calls Year contains all months 
		and we have one variable calls Month that could be any number from 1-12
		write your codes when you give a value to Month it will print out the name of the month and how many days it has*/
	
	String[] year2023= {"jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};
	int [] days= {31,28,31,30,31,30,31,31,30,31,30,30};
	//int month= 9;
	System.out.println("we have total "+ year2023.length + " months and " +year2023[8] + " is 9th of the month with " + days[8] +"days");
	
	
	//  	Printing all value using Loop
	String[] cars = {"Volvo", "BMW", "Ford", "Mazda"}; 
	for (int i = 0; i < cars.length; i++)
	 { 
	System.out.println(cars[i]); 
	} 
int[] code= {4, 9, 3, 6, 7, 1};
for(int i=1;i<code.length;i++)
{
	System.out.println(code[i]);
	}
	
	}

}
