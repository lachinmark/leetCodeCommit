import java.util.Arrays;

public class ReverseInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(1396324351));
	}

	static char[] newIntArr;
	static int last;

	public static int reverse(int x) {
		try {
		if(-2147483648<= x && x <= 2147483647) {
			String str = Integer.toString(x);
			if (str.charAt(0)!='-') {
				char[] intArr = new char[str.length()];
				for (int i=0;i<str.length();i++) {
					char y = str.charAt(i);
					intArr[i] = y;
				}
				char[] newIntArr = new char[intArr.length];
				for(int i = 0;i<intArr.length;i++) {
					newIntArr[intArr.length-i-1] = intArr[i];
				}
				String newString = String.valueOf(newIntArr);
				int last1 = Integer.valueOf(newString);
				return last1;
			}
			else {
				char[] intArr = new char[str.length()-1];
				for (int i=1;i<str.length();i++) {
					char y = str.charAt(i);
					intArr[i-1] = y;
				}
				char[] newIntArr = new char[intArr.length];
				for(int i = 0;i<intArr.length;i++) {
					newIntArr[intArr.length-i-1] = intArr[i];
				}
				String newString = "-" + String.valueOf(newIntArr);
				int last1 = Integer.valueOf(newString);
				return last1;
			}

		}

		else {
			int y = 0;
			return y;
		}
		
		}
		catch(Exception e) {
			return 0;
		
	}
}

}
