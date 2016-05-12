package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class LanguageCensor {

	public static void main(String args[]) throws IOException {
		
		String test = "this fuck is fucking shit";
		Set<String> swearWords = readDataFile();
		System.out.println(swearWords.size());

		languageCheck check = new languageCheck(swearWords);
		System.out.println(check.checkIt(test));

	}

	/**
	 * This method generates a list of swear words.
	 * 
	 * @return a set of swear words
	 */
	private static Set<String> readDataFile() throws IOException {
		// TODO
		Set<String> swearWordList = new HashSet<String>();

		FileReader in = null;
		try {
			in = new FileReader("swear_word_list.txt");
			BufferedReader br = new BufferedReader(in);
			String line;

			while ((line = br.readLine()) != null) {
				// System.out.println(line);

				char firstChar = line.charAt(0);

				// We ignore all the terms with multiple words, which are
				// marked by quotes around the term
				if (firstChar != '"') {
					swearWordList.add(line);
				}
			}
			br.close();
		} finally {
			if (in != null) {
				in.close();
			}
		}
		return swearWordList;
	}
}