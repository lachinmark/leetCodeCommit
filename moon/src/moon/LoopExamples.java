package moon;

public class LoopExamples {

	public static void main(String[] args) {
		//evenNumbers();
		//oddNumbers();
		sumNumbers();
	}
	public static void evenNumbers() {
		for(int i=2;i<=10;i=i+2)
		System.out.println(i);
	}
	public static void oddNumbers() {
		for(int i=1;i<=10;i=i+2)
		System.out.println(i);
	}
	public static void sumNumbers() {
		int total = 0;
		for(int i=1;i<=10;i++) {
			total = total +i;
			//System.out.println(total);  // need to take print out of 'for loop' to avoid it to be part of the loop
		}
		System.out.println(total);
	}

}
// How to accept input from user?
