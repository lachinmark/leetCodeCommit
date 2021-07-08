
public class LengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLastWord("Hi hey there"));
	}
	
    public static int lengthOfLastWord(String s) {
    	String[] strArr = s.split(" ");
    	int x = strArr.length - 1;
    	if (x>=0) {
    		String lastWord = strArr [x];
        	int y = lastWord.length();
        	return y;
    	}
    	else {
    		return 0;
    	}
    }
}
