import java.util.Scanner;

public class decimalToBinary {

    public static void decimaltobinary(int n){
        int mynum = n;
        int binary = 0;
        int pow = 0;
        while(n>0){
            int rem = n%2;
            binary = binary + rem*((int)Math.pow(10, pow));
            pow++;
            n = n/2;


        }
        System.out.println("binary form of "+mynum+ "=" +binary);


    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            decimaltobinary(n);
        }

    }
    
}
