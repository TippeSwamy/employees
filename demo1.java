package demo;

import java.util.Scanner;

public class demo1 implements Runnable {

	synchronized public void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		if (name.equals("bank")) {
			banking();
		} else if (name.equals("char")) {
			character();
		} else {
			number();
		}
	}

	public void banking() {
		try {
		System.out.println("banking activity started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the accno");
		int a = sc.nextInt();
		System.out.println("enter the password");
		String pwd = sc.nextLine();
         Thread.sleep(5000);
         System.out.println("collect your cash");
System.out.println("banking activity completed");
	}
		catch(Exception e) {
			e.printStackTrace();
		}
}
	public void number() {
		try {
			System.out.println("number printing activity has started");
			for(int i=0;i<10;i++) {
				System.out.println(i);
				Thread.sleep(3000);
			}
			System.out.println("number printing activity has completed");
			}
		catch(Exception e) {
			e.printStackTrace();
		}
		}
	public void character() {
		try {
			System.out.println("character printlng activity has started");
			for(int i=65;i<70;i++) {
				System.out.println((char)i);
			Thread.sleep(3000);
			}
			System.out.println("character printing activity has completed");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	}
