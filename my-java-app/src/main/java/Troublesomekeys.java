import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Troublesomekeys {
         public static void main(String[] args) {
            Scanner myScanner = new Scanner(System.in);
            String firstInputString = myScanner.nextLine();
            String secondInputString = myScanner.nextLine();


        int firstInputStringLength = firstInputString.length();
        int secondInputStringLength = secondInputString.length();

        // How maany skip keys
        int difference = firstInputStringLength - secondInputStringLength;

        String firstInputStringNoDuplicate = "";


        if(difference > 1)
        {

            List<Character> duplicates = new ArrayList<>();

            for(int i = 0; i < firstInputStringLength -1; i++)
            {
                for(int j = i+1; j < firstInputStringLength; j++)
                {
                    if (firstInputString.charAt(i) == firstInputString.charAt(j))
                    {
                        if (!duplicates.contains(firstInputString.charAt(i)))
                        {
                            duplicates.add(firstInputString.charAt(i));
                        }
                        break;
                    }
                }
            }


            for (Character character : duplicates) {
                for (int i = 0; i < firstInputStringLength; i++) {
                    if (character != firstInputString.charAt(i)) {
                        firstInputStringNoDuplicate += firstInputString.charAt(i);
                    }

                }
            }

            //System.out.println(firstInputStringNoDuplicate);

            compareStrings(firstInputStringNoDuplicate, secondInputString);

            if (duplicates.size() != 0)
            {
                if (difference > 1)
                {
                    System.out.println(duplicates.get(0));
                }
            }

        }
        else if (difference == 0){
            compareStrings(firstInputString, secondInputString); 
            System.out.println("-");

        }
            
        else{
            compareStrings(firstInputString, secondInputString); 
            System.out.println("-");
        }
        }


        private static void compareStrings(String firstInputString, String secondInputString) {
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
            }
        }
}

