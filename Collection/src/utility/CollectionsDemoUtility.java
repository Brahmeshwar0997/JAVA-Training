package utility;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class CollectionsDemoUtility {

	public static void main(String[] args) {
		List<String> studentList = new ArrayList();
		List<String> studentList1 = new ArrayList();

		studentList.add("Neeraj");
		studentList.add("Mahesh");
		studentList.add("Armaan");
		studentList.add("Preeti");
		studentList.add("Sanjay");
		studentList.add("Sanjay");
		studentList.add("Neeraj");
		studentList.add("Zahir");

		System.out.println("Original List " + studentList);
		System.out.println(" ");
		
	Collections.sort(studentList);
	
	System.out.println("Sorted alphabetically List " + studentList);
	 
		System.out.println(" ");
		Collections.reverse(studentList);
		System.out.println("Reverse List " + studentList);
		System.out.println(" ");

		Collections.shuffle(studentList);
		System.out.println("Shuffled List " + studentList);
		System.out.println(" ");
		Collections.synchronizedCollection(studentList);
		System.out.println("synchronizedCollection List " + studentList);
		System.out.println(" ");
		
		System.out.println("Checking occurance of Sanjay: "
				+ Collections.frequency(studentList, "Armaan"));
	}
}
