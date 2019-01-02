package codingbat;

public class Array1 {
	
	/*
	 * Given an array of ints, return true if 6 appears as either the  
	 * first or last element in the array. The array will be length 1 or more.
	 */
	public static boolean firstLast6(int[] nums) {
		int last = nums.length - 1;
		boolean result = false;
		if(nums[0] == 6 || nums[last] == 6) {
			result = true;
		}
		return result;
	}
	
	/*
	 * Given an array of ints, return true if the array is length 1 or more,  
	 * and the first element and the last element are equal.
	 */
	public static boolean sameFirstLast(int[] nums) {
		int last = nums.length - 1;
		boolean result = false;
		if(nums.length >= 1 && nums[0] == nums[last]) {
			result = true;
		}
		return result;
	}
	
	public static int[] makePi() {
		int[] newarray;
		newarray = new int[3];
		newarray[0] = 3;
		newarray[1] = 1;
		newarray[2] = 4;
		return newarray;
	}
	
	/*
	 * Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last 
	 * element. Both arrays will be length 1 or more.
	 */
	public static boolean commonEnd(int[] a, int[] b) {
		boolean result = false;
		int lastA = a.length - 1;
		int lastB = b.length - 1;
		if(a[0] == b[0] || a[lastA] == b[lastB]) {
			result = true;
		}
		return result;
	}
	
	public static int sum3(int[] nums) {
		int sums = 0;
		for(int i = 0; i < nums.length; i++) {
			sums = sums + nums[i];
		}
		return sums;
	}
	
	public static void main(String[] args) {
		
	}
}
