package set;

import java.util.*;

public class MyHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Set<String> h = new HashSet<String>(); 
		
	        // Adding elements into the HashSet 
	        // using add() 
		   System.out.println( h.isEmpty());
	        h.add("India"); 
	        h.add("Australia"); 
	        h.add("South Africa"); 
	  
	        // Adding the duplicate 
	        // element 
	       h.add("India"); 
	       
	        // Displaying the HashSet 
	        System.out.println(h); 
	  
	        // Removing items from HashSet 
	        // using remove() 
	        h.remove("Australia"); 
	        System.out.println("Set after removing "
	                           + "Australia:" + h); 
	  
	        // Iterating over hash set items 
	        System.out.println("Iterating over set:"); 
	        Iterator<String> i = h.iterator(); 
	        while (i.hasNext()) 
	            System.out.println(i.next()); 
	    } 
	}


