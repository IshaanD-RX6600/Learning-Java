import java.util.Scanner;

public class comparingTwoStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String firstString = scanner.nextLine();
        System.out.println("Enter the second string:");
        String secondString = scanner.nextLine();
        if (firstString.equals(secondString)) {
            System.out.println("Both strings are equal");
        } else {
            System.out.println("Both strings are not equal");
        }
        scanner.close();
        
    }
}