public class FavouriteTimes3 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int minutes = scanner.nextInt();
        scanner.close();
        int hours = minutes / 60;
        int numberOfRemainingMinutes = minutes % 60; // To find the extra minutes
        System.out.println("The number of hours is " + hours);
        System.out.println("The number of remaining minutes is " + numberOfRemainingMinutes);
        
    }
}
