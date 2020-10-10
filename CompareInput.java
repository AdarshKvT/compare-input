package com.kvtsoft.demoapp;

import java.util.Scanner;

public class CompareInput {

	public static void main(String[] args) {

		String codeWord = "10101101100";
		System.out.println("Enter the " + codeWord.length() + " digit code below:\n");
		Scanner sn = new Scanner(System.in);
		String input = sn.nextLine().toString();

		boolean match = true;
		int ind = 0;
		if (input.length() == codeWord.length()) {
			for (int i = 0; i < codeWord.length(); i++) {
				// System.out.println(codeWord.charAt(i));

				char inputCharector = input.charAt(i);
				char codeCharector = codeWord.charAt(i);

				if (inputCharector != codeCharector) {
					ind = i;
					match = false;
					break;
				}

			}

			if (match == false) {
				System.out.println("\nError in input at " + ind + " Please enter the code: " + codeWord + " correctly");

			} else if (match == true) {
				System.out.println("\nWelcome to the secrete club!!");

			}

		} else {
			System.out.println("\nPlease enter the valid code of lenght " + codeWord.length() + ". The code is: "
					+ codeWord + " ");
		}

	}

}
