package moon;

public class Calculator {
	public static void main(String[] args) {
		int h = 5;
		int g = 14;
		int x = addition(h,g);
		System.out.println("This is addition of " + h +" and "+g+" result: " + x); //concatination operator
		int y = substruct(h,g);
		System.out.println("This is substruct of " +h+" and "+g+" result: " + y);
		multiplication(h,g);
		division(g,h);
	}
	public static int addition(int num1,int num2) {
		int result = num1 + num2;
		return result;
	}
	public static int substruct(int a, int b) {
		int result = a - b;
		return result;
	}
	public static void multiplication(int q, int w) {         //
		int result = q*w;
		System.out.println("This is multiplication of " +q+ " and "+w+" result: " + result);
	}
	public static void division(double num1,double num2) {
		int result = (int) ((int) num1/num2); //summary of two int will always be int
		System.out.println("This is division of " +num1+ " and " +num2+" result: " + result);
	}
}
