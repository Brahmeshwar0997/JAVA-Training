package serialization;

import java.io.*;

public class Misl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			OutputStream os = new FileOutputStream("test1.txt");
			InputStream is = new FileInputStream("test1.txt");
			os.write('A');
			os.flush();
			
			os.write('B');
			System.out.println("" + (char) is.read());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
