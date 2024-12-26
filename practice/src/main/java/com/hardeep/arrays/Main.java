/**
 * 
 */
package com.hardeep.arrays;

/**
 * @author hardeep
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "Hhardep ";
		System.out.println(" is duplicate isDuplicateStringCaseSensitiveASCII : "+DuplicateChar.isDuplicateStringCaseSensitiveASCII(str));
		System.out.println(" is duplicate isDuplicateStringCaseInsensitiveASCII: "+DuplicateChar.isDuplicateStringCaseInsensitiveASCII(str));
		System.out.println(" is duplicate isDuplicateWithoutASCII: "+DuplicateChar.isDuplicateWithoutASCII(str));
	}

}
