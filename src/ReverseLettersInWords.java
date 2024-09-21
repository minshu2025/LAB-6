public class ReverseLettersInWords {

    public static void main(String[] args) {
        // Paragraph of text from Exercise 3
        String paragraph = "Java is a high-level programming language. It is widely used across the world.";

        // Reverse the letters of each word in the paragraph
        String reversedParagraph = reverseLettersInEachWord(paragraph);

        // Output the reversed paragraph
        System.out.println("Original Paragraph:");
        System.out.println(paragraph);
        System.out.println("\nReversed Letters in Words:");
        System.out.println(reversedParagraph);
    }

    // Method to reverse the letters of each word in the given string
    public static String reverseLettersInEachWord(String sentence) {
        // Split the sentence into words based on spaces
        String[] words = sentence.split(" ");

        // StringBuilder to store the final reversed words sentence
        StringBuilder result = new StringBuilder();

        // Loop through each word
        for (String word : words) {
            // Reverse the letters in the word
            String reversedWord = new StringBuilder(word).reverse().toString();
            result.append(reversedWord).append(" "); // Append reversed word and space
        }

        // Convert StringBuilder to String and trim any trailing spaces
        return result.toString().trim();
    }
}
