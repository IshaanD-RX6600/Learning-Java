public class FavouriteTimes3 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int minutes = scanner.nextInt();
        scanner.close();
        int hours = 12;
        int numberOfRemainingMinutes = minutes % 60; // To find the extra minutes
        if(minutes > 59 && minutes < 119){
            hours = 1;
            System.out.println(hours + ":" + numberOfRemainingMinutes);
        }
        else if(minutes > 119 && minutes < 179){
            hours = 2;
            System.out.println(hours + ":" + numberOfRemainingMinutes);
        }
        else if(minutes > 179 && minutes < 239){
            hours = 3;
            System.out.println(hours + ":" + numberOfRemainingMinutes);
        }
        else if(minutes > 239 && minutes < 299){
            hours = 4;
            System.out.println(hours + ":" + numberOfRemainingMinutes);
        }
        else if(minutes > 299 && minutes < 359){
            hours = 5;
            System.out.println(hours + ":" + numberOfRemainingMinutes);
        }
        else if(minutes > 359 && minutes < 419){
            hours = 6;
            System.out.println(hours + ":" + numberOfRemainingMinutes);
        }
        else if(minutes > 419 && minutes < 479){
            hours = 7;
            System.out.println(hours + ":" + numberOfRemainingMinutes);
        }
        else if(minutes > 479 && minutes < 539){
            hours = 8;
            System.out.println(hours + ":" + numberOfRemainingMinutes);
        }
        else if(minutes > 539 && minutes < 599){
            hours = 9;
            System.out.println(hours + ":" + numberOfRemainingMinutes);
        }
        else if(minutes > 599 && minutes < 659){
            hours = 10;
            System.out.println(hours + ":" + numberOfRemainingMinutes);
        }
        else if(minutes > 659 && minutes < 719){
            hours = 11;
            System.out.println(hours + ":" + numberOfRemainingMinutes);
        }
        else {
            System.out.println(hours + ":" + numberOfRemainingMinutes);
        }
    }
}
