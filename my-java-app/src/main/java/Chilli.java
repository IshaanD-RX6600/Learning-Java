import java.util.Scanner;

public class Chilli {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input from the user

        // Define the Scoville Heat Units (SHU) for each type of pepper
        int Poblano = 1500;
        int Mirasol = 6000;
        int Serrano = 15500;
        int Cayenne = 40000;
        int Thai = 75000;
        int Habanero = 125000;

        int P = sc.nextInt(); // Read the number of peppers
        sc.nextLine(); // Consume the newline character left by nextInt()

        String[] peppers = new String[P]; // Create an array to store the names of the peppers
        for (int i = 0; i < P; i++) {
            peppers[i] = sc.nextLine(); // Read each pepper name and store it in the array
        }
        sc.close(); // Close the Scanner object

        int totalScovilleUnits = 0; // Initialize the total Scoville units to 0
        for (String pepper : peppers) { // Iterate over each pepper name in the array
            switch (pepper) { // Check the pepper name and add the corresponding SHU to the total
                case "Poblano":
                    totalScovilleUnits += Poblano;
                    break;
                case "Mirasol":
                    totalScovilleUnits += Mirasol;
                    break;
                case "Serrano":
                    totalScovilleUnits += Serrano;
                    break;
                case "Cayenne":
                    totalScovilleUnits += Cayenne;
                    break;
                case "Thai":
                    totalScovilleUnits += Thai;
                    break;
                case "Habanero":
                    totalScovilleUnits += Habanero;
                    break;
                default:
                    System.out.println("Unknown pepper type: " + pepper); // Print a message for unknown pepper types
                    break;
            }
        }

        System.out.println(totalScovilleUnits); // Print the total Scoville units
    }
}