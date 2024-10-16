import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int no=sc.nextInt();
        int temp=no;
        int reverse =0, rem;
        while(temp!=0){
            rem = temp%10;
            reverse = reverse*10+rem;
            temp=temp/10;
        }
        if(no==reverse){
            System.out.println("Number is a Palindrome");
        }
        else{
            System.out.println("Number is not a Palindrome");
        }
    }
}
