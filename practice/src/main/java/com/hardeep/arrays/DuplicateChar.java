/**
 * 
 */
package com.hardeep.arrays;

/**
 * @author harde
 *
 */
public class DuplicateChar {

	public static boolean isDuplicateStringCaseSensitiveASCII(String str) {
		if (str ==null || str.length() > 128)
			return true;

		boolean[] char_arr = new boolean[128];
		for (int i = 0; i < str.length(); i++) {

			int char_val = str.charAt(i);
			

			if (char_arr[char_val])
				return true;

			char_arr[char_val] = true;
		}
		return false;
	}
	
	public static boolean isDuplicateStringCaseInsensitiveASCII(String str) {
		if (str ==null || str.length() > 128)
			return true;

		boolean[] char_arr = new boolean[128];
		for (int i = 0; i < str.length(); i++) {

			int char_val = Character.toLowerCase(str.charAt(i));
			

			if (char_arr[char_val])
				return true;

			char_arr[char_val] = true;
		}
		return false;
	}
}
