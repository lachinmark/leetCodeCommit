package oops;
import java.util.Scanner;;

public class trend {

	public static void main(String[] args) {

		//countSym();
		//starNumber();
		//smthng();
		//reverse();
		//rev();
		polynd();
		
		
		// oops principles: 1) class ; 2) object ; 3) inheritance ;
		//extends - inherit another class, only one class to extend
		//implements - inherit another interface, we can inherit multiple interfaces
		// 4) abstraction - interface and abstract class to implement abstraction in java
		// 5) encapsulation - in java we have access specifier, class - is also 
		// data hiding 
		// 6) polymorphism - one type but different use : overloading and overriding
		// ++ 
	}
	
	//calculate number of vowels and  from string
	
	public static void countSym() {
		String str = "overloading and overriding";
		int y = 0;
		for (int i = 0;i<str.length();i++) {
			char x = str.charAt(i);
			if ((x=='i') || (x=='o') || (x=='e') || (x=='a') || (x=='u')) {
				y++;
			}
		}
		System.out.println(y);
	}
	
	public static void starNumber() {
		String x = "Hi i am raj. I need help in spring boot. Please contact with me. my moble no is 9830203076 Thanks for your support";
		for (int i =0;i<x.length();i++) {
				char z = x.charAt(i);
					if (Character.isDigit(x.charAt(i))) {
						 x = x.replace(z, '*');
					}
			}
		System.out.println(x);
		}
	
	public static void smthng() {
		String x = "Hi i am raj. I need help in spring boot. Please contact with me. my moble no is 9830203076 Thanks for your support";
		x = x.replaceAll("[0-5]","*");
		x = x.replaceAll("[6-9]","-");
	    System.out.println(x);
	}
	
	//reverse string
	//input = hello, output = olleh
	
	public static void reverse() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Right a string: ");
		String x = scn.nextLine();
		String output = ""; //null is used when you dont want to memory be allocated, for empty string it will allocate and you can work with it as regular string
		for (int q = (x.length() - 1);q>=0;q--) {
			char y = x.charAt(q);
			String s = Character.toString(y);
			output = output.concat(s);
		}
		System.out.println(output);
	}
	
	public static void rev() {
		StringBuffer a = new StringBuffer("Java programming is fun");
	     System.out.println(a.reverse());
	}
	
	//check wether string is palindrome or not
	public static void polynd() {
		StringBuffer b = new StringBuffer("ABC");
		StringBuffer y = b.reverse();
		System.out.println(b);
		if (y.equals(b)) {
	     System.out.println("It is polyndrome");
	}
		else
			System.out.println("It is not polyndrome");
	}
}
