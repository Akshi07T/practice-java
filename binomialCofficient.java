import java.util.Scanner;

public class binomialCofficient {
public static int factorial(int n){
    int factorial = 1;
    for(int i = 1; i<=n; i++){
        factorial = factorial*i;
    }
    return factorial;
}


    public static void calculateBinomialCofficient(int n, int r){
        int factorialOfn = factorial(n);
        int factorialOfr = factorial(r);
        int factorialnmr = factorial(n-r);

        int binomialCofficient = factorialOfn/(factorialOfr*factorialnmr);
        System.out.println(binomialCofficient);

    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int r = sc.nextInt();
            calculateBinomialCofficient(n, r);
        }

    }
}
