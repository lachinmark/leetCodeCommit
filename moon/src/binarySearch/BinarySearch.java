package binarySearch;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int [6];
		arr[0] = 4;
		arr[1] = 9;
		arr[2] = 23;
		arr[3] = 37;
		arr[4] = 58;
		arr[5] = 86;
		System.out.println("What number are you looking for?");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean x = binarySearch(arr,num);
		if (x==true) {
			System.out.println("Item is found");
		}
		else {
			System.out.println("Item is not found");
		}
	}
	
	public static boolean binarySearch(int arr[],int searchElement) {
		int l = 0;
		int h = arr.length - 1;		
		while (l<=h) {
			int m = l+(h-l)/2;
			if (arr[m]==searchElement) {
				return true;
			}
			if (searchElement>arr[m]) {
				l=m+1;
			}
			if (searchElement<arr[m]) {
				h=m-1;
			}
		}
		return false;
	}

}
