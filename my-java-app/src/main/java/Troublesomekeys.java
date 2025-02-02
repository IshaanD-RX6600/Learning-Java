import java.util.Scanner;
public class Troublesomekeys {
         public static void main(String[] args) {
            Scanner myScanner = new Scanner(System.in);
            String firstInputString = myScanner.nextLine();
            String secondInputString = myScanner.nextLine();
            // System.out.println(firstInputString);
            // System.out.println(secondInputString);
            if(!firstInputString.equals(secondInputString))
            {
                for(int i = 0; i < firstInputString.length(); i++)
                {
                    if(firstInputString.charAt(i) != secondInputString.charAt(i))
                    {
                        System.out.println(firstInputString.charAt(i) + " " + secondInputString.charAt(i));
                        break;
                    }
                }
                if(firstInputString.length() != secondInputString.length())
                {
                    if(firstInputString.length() == secondInputString.length() + 1)
                    {
                        System.out.println(firstInputString.charAt(firstInputString.length() - 1));
                    }
                }
        }
                else
                {
                    System.out.println("No troublesome keys");
                }   
    }
}
