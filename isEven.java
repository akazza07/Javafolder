
import java.util.*;
public class isEven {
    public static void main( String []args){
        Scanner sc = new Scanner (System.in);
         
        int num;

        System.out.println(" Enter your no .");
         num = sc.nextInt();

         if(isEven(num))
         {
            System.out.println(" no. is Even");
         } else{
            System.out.println("no. is Odd ");
         }
    }
    public static boolean isEven( int number ){
        if( number % 2 == 0 ){
        return true;
        } else{
            return false;
        }

    }
    
}
