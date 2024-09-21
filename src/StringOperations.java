import java.util.Scanner;

public class StringOperations {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "";
        int choice;

        // Menu loop
        do {
            System.out.println("\n==== String Operations Menu ====");
            System.out.println("1. Set String");
            System.out.println("2. charAt()");
            System.out.println("3. length()");
            System.out.println("4. indexOf() - single character");
            System.out.println("5. indexOf() - substring");
            System.out.println("6. indexOf() - character with start position");
            System.out.println("7. lastIndexOf() - single character");
            System.out.println("8. lastIndexOf() - substring");
            System.out.println("9. lastIndexOf() - character with start position");
            System.out.println("10. substring() - start index");
            System.out.println("11. substring() - start and end index");
            System.out.println("12. valueOf() - int");
            System.out.println("13. valueOf() - boolean");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1: // Set the string
                    System.out.print("Enter a string: ");
                    str = scanner.nextLine();
                    break;

                case 2: // charAt()
                    System.out.print("Enter index for charAt: ");
                    int index = scanner.nextInt();
                    System.out.println("Character at index " + index + ": " + str.charAt(index));
                    break;

                case 3: // length()
                    System.out.println("Length of string: " + str.length());
                    break;

                case 4: // indexOf(char)
                    System.out.print("Enter a character to find its index: ");
                    char ch = scanner.next().charAt(0);
                    System.out.println("First occurrence of '" + ch + "': " + str.indexOf(ch));
                    break;

                case 5: // indexOf(String)
                    System.out.print("Enter substring to find its index: ");
                    String substr = scanner.nextLine();
                    System.out.println("First occurrence of substring \"" + substr + "\": " + str.indexOf(substr));
                    break;

                case 6: // indexOf(char, fromIndex)
                    System.out.print("Enter a character to find its index: ");
                    ch = scanner.next().charAt(0);
                    System.out.print("Enter starting index: ");
                    int fromIndex = scanner.nextInt();
                    System.out.println("First occurrence of '" + ch + "' from index " + fromIndex + ": " + str.indexOf(ch, fromIndex));
                    break;

                case 7: // lastIndexOf(char)
                    System.out.print("Enter a character to find its last index: ");
                    ch = scanner.next().charAt(0);
                    System.out.println("Last occurrence of '" + ch + "': " + str.lastIndexOf(ch));
                    break;

                case 8: // lastIndexOf(String)
                    System.out.print("Enter substring to find its last index: ");
                    substr = scanner.nextLine();
                    System.out.println("Last occurrence of substring \"" + substr + "\": " + str.lastIndexOf(substr));
                    break;

                case 9: // lastIndexOf(char, fromIndex)
                    System.out.print("Enter a character to find its last index: ");
                    ch = scanner.next().charAt(0);
                    System.out.print("Enter starting index: ");
                    fromIndex = scanner.nextInt();
                    System.out.println("Last occurrence of '" + ch + "' from index " + fromIndex + ": " + str.lastIndexOf(ch, fromIndex));
                    break;

                case 10: // substring(int beginIndex)
                    System.out.print("Enter starting index for substring: ");
                    int beginIndex = scanner.nextInt();
                    System.out.println("Substring from index " + beginIndex + ": " + str.substring(beginIndex));
                    break;

                case 11: // substring(int beginIndex, int endIndex)
                    System.out.print("Enter starting index for substring: ");
                    beginIndex = scanner.nextInt();
                    System.out.print("Enter ending index for substring: ");
                    int endIndex = scanner.nextInt();
                    System.out.println("Substring from index " + beginIndex + " to " + endIndex + ": " + str.substring(beginIndex, endIndex));
                    break;

                case 12: // valueOf(int)
                    System.out.print("Enter an integer to convert to string: ");
                    int intValue = scanner.nextInt();
                    System.out.println("String representation of " + intValue + ": " + String.valueOf(intValue));
                    break;

                case 13: // valueOf(boolean)
                    System.out.print("Enter a boolean value (true/false): ");
                    boolean boolValue = scanner.nextBoolean();
                    System.out.println("String representation of " + boolValue + ": " + String.valueOf(boolValue));
                    break;

                case 0: // Exit
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }
}

