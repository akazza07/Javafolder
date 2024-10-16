import java.util.*;
public class cost {
    public static void main(String[]args){
   try (Scanner sc = new Scanner (System.in)) {
    System.out.println("ENter the pen prize =");
       float pen = sc.nextFloat(); 
    
       System.out.println("Enter the pencil prize = ");
       float pencil = sc.nextFloat();
    
       System.out.println("Enter the Eraser prize = ");
       float eraser =sc.nextFloat ();
    
       float total = pen + pencil + eraser ;
    
       System.out.println(total);
    
       System.out.println("let's add on ur GST");
       float newtotal = total + (0.18f * total );
    
       System.out.println("The total bill with GST is = " + newtotal);
}


}

}
