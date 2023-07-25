import java.util.Scanner;

public class mathMinFxn {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            System.out.println(Math.min(n1,n2));
            System.out.println(Math.max(n1,n2));
            System.out.println(Math.sqrt(n1));
            System.out.println(Math.pow(n2, n1));
            System.out.println(Math.abs(n2));

        }


    }
    
}
