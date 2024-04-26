package _01_Lambda_Methods;

import java.util.Random;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.

		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s) -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");

		// 2. Call the printCustonMessage method using a lambda so that the String
		// prints backwards.
		printCustomMessage((s) -> {
			char[] cArr = s.toCharArray();
			String reverse = "";
			for (int i = cArr.length - 1; i >= 0; i--) {
				reverse += cArr[i];
			}
			System.out.println(reverse);
		}, "testing");
		// 3. Call the printCustonMessage method using a lambda so that the String
		// prints with a mix between upper an lower case characters.
		printCustomMessage((s) -> {
			Random rand = new Random();
			char[] cArr = s.toCharArray();
			String mixedCaps = "";
			// StringBuilder mixed = new StringBuilder();
			// mixed.append(s);
			for (int i = 0; i < cArr.length; i++) {
				int j = rand.nextInt(2);
				if (j == 0) {
					mixedCaps += Character.toUpperCase(cArr[i]);
				} else {
					mixedCaps += Character.toLowerCase(cArr[i]);

				}
			}
			System.out.println(mixedCaps);
		}, "testing");
		// 4. Call the printCustonMessage method using a lambda so that the String
		// prints with a period in between each character.
		printCustomMessage((s) -> {
			StringBuilder periods = new StringBuilder();
			periods.append(s);
			String inBetween = "";
			for (int i = 0; i < periods.length(); i++) {
				inBetween += periods.charAt(i);
				inBetween += '.';
			}
			System.out.println(inBetween);
		}, "testing");
		// 5. Call the printCustonMessage method using a lambda so that the String
		// prints without any vowels.
		printCustomMessage((s) -> {
			StringBuilder consonants = new StringBuilder();
			consonants.append(s);
			String noVowels = "";
			for (int i = 0; i < consonants.length(); i++) {
				switch (consonants.charAt(i)) {
				case 'a':
					break;
				case 'e':
					break;
				case 'i':
					break;
				case 'o':
					break;
				case 'u':
					break;
				case 'A':
					break;
				case 'E':
					break;
				case 'I':
					break;
				case 'O':
					break;
				case 'U':
					break;
				default:
					noVowels += consonants.charAt(i);

				}

			}
			System.out.println(noVowels);
		}, "testing");

	}

	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
