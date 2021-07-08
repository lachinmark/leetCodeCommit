
public class StrInStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String one = "dfardfhvhghdzfghh";
		String two = "hgz";
		System.out.println(strStr(one, two));
	}
	public static int strStr(String haystack, String needle) {
		
		for(int i =0;i<haystack.length();i++) {
		
		 int firstIndex = haystack.indexOf(needle);
		 return firstIndex;
	}
}
