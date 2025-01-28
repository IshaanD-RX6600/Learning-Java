import java.util.Scanner;

public class Delvidroid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int P = scanner.nextInt();
        int C = scanner.nextInt();
        scanner.close();
        if(P>C){
            System.out.println(P*50+500-C*10);
        }
        else{
            System.out.println(P*50-C*10);
        }
    }
    }