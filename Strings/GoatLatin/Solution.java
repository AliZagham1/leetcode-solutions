package Strings.GoatLatin;

public class Solution {
    public String toGoatLatin(String sentence) {
        // Define the list of vowels
        String vowels = "aeiouAEIOU";
        // Split the sentence into words
        String[] words = sentence.split(" ");
        // Create a StringBuilder to store the result
        StringBuilder result = new StringBuilder();
        // Iterate through each word
        for (int i = 0; i < words.length; i++) {
            StringBuilder word = new StringBuilder(words[i]);

            // Check if the first letter of the word is a vowel
            if (vowels.indexOf(word.charAt(0)) >= 0) {
                word.append("ma");
            } else {
                char first = word.charAt(0);
                word.deleteCharAt(0).append(first).append("ma");
            }

           // Append "a" to the end of the word
            for (int k = 0; k <= i; k++) word.append('a');

           // Append the word to the result
            if (i > 0) result.append(" ");
            result.append(word);
        }
        // Return the result
        return result.toString();
    }
    
}
