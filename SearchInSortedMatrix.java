public class SearchInSortedMatrix {

    // O(n+m)

    public static String findInMatrix(int matrix[][],int key){
        int row = 0;
        int col = matrix[0].length - 1;
        while(row <= matrix.length-1 && col >= 0){
            int start = matrix[row][col];
            if(start == key){
                return ("key is found at (" + row + "," + col+")");
            }
           else if(start < key){
               row++;
            }
            else if(start > key){
                col--;
            }
            
        } 
        
        return ("Key not found");

    }
    public static void main(String[] args) {
        int matrix[][] = {{10,20,30,40},
                          {15,25,35,45},
                          {27,29,37,48},
                          {32,33,39,50}};
        int key = 33;
        System.out.println(findInMatrix(matrix,key));
    }
}
