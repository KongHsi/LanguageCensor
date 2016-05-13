package main;

import java.util.Set;

public class languageCheck {

	private Set<String> swearWords;
	private String outString = new String();
	
	//The constructor takes a set of data.
	public languageCheck(Set<String> swearWords) {
		this.swearWords = swearWords;
	}

	//This method takes an uncensored string, and outputs a string with all 
	//	bad words replaced.
	public String checkIt(String input) {
		String[] outArray = input.split(" ");

		for (String i : outArray) {
			String temp = new String();
			if (swearWords.contains(i)) {
				for (int count = 0; count < i.length(); count++)
					temp = temp + "*";
				outString = outString + temp + " ";
			} else {
				outString = outString + i + " ";
			}
		}
		return outString;
	}

}
