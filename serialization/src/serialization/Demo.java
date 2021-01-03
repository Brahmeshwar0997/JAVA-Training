package serialization;

import java.io.Serializable;

class Demo implements Serializable //marker interface
{
	public int a;
	public String b;

	// Default constructor
	public Demo(int a, String b) {
		this.a = a;
		this.b = b;
		System.out.println("you are in cont demo");
	}

}