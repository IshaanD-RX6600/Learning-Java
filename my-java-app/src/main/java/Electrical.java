import java.util.Scanner; 
public class Electrical {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        int a = myObj.nextInt();
        int b = myObj.nextInt();
        int c = myObj.nextInt();
        int d = myObj.nextInt();
        int t = myObj.nextInt();
        myObj.close();
        int total = Math.abs(c-a) + Math.abs(d-b);
        if(t >= total && (t - total) % 2 == 0){
            System.out.println("Y");
        }
       
        else{
            System.out.println("N");
        }
    }
}
