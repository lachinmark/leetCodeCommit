import java.util.ArrayList;
import java.util.List;

public class MaxTwoDigitNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num = "55204199";
		int list = stringToInt(num);
		System.out.println(list);
	}
	
	public static int stringToInt (String num) {
		List<Integer> myList = new ArrayList<Integer>();
		char[] charArr = num.toCharArray();
		for (int i=0; i<(charArr.length - 1); i++) { //Why its looping through charArr
			String newNum = String.valueOf(charArr[i]) + String.valueOf(charArr[i+1]);
			int intNum = Integer.parseInt(newNum);
			myList.add(intNum);
		}
		int max = myList.get(0);
		for (int i=1; i<myList.size();i++) {
			if (myList.get(i)>max) {
				max = myList.get(i);
			}
		}
		return max;  
	}
	public static List<Integer> stringToInt (List<Integer> list) { //Several methods with the same name but different parameters, OVERLOADING - check OOPS concepts
		return null;
	}

}
