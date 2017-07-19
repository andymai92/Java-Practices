package com.exercise01.andy;

import java.io.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		long result = 0;
		boolean valid = true;

		try {
			if (input == null)
				System.out.println("Empty input!");
			else {
				String[] array = input.split(",");
				if (array.length > 2 || array.length == 1) {
					System.out.println("Input MUST have 2 numbers only!");
					valid = false;
				} else {
					for (String str : array) {
						if (!str.matches("^[-+0-9]*$")) { // $ is to avoid
															// the pair
															// letter-digit,
															// such as 7B
							System.out.println("Numbers cannot contain letters!");
							valid = false;
							break;
						} else {
							result += Integer.parseInt(str);
						}
					}

				}

			}
			if (valid)
				System.out.println(result);

		} catch (Exception e) {
			System.out.println("Error occurred!");
		}

	}
}