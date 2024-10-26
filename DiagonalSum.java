public class DiagonalSum {

   public static void DiagonalSum(int matrix[][]){

        //brute force (O n^2)

        // int sum = 0;
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[i].length;j++){
        //         if(i == j){
        //             sum += matrix[i][j];         //for primary diagonal
        //         }else if(i+j == matrix.length-1){
        //             sum += matrix[i][j];       //for secondary diagonal
        //         }
        //     }
        // }
        // System.out.println(sum);


        //optimised approach (O n)

       

        int sum = 0;
        for(int i=0;i<matrix.length;i++){
            //pd
            sum += matrix[i][i];

            //sd
            if(i != matrix.length-1-i){
                sum += matrix[i][matrix.length-1-i];
            }
            
        }
        System.out.println(sum);
   }

    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};

         int matrix1[][] = {{1,2,3},
                          {5,6,7},
                          {9,10,11}
                          };
       
        DiagonalSum(matrix);
        DiagonalSum(matrix1);
    }
}
