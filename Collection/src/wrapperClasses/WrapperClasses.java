package wrapperClasses;

public class WrapperClasses {
	public static void main(String args[]) {
		// Converting int primitive into Integer object
		int num = 100;
		int a=10;
		int b=10;
		String st="123";
		Integer obj = Integer.valueOf(num);
		Integer i = new Integer(100);
		System.out.println(i.sum(a, b));
		
//		System.out.println(num + " " + obj);
// 		System.out.println(obj.equals(num));
// 		System.out.println(obj == (num));
 	int num1 = 100;
 	Integer obj1 = new Integer(100);
 	System.out.println(num1==obj1);
//		System.out.println(num1 + " " + obj1);
 	System.out.println(obj1.equals(num1));
//		System.out.println(obj1 == (num1));
 	Integer intObj = new Integer(25);
 	Integer intObj2 = new Integer("25");
 	//	System.out.println(intObj.equals(intObj2));
 	//	System.out.println(intObj==intObj2);
 		System.out.println(intObj == (intObj2));
//
 		intObj2.parseInt("54");
	}
}
