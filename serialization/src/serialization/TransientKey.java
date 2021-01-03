package serialization;

import java.io.*;

public class TransientKey implements Serializable 
{ 
    // Normal variables 
    String i = "AAA", j = "BB"; 
  
    // Transient variables 
    transient String k = "Hii"; 
  
    // Use of transient has no impact here 
    transient static String l = "Hello"; 
    transient final String m = ""; 
  
    public static void main(String[] args) throws Exception 
    { 
    	TransientKey input = new TransientKey(); 
  
        // serialization 
        FileOutputStream fos = new FileOutputStream("abc.txt"); 
        ObjectOutputStream oos = new ObjectOutputStream(fos); 
        oos.writeObject(input); 
  
        // de-serialization 
        FileInputStream fis = new FileInputStream("abc.txt"); 
        ObjectInputStream ois = new ObjectInputStream(fis); 
        TransientKey output = (TransientKey)ois.readObject(); 
        System.out.println("i = " + output.i); 
        System.out.println("j = " + output.j); 
        System.out.println("k = " + output.k); 
        System.out.println("l = " + output.l);   
        System.out.println("m = " + output.m); 
    } 


}
