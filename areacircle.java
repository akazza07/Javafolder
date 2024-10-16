import java.util.*;
public class areacircle {
    public static void main(String[]args){
        System.out.println("enter the radius");
        try (Scanner sc = new Scanner (System.in)) {
            float rad = sc.nextFloat();
            
            float area = 3.14f * rad * rad ;
            System.out.print(area);
        }
    }
}