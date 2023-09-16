package com.homework.HomeWork;

import java.util.ArrayList;

public class HomwArrayList {

	public static void main(String[] args) {
	
		//ArrayList <Datatype>Variablename = new ArrayList<Datatype> (); 
				//add 3 cars in arraylist
				 ArrayList <String>cars= new ArrayList<String>(); 
				 cars.add("bmw");    //select add(String e):boolean. arraylist
				 cars.add("nissan");
				 cars.add("honda");
				                           //how to access value in ArrayList
				                            //System.out.println(cars.get(1));
				                            //how to change value in ArrayList
				 cars.set(2, "acura");
				
				 System.out.println(cars.get(2));
				 System.out.println("the size of the array is:" + cars.size());
	}

}
