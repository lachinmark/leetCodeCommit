package moon;

public class Loop {
	public static void main(String [] args) {  //repeat
		//3 types of loops
		// for loop
		// while loop
		// do while loop  -- difference btwn these loops, and when to use each
		//printNumbers();
		//printNumbersUsingWhile();
		//printNumbersReverse();
		//printNumbersInfinite();
		//printNumbersInfiniteFor();
		simpleProgram();
		//printNumbersDoWhile();
	}
	public static void printNumbers() {
		for (int i=-15;i<20;i=i+2) {  //before first semicolon is initialization of variable
			//second - conditional statement - if true then print, then goes to increment
			//third increment or decrement
			System.out.println(i);
			
		}
	
	}

	public static void printNumbersUsingWhile() {
		int i = 0;
		while (i<10) {
			System.out.println(i);
			i++;
		}
	}
	public static void printNumbersReverse() {
		int i = 10;
		while (i>0) {
			System.out.println(i);
			i=i-1;
		}
	}
	//infinite while - never stop, it will never go to rest of lines
	public static void printNumbersInfinite() {
		while (true) {
			System.out.println("Hi"); // while loop getting true always, doesn't care why and how, it needs to get true to go to next execution
		}
	}
	//infinite for loop
	public static void printNumbersInfiniteFor() {
		for(int i=0;;i++) { //no condition
			System.out.println("Hey" + i);
		}
	}
	public static void simpleProgram() {
		System.out.println(1>0);
	}
	public static void printNumbersDoWhile() {
		int i=0;
		do {
			System.out.println(i);
			i++;
		} while(i<10); //check cond after execution
	}
	
}
