import java.util.Scanner;

public class Trianglane {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int columns = sc.nextInt();
        int rows = 2;

        int[][] array = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        sc.close();

        // System.out.println(array);
        // Lets check the color of the triangle
        int total = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (array[i][j] == 1) {
                    // System.out.print("black ");
                    total = total + 1;
                }
            }
            System.out.println(total * 3);
            break;
            // System.out.print(array[i][j] + " ");
        }
        System.out.println();   
    }

    void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
                
            }
            System.out.println();
        }
    }
}