import java.util.*;
 public class MultiplicationTable 
 {
    /**
     * @param number
     */
    public static void printMultiplicationTable(int number){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter");
            int n = sc.nextInt();
            for(int i=1;i<=10;i++){
                System.out.println(n+"*"+ i +"="+n*i);
                if (i==10){
                    break;
                }
            }
        }
    }
    public static void main(String args[]){
        printMultiplicationTable(5);
    }
}

