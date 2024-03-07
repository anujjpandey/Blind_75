package array;
import java.util.HashSet;

//	Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//	
//			 
//	
//	Example 1:
//	
//	Input: nums = [1,2,3,1]
//	Output: true
//	Example 2:
//	
//	Input: nums = [1,2,3,4]
//	Output: false
//	Example 3:
//	
//	Input: nums = [1,1,1,3,3,4,3,2,4,2]
//	Output: true
//	
//	https://leetcode.com/problems/contains-duplicate/description/

public class ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//	Approach 1: Sort the array, and check in forLoop if nums[i] == nums[i+1]
	//	Approach 2: Use HashMap, put all the elements in map, and check in if condition, whether that key exist in map or not.
	
	//	Most efficient way to use HashSet
	public boolean containsDuplicate(int[] nums) {
		HashSet<Integer> set = new HashSet<>();
		for(int i : nums) {
			if(set.contains(nums[i])) return true;
			else set.add(nums[i]);
		}
		return false;
	}

}
