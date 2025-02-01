public class FavouriteTimes3 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int minutes = scanner.nextInt();
        scanner.close();
        int hours = 12;
        int numberOfRemainingMinutes = minutes % 60; // To find the extra minutes
        if(minutes > 59){
            hours = 1;
            System.out.println("The number of hours is " + hours);
            System.out.println("The number of minutes is " + numberOfRemainingMinutes);
        }
        else {
        System.out.println("The number of hours is " + hours);
        System.out.println("The number of minutes is " + numberOfRemainingMinutes);
        }
    }
}
