package com.homework.HomeWork;

import java.util.HashMap;

 public class CodeHashMap {

	public static void main(String[] args) {
		//HashMap<datatype,datatype>variable name=new HashMap<datatype,datatype>();
		HashMap<String,Integer>destination=new HashMap<String,Integer>();
		
		//add (put method)
		destination.put("dallas", 1200);
		destination.put("florida", 1240);
		destination.put("lasvegas", 1100);
		destination.put("colorado", 1400);
	//System.out.println("HashMap:" + destination);
		
		//access any 1 key (get method)
		destination.get("florida");
   // System.out.println(destination.get("florida"));
  
        //HashMap size (size method)
         destination.size();
   // System.out.println(destination.size());
    
        //loop hashmap (keyset() method for key, value() method for value)
        // for (String i:destination.keySet())    //print key
         {
        	 //System.out.print(i + ",");
         }
       //  System.out.println("\n");
         
          //for (int i:destination.values())    ////print value
        	  
          {
        	 // System.out.print(i +",");
          }
          
          //for(String i:destination.keySet())   
        	  //System.out.println("key: " +i+" , value: " +destination.get(i));
	
	   //remove any 1 item(remove method
	     destination.remove("dallas");
    //System.out.println(destination);
    
    //remove any 2 item(remove method
   // destination.remove("florida"); //destination.remove("dallas");
System.out.println(destination.remove("florida"));
	
	     //remove all item(clear method)
	     destination.clear();
 // System.out.println(destination);

    
		
	}
	

}
