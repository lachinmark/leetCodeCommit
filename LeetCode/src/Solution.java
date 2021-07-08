
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,5,6,100};
		int target = -151;
		int x = searchInsert(nums, target);
		System.out.println(x);
	}

    public static int searchInsert(int[] nums, int target) {
        for(int i=0; i<nums.length; i++) {
        	if (nums[i]==target) {
        		return i;
        	}
        	if (nums[i]>target) {
        		return i;
        	}
        	if (nums[nums.length-1]<target) {
        		return (nums.length);
        	}
        }
		return 0;
    }
}
