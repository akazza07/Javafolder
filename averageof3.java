
import java.util.*;
public class averageof3 {
    public static void main(String[]args){
        System.out.println("Enter the number");
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int avg = (a + b + c)/3;
            System.out.println( "the avg is "+avg);
        } 
    }
    
    
}
