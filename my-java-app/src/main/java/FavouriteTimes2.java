public class FavouriteTimes2 {
    public static void main(String[] args) {
        int someInt = 12, x, y;
        String number = String.valueOf(someInt);
        //System.out.println(number);
        char[] digits = number.toCharArray(); 
        //System.out.println(digits);
        //System.out.println(digits.length);
        for(int i = 0; i < digits.length; i++) {
            x = Character.getNumericValue(digits[0]);
            System.out.println(x);
        }
    }
}
