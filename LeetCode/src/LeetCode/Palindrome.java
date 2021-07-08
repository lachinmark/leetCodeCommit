package LeetCode;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		palinCheck();
	}
	public static void palinCheck() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number to check: ");
		int poli = sc.nextInt();
		int x = poli;
		int revNum = 0;
		while (poli!=0) {
			revNum = (revNum*10 + poli%10);
			poli = poli/10;
		}
		if (revNum == x) {
			System.out.println("This number is a palindrome!");
		}
		else {
			System.out.println("Not a palindrome!");
		}
	}

}
