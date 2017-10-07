package com.fizzbuzz.personal;

public class FizzBuzz {

	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			if ((i % 3 == 0) && (i % 5 != 0)) {
				System.out.println("FIZZ");
			}
			else if((i % 3 != 0) && (i % 5 == 0)) {
				System.out.println("BUZZ");
			}
			else if((i % 15 == 0)) {
				System.out.println("FIZZ-BUZZ");
			}
			else {
				System.out.println(i);
			}
		}

	}

}
