package set;

import java.util.*;

enum Gfg { 
    CODE, 
    LEARN, 
    CONTRIBUTE, 
    QUIZ, 
    MCQ 
} 
; 
public class MyEnumSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating a set 
        Set<Gfg> set1; 
  
        // Adding the elements 
        set1 = EnumSet.of(Gfg.QUIZ, 
                          Gfg.CONTRIBUTE, 
                          Gfg.LEARN, 
                          Gfg.CODE); 
  
        System.out.println("Set 1: " + set1); 
    }

	 

	 
	}

 