package LeetCode;

public class LongestPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = new String[] {"flower","flow","flight"};
		System.out.println(longestPrefix(arr));
	}
	public static String longestPrefix(String[] strs) {
		//answer from leetcode
		if (strs == null || strs.length == 0) return "";
	    for (int i = 0; i < strs[0].length() ; i++){
	        char c = strs[0].charAt(i);
	        for (int j = 1; j < strs.length; j ++) {
	            if (i == strs[j].length() || strs[j].charAt(i) != c)
	                return strs[0].substring(0, i);             
	        }
	    }
	    return strs[0];
	}

}
