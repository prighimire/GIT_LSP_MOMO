package org.howard.edu.lsp.midterm.question1;

public class SecurityOps {
    public static String encrypt(String text) {
        // Remove whitespace and punctuation from the input text
        String cleanText = text.replaceAll("[^a-zA-Z0-9]", "");

        StringBuilder encryptedText = new StringBuilder();
        // Iterate over the characters in the clean text
        for (int i = 0; i < cleanText.length(); i++) {
            char ch = cleanText.charAt(i);
            // Check if the index is even
            if (i % 2 == 0) {
                encryptedText.append(ch); // Append even-index characters
            }
        }
        // Iterate over the characters in the clean text again
        for (int i = 0; i < cleanText.length(); i++) {
            char ch = cleanText.charAt(i);
            // Check if the index is odd
            if (i % 2 != 0) {
                encryptedText.append(ch); // Append odd-index characters
            }
        }
        return encryptedText.toString();
    }

    public static void main(String[] args) {
        String originalText = "I love CSCI363";
        String encryptedText = encrypt(originalText);
        System.out.println("Original Text: " + originalText);
        System.out.println("Encrypted Text: " + encryptedText);
    }
}

