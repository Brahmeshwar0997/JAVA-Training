package set;
import java.util.*;

public class MyTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> ts 
        = new TreeSet<String>(); 

    // Adding elements into the TreeSet 
    // using add() 
    ts.add("India"); 
    ts.add("Australia"); 
    ts.add("South Africa"); 

    // Adding the duplicate 
    // element 
    ts.add("India"); 

    // Displaying the TreeSet 
    System.out.println(ts); 

    // Removing items from TreeSet 
    // using remove() 
    ts.remove("Australia"); 
    System.out.println("Set after removing "
                       + "Australia:" + ts); 

    // Iterating over Tree set items 
    System.out.println("Iterating over set:"); 
    Iterator<String> i = ts.iterator(); 
    while (i.hasNext()) 
        System.out.println(i.next());
	}

}
