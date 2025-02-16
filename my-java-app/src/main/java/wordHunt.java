import java.util.Scanner;

public class WordHunt {
    static int[] dx = {-1, -1, -1, 0, 1, 1, 1, 0}; // Row movement directions
    static int[] dy = {-1, 0, 1, 1, 1, 0, -1, -1}; // Column movement directions

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the word to search for
        String target = scanner.next();
        
        // Read grid size
        int N = scanner.nextInt();
        
        // Read the grid
        char[][] grid = new char[N][N];
        for (int i = 0; i < N; i++) {
            grid[i] = scanner.next().toCharArray();
        }
        
        scanner.close();

        // Count occurrences of the word in all directions
        int count = countOccurrences(grid, target, N);
        
        // Output the count
        System.out.println(count);
    }

    private static int countOccurrences(char[][] grid, String word, int N) {
        int wordLength = word.length();
        int count = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                // Check in all 8 possible directions
                for (int dir = 0; dir < 8; dir++) {
                    if (canFit(i, j, dir, N, wordLength) && searchFrom(grid, word, i, j, dir, wordLength)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    private static boolean canFit(int x, int y, int dir, int N, int length) {
        // Compute the last position in this direction
        int newX = x + (length - 1) * dx[dir];
        int newY = y + (length - 1) * dy[dir];

        // Check if it's inside the grid
        return newX >= 0 && newX < N && newY >= 0 && newY < N;
    }

    private static boolean searchFrom(char[][] grid, String word, int x, int y, int dir, int length) {
        for (int k = 0; k < length; k++) {
            int newX = x + k * dx[dir];
            int newY = y + k * dy[dir];

            if (grid[newX][newY] != word.charAt(k)) {
                return false;
            }
        }
        return true;
    }
}
