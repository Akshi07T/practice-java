import java.util.Scanner;;

public class numberPrime {
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
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            System.out.println(isprime(n));
        }
     



    }
}
