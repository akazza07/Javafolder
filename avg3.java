
import java.util.*;

public class avg3 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int x = sc.nextInt();
        System.out.println("enter the second number  ");
        int y = sc.nextInt();
        System.out.println("enter the third number ");
        int z = sc.nextInt();

        System.out.println(" The Avg no. is " + average( x, y, z ));
    }
    public static int average( int x , int y , int z){
            return( (x + y + z) / 3 );
    }
   
    }


