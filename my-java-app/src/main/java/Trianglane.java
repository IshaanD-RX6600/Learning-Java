import java.util.Scanner;

public class Trianglane {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();
        int rows = 2;

        int[][] array = new int[rows][columns];

            for (int j = 0; j < columns; j++) 
            {
                for (int i = 0; i < rows; i++) 
                {
                    array[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < rows; i++) 
            {
                for (int j = 0; j < columns; j++) 
                {
                    System.out.print(array[i][j] + " ");
                    
                }
            }
        sc.close();
    }
}