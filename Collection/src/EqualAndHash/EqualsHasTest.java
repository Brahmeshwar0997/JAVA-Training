package EqualAndHash;

public class EqualsHasTest {
	public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
 
        e1.setId(100);
        e2.setId(100);
//        System.out.println(e1.hashCode());
//        System.out.println(e2.hashCode());
//        System.out.println(e1);
//        System.out.println(e1.getClass());  
//        System.out.println(e2);
//        System.out.println(e2.getClass());  
//        System.out.println(e2.equals(e1));
        
       String st="ABE"; 
        String st1="ABww"; 
        String st11= new String("ABE");
        System.out.println(st1.equals(st11));
              }
}
