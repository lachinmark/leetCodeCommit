package moon;
import java.util.Scanner; //util name of package
public class InputAccept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//java component, scanner class
		//inputNumbers();
		//addition();
		//substruct();
		substruct2();
	}
	public static void inputNumbers() {
		Scanner sc = new Scanner(System.in); //object creation
		System.out.println("wright something");
		int x=sc.nextInt();
		System.out.println(x);
	}

	public static void addition() {
		Scanner drive = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int num1 = drive.nextInt(); //using object to call 'nextInt' method
		System.out.println("Enter 2nd number: ");
		int num2 = drive.nextInt();
		int x = num1 + num2;
		System.out.println("Entered: " + num1 + " and " + num2 + " result is " + x);
	}


	public static void substruct() {
		Scanner drive1 = new Scanner(System.in);
		System.out.println("Give 1st number: ");
		int x = drive1.nextInt();
		System.out.println("Give 2nd number: ");
		int y = drive1.nextInt();
		int z = x - y;
		System.out.println("Result is : " + z);
	}

	public static void substruct2() {
		Scanner drive = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		double x = drive.nextDouble();
		//System.out.println("Enter 1st number: ");
		System.out.println("Enter 2nd number: ");
		double y = drive.nextDouble();
		//System.out.println("Enter 2nd number: ");
		double z = x - y;
		System.out.println("Result is: " + z);
	}
}
