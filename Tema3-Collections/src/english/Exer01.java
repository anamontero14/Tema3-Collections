package english;

import java.util.Scanner;
import java.util.TreeMap;

public class Exer01 {

	static Scanner read = new Scanner(System.in);

	// list to store the words
	static TreeMap<String, String> wordList = new TreeMap<>();

	public static void main(String[] args) {

		// variable to store the phrase
		String phrase = "";

		String storeWords[];

		// counter
		int cont = 1;

		String aux;

		String value = "";

		System.out.print("Write a phrase: ");
		phrase = read.nextLine();

		while (!phrase.equalsIgnoreCase("end")) {

			// split the phrase into an array
			storeWords = phrase.split(" ");

			for (int i = 0; i < storeWords.length; i++) {
				value = "";
				value += cont + " ";

				if (storeWords[i].length() >= 3) {

					aux = wordList.get(storeWords[i]);

					if (aux == null) {
						wordList.put(storeWords[i], value);
					} else {
						
						
						
						value = wordList.get(storeWords[i]) + value;
						wordList.put(storeWords[i], value);

					}
				}

			}

			cont++;

			System.out.println(wordList);

			System.out.print("Write a phrase: ");
			phrase = read.nextLine();
		}

		System.out.println("End of program");

	}

}
