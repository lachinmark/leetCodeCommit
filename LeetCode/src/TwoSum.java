
public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] nums = {2,3,8,4,5};
		System.out.println(twoSum(nums, 10));
	}
	
	static int[] lastArr;
	
	public static String twoSum(int[] nums, int target) {
	for (int i=0;i<(nums.length);i++) {
		for (int j=i+1;j<nums.length;j++) {
			int x = nums[i];
			int y = nums[j];
			if ((x+y)==target) {
				lastArr = new int[2];
				lastArr[0] = i;
				lastArr[1] = j;
			}
		}
	}
	return java.util.Arrays.toString(lastArr);
    }

}
