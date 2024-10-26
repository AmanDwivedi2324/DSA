
public class BianrySearch {

    public static int BinarySearch(int[] arr, int search){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        for(int i=0;i<n;i++){
            int mid = (start+end)/2;
            if(search == arr[mid]){
                return mid;
            }
            if(search > arr[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,7,58,451,1040,1200};
        int search = 452;
        int ans = BinarySearch(arr,search);
        if(ans == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element is found at index : " + ans);
        }
        
    }
    
}