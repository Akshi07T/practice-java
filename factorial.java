import java.util.Scanner;

public class factorial{
    public static void factorial_calculate(int n){
    int factorial = 1;
    for(int i =1; i<=n; i++){
        factorial = factorial*i;
    }
    System.out.println(factorial);
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            factorial_calculate(n);
        }

    }
    
}