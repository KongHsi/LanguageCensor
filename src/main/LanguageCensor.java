package main;

import java.util.HashSet;
import java.util.Set;
import java.io.*;


public class LanguageCensor {
	public LanguageCensor(){
		
	}
	public static void main(String args[]) throws IOException {
		
		Set<String> swearWords = readDataFile();
		
	}

	/**
	 * This method generates a list of swear words.
	 * @return a set of swear words
	 */
	private static Set<String> readDataFile() throws IOException {
		// TODO
		Set<String> swearWordList = new HashSet<String>(); // TODO: or initialize swearWordList as null and create a set object the first time we put a word in
		FileReader in = null;
		
		try {
			in = new FileReader("swear_word_list.txt");
			BufferedReader br = new BufferedReader(in);
		    String line;
		    
		    
		    while ((line = br.readLine()) != null) {
		       //System.out.println(line);
		       
		       char firstChar = line.charAt(0);
		       
		       // We ignore all the terms with multiple words, which are
		       // marked by quotes around the term
		       if(firstChar != '"'){
		    	   System.out.println(line);
		       }
		    }
		    br.close();
		}
		finally {
	         if (in != null) {
	            in.close();
	         }
	      }
		
		
		return null;
	}
}
