import java.util.Scanner;

public class primesInRange {
    public static boolean isprime(int n){
        if( n ==2){
            return true;
        }

        for(int i = 2; i<=Math.sqrt(n); i++ ){

        if(n%i==0){

            return false;
        }
        
        }
        return true;
    }
    public static void primesinRange(int n){

    for(int i = 2; i<=n; i++){
        if(isprime(i)){
            System.out.println(i+" ");
        }
    }
        
    }


    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            primesinRange(n);
        }
    }
    
}
