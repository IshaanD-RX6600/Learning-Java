package HarvestWaterloo;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class HarvestWaterloo {
    public static void main(String[] args) 

    {
        Scanner myScanner = new Scanner(System.in);

        List<String> rows = new ArrayList<String>();
        
                

        Integer R = myScanner.nextInt();
        Integer C = myScanner.nextInt();

        for (int i = 0; i < R; i++)
        {
            String row = myScanner.next();
            rows.add(row);
        }
       

        System.out.println(rows.size());

        char[][] grid = new char[R][C];


        //outer for loop -> for rows
        for (int r = 0; r < R; r++)
        {
            // String line = myScanner.nextLine();
            //Inner for loop -> for columns
            for (int c = 0; c < C; c++)
            {
                grid[r][c] = rows.get(r).charAt(c);

               System.out.print(grid[r][c] + " ");
            }
            System.out.println(); 
        }

        myScanner.close();

    }
}
