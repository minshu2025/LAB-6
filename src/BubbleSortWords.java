
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BubbleSortWords {

    public static void main(String[] args) {
        String text = readFromFile("textfile.txt");
        
        if (text != null) {
            // Extract words from the text
            String[] words = text.split("\\W+");  // Splitting based on non-word characters

            // Sort the words using bubble sort
            bubbleSort(words);

            // Display the sorted list of words
            System.out.println("Sorted words:");
            for (String word : words) {
                System.out.println(word);
            }
        } else {
            System.out.println("Could not read from the file.");
        }
    }

    // Method to read text from a file
    private static String readFromFile(String fileName) {
        StringBuilder content = new StringBuilder();

        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                content.append(scanner.nextLine()).append(" ");
            }

            scanner.close();
            return content.toString().trim();

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
            return null;
        }
    }

    // Method to perform bubble sort on an array of strings
    private static void bubbleSort(String[] words) {
        int n = words.length;
        boolean swapped;

        // Bubble sort algorithm
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent words lexicographically
                if (words[j].compareToIgnoreCase(words[j + 1]) > 0) {
                    // Swap words[j] and words[j + 1]
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two words were swapped, the array is already sorted
            if (!swapped) break;
        }
    }
}
