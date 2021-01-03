package access_modifier;
public class AccessModifiers {
	public String Add(int num1, int num2) {

		return "Addition is" + (num1 + num2);
	}

	private String sub(int num1, int num2) {

		return "Substraction  is" + (num1 - num2);
	}

	protected String multi(int num1, int num2) {

		return "Multiply is" + (num1 * num2);
	}

	/*
	 *  need not to write defaul keyword 
	 *  if used you write default keyword through 
	 *  error like Default methods are allowed only in interfaces.
	 *  
	 *  */
	  String divide(int num1, int num2) {

		return "Divide is" + (num1 + num2);
	}

	

}
