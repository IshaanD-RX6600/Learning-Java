import java.util.Scanner;

public class FavouriteTimes {
        public static void main(String[]args) {
            Scanner sc = new Scanner(System.in);
            int a = 0, b = 2, c = 0, d = 0, x, y, z;
            int inputMinutes;
            
            Scanner inputScanner = new Scanner(System.in);
            inputMinutes = inputScanner.nextInt();
            inputScanner.close();

            String[] minutesByUser  = FavouriteTimes4.getTime(inputMinutes);
            //12, 27
            // 1, 04

            System.out.println("Minutes by user -> " + minutesByUser[0] + " " + minutesByUser[1]);


           String iterator;
           String fooTime;

            for(int i = 0; i <= inputMinutes; i++){

                if ( i < 10)
               {
                c = 0;
                d = i;
               }
               else
              {
                iterator = String.valueOf(i);
                char[] digits = iterator.toCharArray();
                c = Character.getNumericValue(digits[0]);
                d = Character.getNumericValue(digits[1]);
              } 

               x = b-a;
               y = d-c;
               z = c-b;

               if ( a !=0 )
              {
                if(x == y && y == z){

                    fooTime = a + "" + b + ":" + c + "" + d;
                    //System.out.println("Its a sequence  -> " + fooTime);
                }                
              }
              else
                {
                    if(y == z){
                        fooTime = a + "" + b + ":" + c + "" + d;
                        //System.out.println("Its a sequence  -> " + fooTime);
                    }
                }

        } 
    }
}
