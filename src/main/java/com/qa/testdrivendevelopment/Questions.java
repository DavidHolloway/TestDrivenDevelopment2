package com.qa.testdrivendevelopment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Questions {
	/**
	 * EXAMPLE: THIS ONE HAS BEEN DONE FOR YOU <br>
	 * 
	 * Given a name, return "Hi" plus the name <br>
	 * <br>
	 * For Example:<br>
	 * greetingExample("John") → "Hi John" <br>
	 * greetingExample("Matt") → "Hi Matt" <br>
	 * greetingExample("Angelica") → "Hi Angelica"
	 * 
	 */
	public String greetingExample(String name) {
		return "Hi " + name;
	}

	/**
	 * Given a string and a char, returns the position in the String where the char
	 * first appears. Ensure the positions are numbered correctly, please refer to
	 * the examples for guidance. <br>
	 * Do not ignore case <br>
	 * Ignore whitespace <br>
	 * If the char does not occur, return the number -1. <br>
	 * <br>
	 * For Example: <br>
	 * returnPosition("This is a Sentence",'s') → 4 <br>
	 * returnPosition("This is a Sentence",'S') → 8 <br>
	 * returnPosition("Fridge for sale",'z') → -1
	 */
	public int returnPosition(String input, char letter) {
		String str1 = input;
		str1 = str1.replaceAll("\\s+", "");
		char c = letter;
		int position = 0;
		
		for (int i = 0; i < str1.length(); i++) {
			char n = str1.charAt(i);
			if (n == c) {
				int index = str1.indexOf(n);
				position = index + 1;
			}else if (str1.indexOf(c)<=0) {
				position = -1;
				
			}
		}
		return position;
	}

	/**
	 * Given two Strings of equal length, 'merge' them into one String. Do this by
	 * 'zipping' the Strings together. <br>
	 * Start with the first char of the first String. <br>
	 * Then add the first char from the second String. <br>
	 * Then add the second char from the first String. <br>
	 * And so on. <br>
	 * Maintain case. <br>
	 * You will not encounter whitespace. <br>
	 * <br>
	 * For Example: <br>
	 * zipped("String","Fridge") → "SFtrriidngge" <br>
	 * zipped("Dog","Cat") → "DCoagt"<br>
	 * zipped("True","Tree") → "TTrrueee" <br>
	 * zipped("return","letter") → "rleettutrenr" <br>
	 */
	public String zipped(String input1, String input2) {
		String result = "";
		String str1 = input1;
		String str2 = input2;
		String[] array1 = str1.split(",");
		String[] array2 = str2.split(",");

		for (int i = 0; i < array1.length || i < array2.length; i++) {
			if (i < array1.length) {
				result += array1[i];
			}
			if (i < array2.length) {
				result += array2[i];
			}
		}
		return result;
	}

	/**
	 * Given an Array of Strings, remove any duplicate Strings that occur, then
	 * return the Array. <br>
	 * Do not ignore case. <br>
	 * <br>
	 * For Example: <br>
	 * removeDuplicates({"Dog"}) → {"Dog"} <br>
	 * removeDuplicates({"Dog","Cat"}) → {"Dog","Cat"} <br>
	 * removeDuplicates({"Dog","Dog","Cat"}) → {"Dog","Cat"} <br>
	 * removeDuplicates({"Dog","DoG","Cat"}) → {"Dog","DoG","Cat"}
	 */
	public String[] removeDuplicates(String[] stringArray) {
		System.out.println(stringArray);
		//String[] list = new ArrayList<String>();
	    List<String> list = new ArrayList<String>();
	    String[] variableName = new String[5];


		
		for (int i =0;i<variableName.length;i++) {
			for (int j=0; j<variableName.length;j++) {
				if(stringArray[j].equals(stringArray[i])) {
				break;
				}else {
					list.add(stringArray[i]);
				}
			}
			
		}
		String[] strarray = list.toArray(new String[0]);

		return strarray;
	}

	/**
	 * Given a large string that represents a csv (comma separated values), the
	 * structure of each record will be as follows:
	 * owner,nameOfFile,encrypted?,fileSize <br>
	 * <br>
	 * Example:
	 * "Bert,private.key,True,1447\nBert,public.key,False,1318\nJeff,private.key,False,1445"
	 * <br>
	 * <br>
	 * Where a comma separates out the fields, and the \n represents a new line.
	 * <br>
	 * For each record, if it is not encrypted, return the names of the owners of
	 * the files in a String Array. <br>
	 * Do not include duplicate names. <br>
	 * <br>
	 * For Example: <br>
	 * csvScan("Jeff,private.key,False,1445") → {"Jeff"} <br>
	 * csvScan("Bert,private.key,True,1447\nBert,public.key,True,1318\nJeff,private.key,False,1445")
	 * → {"Jeff"} <br>
	 * csvScan("Bert,private.key,False,1447\nBert,public.key,False,1318\nJeff,private.key,False,1445")
	 * → {"Bert","Jeff"} <br>
	 * csvScan("Bert,private.key,True,1447\nBert,public.key,False,1318\nJeff,private.key,False,1445")
	 * → {"Bert","Jeff"}
	 */
	public String[] csvScan(String csvInput) {
		return null;
	}

	/**
	 * Write a function to randomly generate a list with 5 even numbers between 100
	 * and 200 inclusive. <br>
	 * <br>
	 * For Example: <br>
	 * listGen() → {100,102,122,198,200} <br>
	 * listGen() → {108,104,106,188,200} <br>
	 * listGen() → {154,102,132,178,164}
	 */
	public int[] listGen() {
		int[] nums = new int[5];
		Random ran = new Random();
		int upper = 200;
		int lower = 100;
		for (int i = 0; i < nums.length; ++i) {
	        nums[i] = ran.nextInt(upper - lower)+ lower;
	    }
		return nums;
	}

	/**
	 * A prime number is one which is only divisible by one and itself. <br>
	 * Write a function which returns the boolean True if a number is prime, and the
	 * boolean False if not. <br>
	 * <br>
	 * For Example: <br>
	 * isPrime(3) → True <br>
	 * isPrime(8) → False
	 */
	public boolean isPrime(int num) {
		boolean isPrime = true;
		for(int divisor=2; divisor<=num/2;divisor++) {
			if (num%divisor ==0) {
				isPrime= false;
				break;
			}
		}
		return isPrime;
	}
		
		

	

	/**
	 * Wrtie a function which returns the number of vowels in a given string. <br>
	 * You should ignore case. <br>
	 * <br>
	 * For Example: <br>
	 * getVowel("Hello") → 2 <br>
	 * getVowel("hEelLoooO") → 6
	 */
	public int getVowel(String input) {
		int count = 0;
		String str = input;
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {

				count++;
			}
		}

		return count;
	}

	/**
	 * Given two string inputs, if one can be made from the other return the boolean
	 * True, if not return the boolean False. <br>
	 * <br>
	 * For Example: <br>
	 * wordFinder("dog", "god") → True <br>
	 * wordFinder("tiredest", "tree") → True <br>
	 * wordFinder("dog", "cat") → False <br>
	 * wordFinder("tripping", "gin") → True
	 */
	public boolean wordFinder(String initialWord, String madeString) {
//		String str1 = initialWord;
//		String str2 = madeString;
//		String str3 ="";
//		String str4 ="";
		boolean bool = false;		
//		
////		int l1 = str1.length();
////		int l2 = str2.length();
//	    for (int i = 0; i < str1.length(); i++) {
//	        char toMatch = str1.charAt(i);
//
//	        if(str2.contains(toMatch)){
//	            System.out.println("Success");
//	            count++;
//	        }
//	    }
////		
//		
//	        char c[]=str1.toCharArray();
//	        char d[]=str2.toCharArray();
//	        Arrays.sort(c);
//	        Arrays.sort(d);
//	        
//	        str3=new String(c);
//	        str4=new String(d);
//	        System.out.println(str3);
//	        System.out.println(str4);
//	        if(str3.contains(str4)) {
//	            bool = true;
//	            System.out.println("true");
//	        }else if(str4.contains(str3)) {
//	        	bool = true;
//	        	System.out.println("false");
//	        }
//	        else
//	            bool = false;
		
		return bool;
		
	}

	/**
	 * There is a well known mnemonic which goes "I before E, except after C", which
	 * is used to determine which order "ei" or "ie" should be in a word. <br>
	 * <br>
	 * Write a function which returns the boolean True if a string follows the
	 * mnemonic, and returns the boolean False if not. <br>
	 * <br>
	 * For Example: <br>
	 * iBeforeE("ceiling") → True <br>
	 * iBeforeE("believe") → True <br>
	 * iBeforeE("glacier") → False <br>
	 * iBeforeE("height") → False
	 */
	public boolean iBeforeE(String input) {
		String word = input;
		boolean bool = false;
		if (word.contains("ie")) {
			if (word.contains("cie")) {
				bool = false;
			}
			bool = true;
		}
		if (word.contains("ei")) {
			if (word.contains("cei")) {
				bool = true;
			}
			bool = false;

		}
		return bool;
	}

//		if(!word.contains("c")&&word.contains("ie")) {
//			return true;
//		}else if (word.contains("cei")) {
//			return true;
//		}else if (!word.contains("c")&&word.contains("ei")) {
//			return true;
//		}else if (word.contains("cie")) {
//			return true;
//		}else {
//		return false;
//		}

	/**
	 * A factorial is the product of itself and all previous numbers <br>
	 * eg 3 factorial is 1 x 2 x 3 = 6 <br>
	 * <br>
	 * Write a function which can compute the factorial of a given number between 1
	 * and 10 inclusive. <br>
	 * <br>
	 * For Example: <br>
	 * factorial(1) → 1 <br>
	 * factorial(4) → 24 <br>
	 * factorial(8) → 40320
	 */
	public int factorial(int number) {
		if (number == 0)
			return 1;

		return number * factorial(number - 1);

	}

}
