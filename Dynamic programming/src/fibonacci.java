import java.util.Scanner;

public class fibonacci {
	static int sere[];
	public static int fibonacciSeri(int n) {
 		sere[0]=1;
		sere[1]=1;
		for (int i = 2; i < n; i++) {
			sere[i]=sere[i-1]+sere[i-2];
		}
		return sere[n-1];
	}

	public static void main(String[] args) {
		
		System.out.println("Enter no of term in series");
		Scanner sc= new Scanner(System.in);
		int limit=sc.nextInt();
		sere =new int[limit] ;
		System.out.println(fibonacciSeri(limit));
	}

}
