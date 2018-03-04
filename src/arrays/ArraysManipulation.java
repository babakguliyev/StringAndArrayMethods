package arrays;

import java.util.Arrays;

public class ArraysManipulation {
	
	public static void main(String[] args) {
		ArraysManipulation arr= new ArraysManipulation();
		int[] arrr = {1,3,4,5,6,7};
		
		System.out.println(arr.sumOfOdds(arrr));
	}

	/**
	 * Write a method that received an integer array and returns the sum of all
	 * odd numbers in the array
	 * 
	 * @param array
	 * @return sum of odd numbers in the array
	 */
	public int sumOfOdds(int[] array) {
		int n=0;
		for(int i =0; i<array.length; i++) {
			if(array[i]%2==1 || array[i]==1||array[i]%2==-1) {
				n+=array[i];
			}
		}
		return n;
	}

	/**
	 * Write a method that takes an array of integers and returns a boolean. You
	 * method should return true if array contains three consecutive even number
	 * or three consecutive odd numbers. Return false otherwise. threeAmigos([2,
	 * 1, 3, 5]) → true threeAmigos([2, 1, 2, 5]) → false threeAmigos([2, 4, 2,
	 * 5]) → true
	 * 
	 */

	public boolean threeAmigos(int[] array) {
		// TO DO
		for(int i=0; i<array.length; i+=2) {
			if((array[i]%2==0 && array[i+1]%2==0 && array[i+2]%2==0)) {
				return true;
			}else if((array[i]%2==1 && array[i+1]%2==1 && array[i+2]%2==1) ) {
				return true;
			}
		}

		return false;
	}

	/**
	 * Write a method that takes an array of ints and returns a boolean. Return
	 * false if the array contain both 1 and 4.
	 * 
	 * dontLike4s1sTogether([1, 2, 3]) → true dontLike4s1sTogether([1, 2, 3, 4])
	 * → false dontLike4s1sTogether([2, 3, 4]) → true
	 * 
	 * @param array
	 * @return boolean
	 */
	public boolean dontLike4s1sTogether(int[] nums) {
		// TO DO
		if((Arrays.binarySearch(nums, 1)>=0) && (Arrays.binarySearch(nums, 4)>=0)) {
			return false;
		}
		return true;
	}

	/**
	 * 
	 * Write a method that takes an array of integers and returns a boolean.
	 * Return true if the array contains 1 and 2 later somewhere in the array,
	 * and 1 has to come before 2.
	 * 
	 * contains12([1, 3, 2]) → true contains12([3, 1, 2]) → true contains12([3,
	 * 1, 4, 5, 2]) → true contains12([3, 2, 4, 5, 1]) → false
	 * 
	 * @param nums
	 * @return boolean
	 */

	public boolean contains12(int[] nums) {

		// TO DO
//		if((Arrays.binarySearch(nums, 1)>=0) && (Arrays.binarySearch(nums, 2)>=0) 
//				&& (Arrays.binarySearch(nums, 1)) < (Arrays.binarySearch(nums, 2))) {
//			return true;
//		}
		
		for(int i=0; i<nums.length;i++) {
			for(int j=nums.length-1; j>=0; j--) {
				if((nums[i]==1) && (nums[j]==2)) {
					return true;
				}
				if((nums[i]==2) && (nums[j]==1)) {
					return false;
				}
			}
		}
			
			
		return false;
	}

	/**
	 * Write a method that takes an array of ints and returns a boolean. 
	 * Return true if that array contains two numbers anywhere in the array
	 * whose sum is 100
	 * 
	 * @param nums
	 * @return boolean
	 */
	public boolean make100With2(int[] nums) {
		// TO DO
		
		for(int i=0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				
				if(nums[i]+nums[j]==100) {
					return true;
				}else if((nums[i]==100) ||(nums[j]==100)) {
					return true;
				}
			}
		}
		return false;
	}

}
