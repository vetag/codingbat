package codingbat;

public class Warmup2 {

	/*
	Given a string, return the count of the number of times that a substring length 2 appears in the string and 
	also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).
	 */
	public static int last2(String str) {
		int doublecount = 0;
		if(str.length() <= 1) {
			return doublecount;
		}
		String two_char = str.substring(str.length()-2, str.length());
		for(int i=0; i<str.length()-2; i++) {
			String matchingChar = str.substring(i, i + 2);
			System.out.println(matchingChar);
			if(matchingChar.equals(two_char)) {
				doublecount++;
			}
		}
		System.out.println(two_char);
		return doublecount;
	}

	/*
	 * Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
	 */
	public static boolean array123(int[] nums) {
		boolean ping1 = false;
		boolean ping2 = false;
		boolean ping3 = false;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 1) {
				ping1 = true;
			}
			if(nums[i] == 2) {
				ping2 = true;
			}
			if(nums[i] == 3) {
				ping3 = true;
			}
		}
		return ping1 && ping2 && ping3; 
	}

	/*
	 * Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
	 */
	public static String altPairs(String str) {
		String firstChar = "";
		String secondChar = "";
		String outputString = "";
		for(int i=0; i < str.length(); i += 4) {
			firstChar = str.substring(i, i + 1);
			if ((i + 2) <= str.length()) {
				secondChar = str.substring(i + 1, i + 2);
				outputString = outputString + firstChar + secondChar;
			}
			else {
				outputString = outputString + firstChar;
			}
		}
		return outputString;
	}

	/*
	 * Given an array of ints, we'll say that a triple is a value appearing 3
	 * times in a row in the array. Return true if the array does not contain any triples.
	 */
	public static boolean noTriples(int[] nums) {
		if(nums.length <= 2) {
			return true;
		}
		for(int i = 0; i <= nums.length - 2; i++) {
			int a = nums[i];
			if(a == nums[i+1] && a == nums[i+2]) {
				return false;
			}
		}
		return true;
	}

	/*
	 * Given a string and a non-negative int n, we'll say that the front of the string 
	 * is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;
	 */
	public static String frontTimes(String str, int n) {
		String firstThree = "";
		String copies = "";
		if(str.length() >= 3) {
			firstThree = str.substring(0, 3);
		}
		if(str.length() == 2) {
			firstThree = str.substring(0,2);
		}
		else if(str.length() == 1) {
			firstThree = str.substring(0,1);
		}
		else if(str.length() == 0) {
			return "";
		}
		for(int i = 0; i < n; i++) {
			copies = copies + firstThree;
		}
		return copies;
	}

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

		//		last2
		//		System.out.println(Warmup2.last2("xaxxaxaxx"));

		//		array123
		//		int[] nums = {1,2,5,6};
		//		System.out.println(Warmup2.array123(nums));

		//		altPairs
		//		System.out.println(Warmup2.altPairs("kitten"));

		//		int[] nums = {1,1,2,2,2,1};
		//		System.out.println(Warmup2.noTriples(nums));

		//		System.out.println(Warmup2.frontTimes("a", 4));

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
