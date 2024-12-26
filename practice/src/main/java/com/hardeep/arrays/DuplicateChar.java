/**
 * 
 */
package com.hardeep.arrays;

import java.util.Arrays;

/**
 * @author harde
 *
 */
public class DuplicateChar {

	//Time complexity = O(n)
	//Space complexity = O(1)
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
	
	//Time complexity = O(n)
	//Space complexity = O(1)
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
	//Time complexity = O(n)
	//Space complexisty = O(1) no extra DS declared so no space
	public static boolean isDuplicateWithoutASCII(String str) {
		char[] str_arr = str.toCharArray();
		Arrays.sort(str_arr);
		for(int i=0;i<str_arr.length-1;i++) {
			if(str_arr[i]==str_arr[i+1]) {
				return true;
			}
		}
		return false;
	}
}
