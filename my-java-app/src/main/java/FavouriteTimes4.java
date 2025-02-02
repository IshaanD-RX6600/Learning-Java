import java.util.Scanner;

public class FavouriteTimes4 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int a = myScanner.nextInt();
        myScanner.close();

        String[] fooTime =  getTime(a);

    }

    public static String[] getTime(int minutesByUser) {
        int a = minutesByUser;
        int b = 60;
        int minutes=0;

        int quotient = a / b;
        if ( a > 59)
        {
            minutes = a % b;
        }
        
       
        int startTime = 12;

        String fooTime[] = new String[2];

        if ( quotient >=1 )
        {
            if (minutes > 10){
                fooTime[0] = String.valueOf(quotient);
                fooTime[1] = String.valueOf(minutes);

            }
            else
            {
                fooTime[0] = String.valueOf(quotient);
                fooTime[1] = String.valueOf("0" + minutes);                
            }
            
        }
        else
        {
            if ( a < 10 && a > 0)
            {
                fooTime[0] = String.valueOf(startTime);
                fooTime[1] = String.valueOf("0" + a);
            }
            else
            {
                fooTime[0] = String.valueOf(startTime);
                fooTime[1] = String.valueOf(a);
            }
        }


        return fooTime;
    }
}