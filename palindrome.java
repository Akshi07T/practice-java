import java.util.Scanner;

public class palindrome {

    public static void checkpalindrome(int n){
        int rem =0;
        int palindrome = 0;
       while(n>0){
        rem = n%10;
        palindrome = palindrome*10 + rem;
        n = n/10;
        
       }
       System.out.println(palindrome);


    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            checkpalindrome(n);
        }
        
        

    }
}
