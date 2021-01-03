package threading;

public class Multi3 implements Runnable{  
public void run(){  
System.out.println("thread is running...");  
sum(2, 3);
subs(10, 3);
} 

public void sum(int a,int b) {
	System.out.println(a+b);
}
public void subs(int a,int b) {
	System.out.println(a-b);
}
   
public static void main(String args[]){  
Multi3 m1=new Multi3();  
Thread t1 =new Thread(m1);  
t1.start();  
 }  
}  