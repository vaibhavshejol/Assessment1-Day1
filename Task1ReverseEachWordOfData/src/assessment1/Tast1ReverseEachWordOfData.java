package assessment1;

import java.io.*;

public class Tast1ReverseEachWordOfData {

	private static String reverseWord(String word) {
		String symbol = "";
		// logic to separate symbol and word
		if (word.endsWith(",") || word.endsWith(".") || word.endsWith("!") || word.endsWith(";")) {
			symbol = word.substring(word.length() - 1);
			word = word.substring(0, word.length() - 1);
		}

		// here we reversed the word
		StringBuilder reversedWord = new StringBuilder(word);
		String reversed = reversedWord.reverse().toString();

		// here we return that reversed word with concatinating symbol for placing at last
		return reversed + symbol;
	}

	public static void main(String[] args) throws IOException {
		System.out.println("Application is working properly....\n");

		// here we set the path of input file
		FileReader f = new FileReader("D:\\Assessments\\Assessment1-Day1\\input.txt");
		BufferedReader br = new BufferedReader(f);

		// here we set the path where we want to print or write data
		FileWriter fw = new FileWriter("D:\\Assessments\\Assessment1-Day1\\output.txt", false);
		BufferedWriter bw = new BufferedWriter(fw);

		// here we declare an empty string for reading data.
		// and here we read data from file and convert it into character array for the
		// separating word because it help us to pick up single single word
		String line;
		System.out.println("\nOutput:\n");
		while ((line = br.readLine()) != null) {
			String[] words = line.split("\\s+");

			StringBuilder reversedLine = new StringBuilder();
			for (String word : words) {
				String reversedWord = reverseWord(word);
				reversedLine.append(reversedWord).append(" ");
			}
			// here we write data in file which we reversed
			bw.write(reversedLine.toString().trim());
			bw.newLine();
			System.out.println(reversedLine);
		}
		br.close();
		bw.close();

	}

}
