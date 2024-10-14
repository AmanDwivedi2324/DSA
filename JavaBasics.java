
public class JavaBasics {
    public static void main(String[] args) {

        /* 
        1) Inverted star pattern 

            * * * * 
            * * * 
            * * 
            * 
        */ 

        // for(int i=4;i>=1;i--){
        //     for(int j=i;j>=1;j--){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


        /*

        2) 
         *
         **
         ***
         ****

         
         */

        //  for(int i=1;i<=4;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        //  }

        /*

        3) 
         *****
         *   *
         *   * 
         *****
         */
       
        // for(int i=1;i<=4;i++){
        //    for(int j = 1;j<=4;j++){
        //     if(i == 1 || i == 4 || j == 1 || j == 4){
        //         System.out.print("*");
        //     }
        //     else{
        //         System.out.print(" ");
        //     }
        //    }
        //    System.out.println();
        // }

        /*
        4)
           *
          **
         ***   
        ****
        
        */

        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=4-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=1;k<=i;k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        /*
        5)
         12345
         1234
         123
         12
         1
         */

        //  for(int i=1;i<=5;i++){
        //     for(int j=1;j<=5-i+1;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        //  }

        /*
        6) Half pyramid pattern
        1
        12
        123
        1234
        12345 

         */

        //  for(int i=1;i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        //  }


        /*
         7) Floyd's triangle

         1
         2 3
         4 5 6
         7 8 9 10
         11 12 13 14 15
         */

        //  int num = 1;
        //  for(int i=1;i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(num + " ");
        //         num++;
        //     }
        //     System.out.println();
        //  }

        /*
        8)
        1
        01
        101
        0101
        10101
         */

        //  for(int i=1;i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         if((i+j)%2==0){
        //             System.out.print("1");
        //         }
        //         else{
        //             System.out.print("0");
        //         }
                
        //     }
        //     System.out.println();
        //  }


        /*
        9) Character pattern
        A
        BC
        DEF
        GHIJ
         */

        //  char ch = 'A';
        //  for(int i=1;i<=4;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        //  }


        /*
        10)  Solid rhombus pattern

             *****
            *****
           *****
          *****
         *****

         */

        //  for(int i=1;i<=5;i++){
        //     for(int j=1;j<=5-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=1;k<=5;k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //  }

        /*
        11)  Hollow Rhombus pattern 

             *****
            *   *
           *   * 
          *   *
         *****
         */

        //  for (int i = 1; i <= 5; i++) {
        //     for(int j=1;j<=5-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=1;k<=5;k++){
        //         if(i==1 || i==5 || k==1 || k==5){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
                
        //     }
        //     System.out.println();
        //  }


        /*
        12)  Number Pyramid Pattern

                1
               2 2
              3 3 3
             4 4 4 4
            5 5 5 5 5    
         */

        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=5-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=1;k<=i;k++){
        //         System.out.print(i + " ");
        //     }
        //     System.out.println();
        // }

        /*

        13) Palindromic pattern
         
              1
            2 1 2
          3 2 1 2 3 
        4 3 2 1 2 3 4
      5 4 3 2 1 2 3 4 5   

         */

        //  for(int i=1;i<=5;i++){
        //     for(int j=1;j<=5-i;j++){
        //         System.out.print("  ");
        //     }
        //     for(int k=i;k>=1;k--){
        //         System.out.print(k + " ");
        //     }
        //     for(int l=1;l<=i-1;l++){
        //         System.out.print((l+1) + " ");
        //     }
        //     System.out.println();
        //  }


        /*
         
       14)  Diamond Pattern 

                *
               ***
              *****
             *******
             *******
              *****
               ***
                *
                
         */

        //  for(int i=1;i<=4;i++){
        //     for(int j=1;j<=4-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=1;k<=2*i-1;k++){
        //         System.out.print("*");
        //     }    
        //     System.out.println();
        //   }

        //   for(int i=4;i>=1;i--){
        //     for(int j=1;j<=4-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=1;k<=2*i-1;k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //   }


        /*
         
        Butterfly pattern

        *      *
        **    **
        ***  ***
        ********
        ********
        ***  ***
        **    **
        *      *

         */

        //  int n = 4;
        //  for(int i=1;i<=n;i++){
        //   for(int j=1;j<=i;j++){
        //     System.out.print("*");
        //   }
        //   for(int k=1;k<=(2*n-2*i);k++){
        //     System.out.print(" ");
        //   }
        //   for(int l=1;l<=i;l++){
        //     System.out.print("*");
        //   }
        //   System.out.println();
        //  }
        
        //  for(int i=1;i<=n;i++){
        //   for(int j=1;j<=n-i+1;j++){
        //     System.out.print("*");
        //   }
        //   for(int k=1;k<=(2*i-2);k++){
        //     System.out.print(" ");
        //   }
        //   for(int l=1;l<=(n-i+1);l++){
        //     System.out.print("*");
        //   }
        //   System.out.println();
        //  }

    }
}
