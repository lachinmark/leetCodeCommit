
public class NumberOfBalls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {0,3,5};
		System.out.println(NumberOfBalls(arr));
	}
	
	static int NumberOfBalls(int[] arr) {
		int x = 0;
		int y = 0;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]!=((i+1)*(i+1))) {
				x = ((i+1)*(i+1)) - arr[i];
			}
			y = y + x;
		}
		return y;
	}

}