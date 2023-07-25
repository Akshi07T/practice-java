import java.util.Scanner;

public class averageOfThree {
    
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            int sum = 0;
            int avg = 0;
            sum = n1+n2+n3;
            avg = sum/3;
            System.out.println(avg);
        }
        
    }
    
}
