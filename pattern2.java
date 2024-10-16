public class pattern2 {

    public static void inverse_pyramid(int n){
        // outer loops
        for ( int i =1 ; i<=n; i++){
            // inner loop 
            for(int j = 1 ; j<=i; j++){
                System.out.print(" *");
            
            }
            System.out.println();
        }
    }
    

    public static void inverted_half_pyramid_with_number(int n){
        // for outer loop 
        for( int i = 1 ; i <=n ; i++){
            // for inner loop
           for( int j = 1 ; j<= n-i+1 ;j++){
               System.out.print(j + " ");

           }     
           System.out.println();   
        }
    }

     public static void hollow_rectangle(int totrows , int totcolm){
        // for outer loop 
        for( int i = 1 ; i <= 4 ; i++){
            // for inner loop
            for( int j = 1 ; j <= 5 ; j++){
                if( i == 1 || i == totrows || j == 1 || j == totcolm ){
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
     }

     public static void inverted_rotated_half_pyramid( int n){
        // outer loop 
        for( int i = 1 ; i <= n ; i++){
            // for spaces
            for ( int j = 1 ; j <= n-i ; j++){
                System.out.print("  "); 
            }  
            // for stars
            for ( int j = 1 ; j <= i ; j++){
                    System.out.print(" *");
                }
                System.out.println();
            }
        }

        public static void floyds_triangle(int n){
            // for outer loop
            int counter = 1 ;
            for( int i = 1 ; i<=n ; i++){
                // innner loop - how many times counter be printed 
                for ( int j = 1 ; j <= i ; j++){
                    System.out.print(counter + " ");
                    counter++;

                }
                System.out.println();
            }
        }
        
        public static void zero_one_triangle(int n){
            // outer loop 
            for ( int i = 1 ; i<=n; i++){
                // inner loops 
                for( int j = 1 ; j<=i ;j++){
                    // if sum of two matrixs is even OR odd 
                    if ((i+j) % 2==0){
                        System.out.print("1 ");

                    }else{
                        System.out.print("0 ");
                    }
                }
                System.out.println();
            }
        }

        public static void butterfly(int n){
            // 1st half
            for( int i = 1; i<= n;i++){
                //star
                for( int j = 1 ; j <= i ;j++){
                    System.out.print("* ");
                }
                // spaces
                for (int j = 1 ; j<=2*(n-i);j++){
                    System.out.print("  ");
                }
                // star 
                for(int j = 1 ; j<=i; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            // 2nd half
            for ( int i = n ; i>=1 ; i--){
                //star
                for( int j = 1 ; j <= i ;j++){
                    System.out.print("* ");
                }
                // spaces
                for(int j = 1 ; j<=2*(n-i);j++){
                    System.out.print("  ");
                }
                // star 
                for(int j = 1 ; j<=i; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
public static void solid_rhombus(int n){
        // outer loops
        for( int i = 1; i<=n ; i++){
            // inner loops 
            for ( int j = 1 ; j<= n - i ; j++){
                System.out.print("  ");
            }
            for ( int j = 1 ; j<=n ; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
public static  void hollow_rhombus(int n){
    // outer loops 
    for ( int i = 1 ; i <= n ; i++){
        // spaces 
        for (int j = 1 ; j<=(n-i); j++){
            System.out.print("  ");
        }
        // hollow rectangle 
        for( int j =1 ; j <= n ; j++){
            if( i ==1 || i==n || j == 1 || j == n){
                System.out.print(" * ");
            } else {
                System.out.print("   ");
            }
        }
        System.out.println();
    }
}
    public static void diamond(int n){
        // 1st half 
        for ( int i = 1; i<=n ;i++){
            // spaces
            for( int j = 1 ; j <= n-i ; j++){
                System.out.print("  ");
            }
            // stars
            for ( int j = 1 ; j <= (2*i)-1;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
        // 2nd half
        for ( int i=n ;i>=1;i--){
            // spaces
            for( int j = 1 ; j <= n-i ; j++){
                System.out.print("  ");
            }
            // stars
            for ( int j = 1 ; j <= (2*i)-1;j++){
                System.out.print(" *");
            }
            System.out.println();

        }

    }    

    public static void main (String[]args){
         //inverse_pyramid(4);
         //inverted_half_pyramid_with_number(5);
         hollow_rectangle(4,5);
         //inverted_rotated_half_pyramid(4);
         //floyds_triangle(3);
         //zero_one_triangle(5);
         //butterfly(4);
         //solid_rhombus(4);
         //hollow_rhombus(5);
         //diamond(4);   
    }    
}
