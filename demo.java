package demo;

public class demo {
   public static void main(String a[]) {
	   System.out.println("main thred has started ");
	   demo1  d=new demo1();
	   
	  Thread t1=new Thread(d);
	  t1.setName("bank");
	  
	  Thread t2=new Thread(d);
	  t2.setName("num");
	  Thread t3=new Thread(d);
	  t3.setName("char");
	  t1.start();
	  t2.start();
	  t3.start();
	  System.out.println("main thread has completed ");
   }
}