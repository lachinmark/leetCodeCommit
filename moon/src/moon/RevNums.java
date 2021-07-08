package moon;

import java.util.Scanner;

public class RevNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		revNums();

	}
	public static void revNums() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		//String nums = Integer.toString(num);
		//for (int i=0;i<nums.length();i++) {
		//char x = nums.charAt(i);
		//}
		int reversedNum = 0;
		while (num != 0) {
		    reversedNum = reversedNum * 10 + num % 10;
		    num = num / 10;   
		}
		System.out.println(reversedNum);
	}

}
