import java.util.Scanner;

public class Chilli {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        int Poblano = 1500;
        int Mirasol = 6000;
        int Serrano = 15500;
        int Cayenne = 40000;
        int Thai = 75000;
        int Habanero = 125000;

        int P = sc.nextInt(); 
        sc.nextLine(); 

        String[] peppers = new String[P];
        for (int i = 0; i < P; i++) {
            peppers[i] = sc.nextLine(); 
        }
        sc.close(); 

        int totalScovilleUnits = 0; 
        for (String pepper : peppers) { 
            switch (pepper) { 
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
                    System.out.println("Unknown pepper type: " + pepper); 
                    break;
            }
        }

        System.out.println(totalScovilleUnits); 
    }
}