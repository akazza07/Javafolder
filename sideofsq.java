import java.util.*;
public class sideofsq {
    public static void main(String[]args){
        System.out.println("Enter of side =");
        try (Scanner sc = new Scanner(System.in)) {
            int side = sc.nextInt();
            int sq = side * side ;
            System.out.println("the area of square = " + sq);
        }

        
    }
    
}
