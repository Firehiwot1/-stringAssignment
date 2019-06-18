import java.util.Scanner;
public class StringAssignment {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);


            String text = "";
            int length, index;
            System.out.println("Please enter a word: ");

            text = sc.nextLine();
            length = text.length();
            System.out.println("Enter a number as an index:");
            index = sc.nextInt();
            if (index >= length) {
                System.out.println("Index is larger than length!");
            } else if (index >= 0 && index < length) {
                System.out.println("The length of " + text + " is: " + text.length());
                System.out.println("The substring from 0-" + index + " is " + text.substring(0, index));
            }
        }
    }


