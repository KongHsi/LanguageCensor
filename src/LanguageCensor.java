

import java.util.Set;
import java.io.*;


public class LanguageCensor {
	public void main(String args[]) throws IOException {
		
		Set<String> data = readDataFile();
		
	}


	// Input: nothing
	// Output: a set of all the words in String
	// This method read from the data.txt and return a set of all the words.
	private Set<String> readDataFile() throws IOException {
		// TODO
	
		try (BufferedReader br = new BufferedReader(new FileReader("swear_word_list.txt"))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		       System.out.println(line);
		    }
		}
		
		
		return null;
	}
}
