
public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {2,2,4,4,5};
		System.out.println(singleNumber(nums));
	}
	
	static int x;
	
public static int singleNumber(int[] nums) {
        for (int i = 0;i<nums.length;i++) {
        	for (int j = 1;j<nums.length;j++) {
        		if(nums[i] == nums[j]) {
        			break;
        		}
        		else {
        			x=nums[i];
        			return x;
        		}
        	}
        }
        return x;
    }

}
