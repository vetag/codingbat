package codingbat;

public class Warmup2 {


	/*
	 * Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
	 */
	public static String stringBits(String str) {
		String str1 = "";
		String str2 = "";
		for(int i = 0; i < str.length(); i+=2) {
			str1 = str.substring(i, i+1);
			str2 = str2 + str1;	
		}
		return str2;
	}

	/*
	 * Given a non-empty string like "Code" return a string like "CCoCodCode".
	 */
	public static String stringSplosion(String str) {
		String str1 = "";
		String str2 = "";
		for(int i = 0; i <= str.length(); i++) {
			str1 = str.substring(0, i);
			str2 = str2 + str1;
		}
		return str2;
	}

	/*
	 * Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
	 */
	public static int countXX(String str) { 
		int count = 0;
		for(int i = 0; i < str.length()-1; i++) {
			if(str.substring(i, i+2).contentEquals("xx")) {
				count++;
			}
		}
		return count;
	}

	/*
	 * Given an array of ints, return the number of 9's in the array.
	 */
	public static int arrayCount9(int[] nums) {
		int count = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 9) {
				count++;
			}
		}

		return count;
	}

	/*
	 * SHOWED SOLUTION
	 * Given an array of ints, return true if one of the first 4 elements in the array is a 9. 
	 * The array length may be less than 4.
	 */
	public static boolean arrayFront9(int[] nums) {
		boolean tester = false;
		int end = nums.length;
		if(end > 4) {
			end = 4;
		}
		for(int i = 0; i < end; i++) {
			if(nums[i] == 9) {
				tester = true;
			}
		}
		return tester;
	}

	/*
	 * Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. 
	 * So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.
	 */

	public static int stringMatch(String a, String b) {
		String length2 = "";
		String string2 = "";
		int count = 0;
		for(int j = 0; j < b.length(); j++) {
			if(b.length() - j <= 1 || a.length() - j <= 1) {
				break;
			}
			length2 = a.substring(j, j+2);
			string2 = b.substring(j, j+2);
			if(length2.equals(string2)) {
				count++;
			}
		}
		return count;
	}

	/*
	 * DID NOT GET ANSWER CORRECT
	 * Given a string, return a version where all the "x" have been removed.
	 * Except an "x" at the very start or end should not be removed.
	 */
	public static String stringX(String str) {
		//		StringBuilder newString = new StringBuilder(str);
		//		for(int i = 1; i < str.length() - 1; i++) {
		//			//			System.out.println("This is the character: " + str.substring(i, i+1));
		//			if(str.substring(i, i+1).equals("x")) {
		//
		//				newString.delete(i-1, i);
		//
		//			}
		//			//			System.out.println(newString.toString());
		//		}
		//		return newString.toString();

		//		String replacement = "";
		//		for(int i = 1; i < str.length()-1; i++) {
		//			if(str.substring(i, i+1).equals("x")) {
		//				
		//			}
		//			//			replacement = str.replace('x', 'p');
		//			System.out.println(str.substring(i, i+1));
		//		}
		//		return replacement;

		//correct answer
		String result = "";
		for (int i=0; i<str.length(); i++) {
			// Only append the char if it is not the "x" case
			if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) {
				result = result + str.substring(i, i+1); // Could use str.charAt(i) here
			}
		}
		return result;
	}

	/*
	 * Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, 
	 * but the "a" can be any char. The "yak" strings will not overlap.
	 */
	public static String stringYak(String str) {
		String result = "";
		result = str.replaceAll("yak", "");
		return result;
	}

	/*
	 * Given an array of ints, return the number of times that two 6's are next to each other in the array. 
	 * Also count instances where the second "6" is actually a 7.
	 */
	public static int array667(int[] nums) {
		int counter = 0;
		for(int i = 0; i < nums.length - 1; i++) {
			if(nums[i] == 6 && nums[i+1] == 6) {
				counter++;
			}
			if(nums[i] == 6 && nums[i+1] == 7) {
				counter++;
			}
		}
		return counter;
	}

	/*
	 * Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5, 
	 * followed by the value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less from the  
	 * correct value.
	 * DUMB PROBLEM
	 */
	public static boolean has271(int[] nums) {
		boolean result = false;
		int tester1 = 0;
		int tester2 = 0;
		for(int i = 0; i < nums.length-2; i++) {
			tester1 = nums[i + 1] - nums[i];
			tester2 = nums[i] - nums[i+2];
			if(tester1 == 5 && Math.abs(tester2) <= 2) {
				result = true;
			}
		}
		return result;
	}
	public static void main(String[] args) {

		//stringBits
		//		System.out.println(new Warmup2().stringBits("Hello"));

		//		stringSplosion
		//		System.out.println(new Warmup2().stringSplosion("Code"));

		//		countXX
		//		System.out.println(new Warmup2().countXX("xxx"));
		//		

		// arrayCount9
		//		int[] nums;
		//		nums = new int[3];
		//		nums[0] = 1;
		//		nums[1] = 2;
		//		nums[2] = 9;
		//		System.out.println(new Warmup2().arrayCount9(nums));

		//		int[] nums;
		//		nums = new int[4];
		//		nums[0] = 1;
		//		nums[1] = 2;
		//		nums[2] = 9;
		//		nums[3] = 4;
		//		System.out.println(new Warmup2().arrayFront9(nums));

		//		stringMatch
		//System.out.println(new Warmup2().stringMatch("xxcaazz", "xxbaaz"));

		//		stringX
		//		System.out.println(new Warmup2().stringX("xxHxix"));

		//		stringYak
		//		System.out.println(new Warmup2().stringYak("yakpak"));

		//		array667
		//				int[] nums;
		//				nums = new int[4];
		//				nums[0] = 6;
		//				nums[1] = 6;
		//				nums[2] = 2;
		//				nums[3] = 6;
		//				System.out.println(new Warmup2().array667(nums));

		int[] nums;
		nums = new int[4];
		nums[0] = 1;
		nums[1] = 2;
		nums[2] = 7;
		nums[3] = 1;
		System.out.println(new Warmup2().has271(nums));
	}
}
