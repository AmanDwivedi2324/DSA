
public class JavaBasics {
    public static void main(String[] args) {

        /* 
        Inverted star pattern 

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
        Half pyramid pattern
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
         Floyd's triangle

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
        Character pattern
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

    }
}
