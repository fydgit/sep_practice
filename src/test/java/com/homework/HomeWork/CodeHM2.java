package com.homework.HomeWork;

import java.util.HashMap;

public class CodeHM2 {

	public static void main(String[] args) {
		
		//HashMap<datatype,datatype>variable name=new HashMap<datatype,datatype>();
		HashMap<String,Integer>destination=new HashMap<String,Integer>();
		
		//add (put method)
		destination.put("dallas", 1200);
		destination.put("florida", 1240);
		destination.put("lasvegas", 1100);
		destination.put("colorado", 1400);
	System.out.println("HashMap:" + destination);
	
	
	
	    destination.remove("dallas");                             //remove any 1 item(remove method
   System.out.println(destination);
   
  
        destination.remove("florida"); destination.remove("dallas");       //remove any 2 item(remove method
   System.out.println(destination);
   
   System.out.println(destination.remove("colorado"));	
	
	}

}
