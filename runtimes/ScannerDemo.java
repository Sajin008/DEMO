package runtimes;


import java.util.*;

public class ScannerDemo {
public static void main(String[] args) {

	Scanner s=new Scanner(System.in);
	System.out.println("Enter your name");
	String name=s.nextLine();
	System.out.println("Enter your age");
	int age=s.nextInt();
	System.out.println("Enter your salary");
	float salary=s.nextFloat();
	System.out.println("your name is"+name);
	System.out.println("your age is"+age);
	System.out.println("your salary is"+salary);
}
}
