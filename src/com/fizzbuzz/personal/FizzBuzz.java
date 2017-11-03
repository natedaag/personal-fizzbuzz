//package com.fizzbuzz.personal;
//
//public class FizzBuzz {
//
//	public static void main(String[] args) {
//		for (int i = 1; i < 100; i++) {
//			if ((i % 3 == 0) && (i % 5 != 0)) {
//				System.out.println("FIZZ");
//			}
//			else if((i % 3 != 0) && (i % 5 == 0)) {
//				System.out.println("BUZZ");
//			}
//			else if((i % 15 == 0)) {
//				System.out.println("FIZZ-BUZZ");
//			}
//			else {
//				System.out.println(i);
//			}
//		}
//
//	}
//
//}

package com.fizzbuzz.personal;

/**
* @author natedaag
*
*/
public class FizzBuzz {

	public static final int DEFAULT_UPPER_LIMIT = 100;

	public static void main(String[] args) {
		int upperLimit = (args.length > 0) ? Integer.parseInt(args[0]) : DEFAULT_UPPER_LIMIT;
		emitFizzBuzz(upperLimit);
	}

//	private static void emitFizzBuzz(int limit) {
//		for (int i = 1; i <= limit; i++) {
//			String response = "";
//			if (i % 3 == 0) {
//				response += "Fizz";
//			}
//			if (i % 5 == 0) {
//				response += "Buzz";
//			}
//			if (response.length() == 0) {// Is response still empty?
//			response = String.format("%d", i);
//			}
//			System.out.println(response);
//
//		}
//	}
	private static void emitFizzBuzz(int limit){
		for (int i = 1; i < limit; i++){
			String response = "";
			if (i % 3 == 0){
				response += "Fizz";
			}
			if(i % 5 == 0) {
				response += "Buzz";
			}
			if (response.length() == 0) {
				response += i;
			}
			System.out.println(response);
		}
	}
	
}