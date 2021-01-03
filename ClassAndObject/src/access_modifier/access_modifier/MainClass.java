package access_modifier;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifiers am=new AccessModifiers();
		System.out.println(am.Add(1, 3));
		//System.out.println(am.sub(1, 3);//Private access modifier can not be accessible to other class
		System.out.println(am.multi(2, 3));
		System.out.println(am.divide(4, 2));
	}

}
