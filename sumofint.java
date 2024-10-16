import java.util.*;

public class sumofint {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the integer");

        int digit = sc.nextInt();

        System.out.println("The Sum of your number is " + sumofno(digit));

    }

    public static int sumofno(int n){

        int sumofdigit = 0;
        while( n > 0){
            int lastdigit = n % 10;
            
            sumofdigit += lastdigit;
            n /=10;

            
        }
        return sumofdigit;
    }
}