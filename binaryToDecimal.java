import java.util.Scanner;

public class binaryToDecimal {
    public static void binarytodecimal(int n){
        int pow =0;
        int decimal = 0;
        while(n>0){
            int lastDigit = n%10;
            decimal = decimal + (lastDigit*(int)Math.pow(2, pow));
            pow++;
            n= n/10;
        }
        System.out.println(decimal);
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            binarytodecimal(n);
        }

    }
}
