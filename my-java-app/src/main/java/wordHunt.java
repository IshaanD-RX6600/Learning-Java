import java.util.Scanner;

public class wordHunt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read the word to search for
        String word = scan.next();

        // Read the number of rows and columns
        int rows = scan.nextInt();
        int columns = scan.nextInt();

        scan.nextLine();

        // Read the grid
        char[][] grid = new char[rows][columns];
        for (int i = 0; i < rows; i++) {
            String[] characters = scan.nextLine().split(" "); // breal the line into characters
            for (int j = 0; j < columns; j++) {
                grid[i][j] = characters[j].charAt(0); // get the first character of the string
            }
        }

        scan.close(); 

        // Output the 2D array (for debugging purposes)
        System.out.println("The 2D array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

        // Search for the word vertically
        char firstLetter = word.charAt(0);

        verticalSearch(grid, word, rows, columns, firstLetter);
        // boolean found = true;
        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < columns; j++) {
        //         if (grid[i][j] == firstLetter) { 
        //             for (int k = 0; k < word.length(); k++) {
        //                 if(i + k >= rows || grid[i + k][j] != word.charAt(k)) {
        //                     found = false;
        //                     break;
        //                 }
        //             }
                    
        //         }
        //     }
        // }
        // if (found) {
        //     System.out.println("Found ");
        // }
        // else{
        //     System.out.println("Not found");
        // }
    }

    static void verticalSearch(char[][] grid, String word, int rows, int columns, char firstLetter) {
        boolean found = true;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (grid[i][j] == firstLetter) { 
                    for (int k = 0; k < word.length(); k++) {
                        if ( i + k >= rows ||  grid[i + k][j] != word.charAt(k) ) {

                            if (grid[i + k][j] == firstLetter)
                            {
                                recurse(k, rows, columns, grid, word);
                            }

                            found = false;
                            break;
                        }
                    } 
                }
        } 
    }
   
   if (found) {
            System.out.println("Found ");
        }
        else{
            System.out.println("Not found");
        }
    }

    static void recurse(int k, int rows, int columns, char[][] grid, String word) {



    }
}