
import java.util.Scanner;

public class StringBufferOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        int choice;

        // Menu loop
        do {
            System.out.println("\n==== StringBuffer Operations Menu ====");
            System.out.println("1. Set StringBuffer");
            System.out.println("2. charAt()");
            System.out.println("3. append()");
            System.out.println("4. capacity()");
            System.out.println("5. length()");
            System.out.println("6. delete()");
            System.out.println("7. deleteCharAt()");
            System.out.println("8. insert()");
            System.out.println("9. reverse()");
            System.out.println("10. replace()");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1: // Set the StringBuffer
                    System.out.print("Enter a string to set: ");
                    String str = scanner.nextLine();
                    sb = new StringBuffer(str);
                    System.out.println("StringBuffer set to: " + sb);
                    break;

                case 2: // charAt()
                    System.out.print("Enter index for charAt: ");
                    int index = scanner.nextInt();
                    System.out.println("Character at index " + index + ": " + sb.charAt(index));
                    break;

                case 3: // append()
                    System.out.print("Enter a string to append: ");
                    String toAppend = scanner.nextLine();
                    sb.append(toAppend);
                    System.out.println("StringBuffer after append: " + sb);
                    break;

                case 4: // capacity()
                    System.out.println("Capacity of StringBuffer: " + sb.capacity());
                    break;

                case 5: // length()
                    System.out.println("Length of StringBuffer: " + sb.length());
                    break;

                case 6: // delete()
                    System.out.print("Enter start index for delete: ");
                    int startIndex = scanner.nextInt();
                    System.out.print("Enter end index for delete: ");
                    int endIndex = scanner.nextInt();
                    sb.delete(startIndex, endIndex);
                    System.out.println("StringBuffer after delete: " + sb);
                    break;

                case 7: // deleteCharAt()
                    System.out.print("Enter index for deleteCharAt: ");
                    index = scanner.nextInt();
                    sb.deleteCharAt(index);
                    System.out.println("StringBuffer after deleteCharAt: " + sb);
                    break;

                case 8: // insert()
                    System.out.print("Enter index for insertion: ");
                    index = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter string to insert: ");
                    String toInsert = scanner.nextLine();
                    sb.insert(index, toInsert);
                    System.out.println("StringBuffer after insert: " + sb);
                    break;

                case 9: // reverse()
                    sb.reverse();
                    System.out.println("StringBuffer after reverse: " + sb);
                    break;

                case 10: // replace()
                    System.out.print("Enter start index for replace: ");
                    startIndex = scanner.nextInt();
                    System.out.print("Enter end index for replace: ");
                    endIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter string to replace with: ");
                    String toReplace = scanner.nextLine();
                    sb.replace(startIndex, endIndex, toReplace);
                    System.out.println("StringBuffer after replace: " + sb);
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
