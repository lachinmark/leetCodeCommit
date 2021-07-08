import java.util.Collections;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {2};
		int x = 3;
		System.out.println(removeElement(nums, x));
	}
	
	
	
public static int removeElement(int[] nums, int val) {
	int x = 0;
	int y = 0;
       for (int i = 0;i<nums.length;i++) {
    	   if(nums[i]==val) {
    		   nums[i] = -9;
    		   x = x + 1;
    	   }
       }
       y = nums.length - x;
       for(int j=0;j<nums.length;j++) {
    	   if (nums[j]==-9) {
    		   for(int i=nums.length-1;i>=nums.length-x;i--) {
    			   if(nums[i]!=-9) {
    				   nums[j]=nums[i];
    				   nums[i]=-9;
    				   break;
    			   }
    			   else {
    				   
    			   }
    		   }
    	   }
    	   
    	   else {
       }
    }
       return y;
}
}

