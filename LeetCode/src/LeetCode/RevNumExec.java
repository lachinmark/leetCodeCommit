package LeetCode;

public class RevNumExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = reverse(1534236469);
		System.out.println(x);
	}
	public static int reverse(int x) {
		
		long revNum=0;
		while(x!=0){
			revNum = (revNum*10 + x%10);
			x = x/10;
		}
		if(revNum > Integer.MAX_VALUE || revNum < Integer.MIN_VALUE){
            return 0;
        }
		return (int) revNum;//implicit type casting from long to int
	}

}
