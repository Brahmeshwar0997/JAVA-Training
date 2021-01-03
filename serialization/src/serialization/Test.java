package serialization;

import java.io.*;

public class Test {
	public static void main(String[] args) 
    {     String filename = "test.txt";
		  Demo object = new Demo(1, "Brahmeshwar"); 
		  Demo object1 = new Demo(2, "AAAA"); 
		  Demo object2 = new Demo(3, "cccc"); 
	        
        File f =new File(filename);
//        // Serialization  
//        try
//        {    
//            //Saving of object in a file 
//            FileOutputStream file = new FileOutputStream(f); 
//            ObjectOutputStream out = new ObjectOutputStream(file); 
//              
//            // Method for serialization of object 
//            out.writeObject(object); 
//            out.writeObject(object1); 
//            out.writeObject(object2); 
//                
//            out.close(); 
//            file.close(); 
//              
//            System.out.println("Object has been serialized"); 
//  
//        } 
//          
//        catch(IOException ex) 
//        { 
//            System.out.println("IOException is caught"); 
//        } 
//  
//  
        Demo object3 = null; 
         
        // Deserialization 
        try
        {    
            // Reading the object from a file 
            FileInputStream file = new FileInputStream(f); 
            ObjectInputStream in = new ObjectInputStream(file); 
              
            // Method for deserialization of object 
            object3 = (Demo)in.readObject(); 
           
            in.close(); 
            file.close(); 
              
            System.out.println("Object has been deserialized "); 
            System.out.println("a = " + object3.a); 
            System.out.println("b = " + object3.b); 
        } 
          
        catch(IOException ex) 
        { 
            System.out.println("IOException is caught"); 
        } 
          
        catch(ClassNotFoundException ex) 
        { 
            System.out.println("ClassNotFoundException is caught"); 
        } 
  
        
        
    } 
}
