public class NumberOfOccurenceInMatrix {

    public static int searchInMatrix(int[][] matrix, int key){
        int occurence = 0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j] == key)
                {
                    occurence++;
                }
            }
        }
        return occurence;
    }

    public static int sumOfNumber(int[][] matrix){
        int sum = 0;
        for(int j=0;j<matrix[0].length;j++){
            sum += matrix[1][j];
        }
        return sum;

    }

    public static void transpose(int matrix[][]){
        int n = matrix.length;
        int m = matrix[0].length;
        int transpose[][] = new int[m][n];


        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        for(int i=0;i<transpose.length;i++){
            for(int j=0;j<transpose[0].length;j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
       
    }

    public static void main(String[] args) {
        int matrix[][] = {{1,4,9},
                          {11,4,3}};

        int key = 7;

        // System.out.println(searchInMatrix(matrix, key));
        // System.out.println(sumOfNumber(matrix));
        transpose(matrix);
    }
}
