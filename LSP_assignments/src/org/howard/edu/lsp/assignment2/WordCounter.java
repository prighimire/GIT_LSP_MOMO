package org.howard.edu.lsp.assignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCounter {
				
	public static void main(String[] args) {
		//Specifying the path to the file
		String filepath = "src/org/howard/edu/lsp/assignment2/words.txt";
				
		//Creating a new file object
		File file = new File(filepath);
		
		//Creating a new map to store words
		
		Map<String, Integer> wordFrequencies = new HashMap<>();
		
		
		try {
			//creating a scanner to read a new file
			
			Scanner scanner = new Scanner(file);
			
			
			//read and print words from the file
			
			
			while (scanner.hasNext()) {
				
				String word = scanner.next();
				
				processWords(word, wordFrequencies );
				
			}
			
			//closing the scanner
			scanner.close();
			
			//displaying word frequencies
			displayWordFrequencies(wordFrequencies);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void processWords(String word, Map<String, Integer> wordFrequencies) {
		//Ignore trivial words less than 3 letters
		if (word.matches("[a-zA-Z]+")) {
			if (word.length() > 3) {
				
				word = word.toLowerCase();
						
				wordFrequencies.put(word, wordFrequencies.getOrDefault(word, 0) + 1);
			}
		}
	}
	
	
	public static void displayWordFrequencies(Map<String, Integer> wordFrequencies) {
		//Display word frequencies
		for (Map.Entry<String, Integer> entry: wordFrequencies.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
	}
}