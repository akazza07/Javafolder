import java.util.*;

public class primeornot {

    public static boolean isPrime(int  n){

        if(n ==2 ){
            return true ;

        }
        for ( int i =2 ;i<=Math.sqrt(n);i++){
            if(n %i==0){
                return false;
            }
            return true;
        }
        return false;
         

    }
    public static void main (String args []){

        System.out.println(isPrime(3));
    }


    }
    

