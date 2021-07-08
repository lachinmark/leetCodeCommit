package oops;

public class StringProgramming {

	public static void main(String[] args) {
		//stringMethod();
		//convertToUpperCase();
		//convertToLowerCase();
		//stringReplace();
		//stringCharAt();
		//stringToCharArray();
		//stringAppend();
		//stringSplit();
		//dob();
		//equal1();
		//compare();
		//trim();
		//replace();
		//subString1();
		contains();

	}
	public static void stringMethod() {
		String x = "";
		int y = x.length();//length is method counts number of chars
		System.out.println(y);
	}
	
	public static void convertToUpperCase() {
		String x = "GEneral";
		String y = x.toUpperCase();//used to get same string but upper case
		System.out.println(y);
	}
	
	public static void convertToLowerCase() {
		String x = "FlYhiGH";
		String y = x.toLowerCase();//
		System.out.println(y);
	}
	
	public static void stringReplace() {
		String x = "Transport";
		String y = x.replace('r', '.');// replacing chars
		System.out.println(y);
	}
	
	public static void stringCharAt() {
		String x = "Logo";//strings also starts from 0 as arrays
		System.out.println(x.charAt(6));//its "char's array"
		//Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 6
		//means you tried access some char with index doesn't exist
	}
	
	public static void stringToCharArray() {
		String x = "c Inde xOunt";//space is valid char
		char[] y = x.toCharArray();//from string to char array
		System.out.println(y[1]);
	}
	
	public static void stringAppend() {
		String x = "Programm light";
		System.out.println(x.concat(" Kilo"));
	}
	
	public static void stringSplit() {
		String x = "5,3,45,9";
		//type casting --check--convertion
		String arr[] = x.split(",");//creates array of strings
		int sum = 0;
		for (int i=0;i<arr.length;i++) {
			int x1= Integer.parseInt(arr[i]);//converts String to integer
			sum = sum +x1;
		//System.out.println(arr [i]);
	}
		System.out.println(sum);
	}
	
	public static void dob() {
		String dob = "01/11/2020,02/20/2019,12/31/2018";
		String arr[] = dob.split(",");
		for (int i=0;i<arr.length;i++) {
			
		String arr1[] = arr[i].split("/");
		
		System.out.println("Date is :" + arr1[0]);
		System.out.println("Month is :" + arr1[1]);
		System.out.println("Year is :" + arr1[2]);
		}
	}
	
	public static void equal() {
		String x = "Hi";
		String y = "Hi";
		if (x==y) {
			System.out.println("Both strings are equal");
		}
		else
			System.out.println("Strings are different");
	}
		
	public static void equal1() {
		String x = new String("Hi");
		String y = new String("hi");
		if (x.equalsIgnoreCase(y)) {  //never use "==" to compare anything but numbers
			System.out.println("Both strings are equal");
		}
		else
			System.out.println("Strings are different");
	}
	
	public static void compare() { //if space it counts number so characters in difference
		String x = "Hello";  //chars will be calculated from ascii standart
		String z = "Hellow";
		int q = (x.compareTo(z));
		System.out.println(q);
		}
	
	public static void trim() {
		String x = "   Hi,                how are you?       ";
		//System.out.println(x);
		String y = x.trim();
		System.out.println(y);
	}
	
	public static void replace() {
		String x = "Hi good morning";
		String y = x.replaceAll("o","0");
		System.out.println(y);
	}
	
	public static void subString() {
		String x = "Anything";
		String y = x.substring(5);
		System.out.println(y);
	}
	
	public static void subString1() {
		String x = "Anything";
		String y = x.substring(2, 6);
		System.out.println(y);
	}
	
	public static void contains() {
		String x = "Hello people";
		boolean y = x.contains(" ");
		System.out.println(y);
	}
	}
