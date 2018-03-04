package strings;

import java.util.Arrays;

public class StringManipulation {
	public static void main(String[] args) {
		StringManipulation stm = new StringManipulation();
		System.out.println(stm.reverse("abcd"));

		// Step 1 -write and test instructions in the main method
		String src = "hello";
		StringBuilder stb = new StringBuilder(src);
		String rev = stb.reverse().toString();

		System.out.println(src.equals(rev));

		String a = stm.middleTwo("code");
		System.out.println(a);

		System.out.println(stm.countChars("Java", 'a'));

		System.out.println(stm.addStrings("cat", "tomas"));
		System.out.println(stm.addStrings("Babak", "tomas"));

		System.out.println(stm.addStrings("Babak", ""));
		
		System.out.println(stm.addStrings("abc", ""));

	}

	/**
	 * Write method that reverses the input string
	 * 
	 * @param src
	 *            input
	 * @return reverse of input
	 */
	public String reverse(String src) {

		// TO DO
		StringBuilder stb = new StringBuilder(src);
		String rev = stb.reverse().toString();

		return rev;
	}

	/**
	 * Write the code that checks if a given input string is a palindrome
	 * 
	 * @param src
	 *            input string
	 * @return true if the input string is palindrome. False otherwise
	 */
	public boolean palindrome(String src) {
		// TO DO
		StringBuilder stb = new StringBuilder(src);
		String rev = stb.reverse().toString();
		if (src.equals(rev)) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * You have string of even length, return a string made of the middle two
	 * characters, so the string "string" returns "ri". The string length will be at
	 * least 2.
	 * 
	 * middleTwo("string") → "ri" middleTwo("code") → "od" middleTwo("Practice")
	 * → "ct"
	 * 
	 * 
	 */
	public String middleTwo(String str) {
		// TO DO
		String strMiddle = str.substring(str.length() / 2 - 1, str.length() / 2 + 1);

		return strMiddle;
	}

	/**
	 * write a method that accepts a string and returns another string containing
	 * only unique charters from argument
	 * 
	 * uniqueChars("aabc11234pp") -> "abc1234p" uniqueChars("hello") -> "helo"
	 * uniqueChars("java") -> "jva"
	 * 
	 * @param mixed
	 * @return
	 */

	public String uniqueChars(String mixed) {
		// TO DO
		StringBuilder sb = new StringBuilder(mixed);

		for (int i = 0; i < sb.length(); i++) {
			for (int j = i + 1; j < sb.length(); j++)
				if (sb.charAt(i) == sb.charAt(j)) {
					sb.deleteCharAt(i);
					j--;
				}

		}

		return sb.toString();
	}

	/**
	 * Write a method that accepts a string and a char your code needs to count how
	 * many argument chars appear in argument string
	 * 
	 * countChars("hello", 'l') -> 2 countChars("java", 'j') -> 1
	 * 
	 * @param str
	 * @param ch
	 * @return
	 */

	public int countChars(String str, char ch) {

		int charCount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (ch == str.charAt(i)) {
				charCount++;

			}
		}

		return charCount;
	}

	/**
	 * Write a method that takes has two string parameters. Your method should add
	 * those string together. So we pass "Hi" and "World", it should return
	 * "HiWorld". However, if when adding, if the last character of the first
	 * parameter is same as the first character of the second parameter, remove one
	 * of the characters. So we pass "hello" and "oscar", it should return
	 * "helloscar". addStrings("abc", "cat") → "abcat" addStrings("dog", "cat")
	 * → "dogcat" addStrings("abc", "") → "abc"
	 * 
	 * @param a
	 * @param b
	 * @return
	 */

	public String addStrings(String a, String b) {

		StringBuilder stb = new StringBuilder();

		stb.append(a).append(b);
		
		if (b.equals("")) {

			return stb.toString();
		}

		if (a.charAt(a.length() - 1) == b.charAt(0)) {
			stb.deleteCharAt(a.length() - 1);
		}

		return stb.toString();
	}

}
