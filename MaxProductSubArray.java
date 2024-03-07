package array;

public class MaxProductSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maxProduct(int[] nums) {
		int min = nums[0];
		int max = nums[0];
		int result = nums[0];
		
		for(int i = 1; i < nums.length; i++) {
			int temp = max;
			max = Math.max(nums[i], Math.max(max * nums[i], min * nums[i]));
			min = Math.min(nums[i], Math.min(temp * nums[i], min * nums[i]));
			result = Math.max(max, result);
		}
		
		return max;
		
	}
}
