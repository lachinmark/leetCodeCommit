package linearSearch;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val = linearSearch();
		if (val==-1) {
			System.out.println("Item not found");
		}
		else {
			System.out.println("Item found at index " + val);
		}

	}
	public static int linearSearch() {
		int [] arr = new int [6];
		arr[0] = 10;
		arr[1] = 15;
		arr[2] = 5;//middle element
		arr[3] = 25;
		arr[4] = 11;
		arr[5] = 36;
		Scanner sc = new Scanner (System.in);
		System.out.println("What number are you looking for?");
		int num = sc.nextInt();
		//boolean x = false;
		for (int i=0;i<arr.length;i++) {
			if (arr[i]==num) {
				//System.out.println("Found, index is " + i);
				//x=true;//initial value of boolean is false then change to true if found and the if still false then Not found.
				//break;
				return i;
			}
		}
		return -1;
	}
}
		/*if (x==false) {
			System.out.println("Not found");
		}

	}*/

		//method linear search, 
		//10, 15, 5, 25, 11, 36   Ask user WHich number you want to search?
		//Is it present in array => Found else not found


		//binary search works only for sorted arrays, works from middle element


