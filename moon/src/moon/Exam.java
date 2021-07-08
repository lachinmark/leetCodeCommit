package moon;
import java.util.Scanner;
public class Exam {

	public static void main(String[] args) {
		enterGrades();
	}
	public static void enterGrades() {
	Scanner x = new Scanner(System.in); //we can use same object many times
	
	System.out.print("How many grades you want to enter?");
	int numberGrades = x.nextInt();
	
	int [] z = new int[numberGrades]; 
	for (int i=0;i<z.length;i++) {
		System.out.print("Subject [" + (i+1) + "] = ");
		z[i] = x.nextInt();
	}
	int maxElement = maxArray(z);
	System.out.println("Highest mark is " + maxElement);
	int minElement = minArray(z);
	System.out.println("Lowest mark is " + minElement);
	double e= 0;
	for (int w=0;w<z.length;w++) {
		e = (e+z[w]);
	}
	double g = e/z.length;
		System.out.println("Average percentage mark is " + g);
	}
	
	public static int maxArray(int array[]) {
		int x = array[0];
		for (int i=0;i<array.length;i++) {
			if (array[i]>x) {
				x=array[i];
			}
		}
		return x;
	}
	
	public static int minArray(int array[]) {
		int x = array[0];
		for (int i=0;i<array.length;i++) {
			if (array[i]<x) {
				x=array[i];
			}
		}
		return x;
	}
}
	
