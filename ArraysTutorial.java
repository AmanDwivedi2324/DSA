
import java.util.Scanner;
public class ArraysTutorial {

public static void outputArray(int []arr){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] + " ");
    }
}

public static void takeInput(int[] arr){
    Scanner sc = new Scanner(System.in);
    for(int i=0;i<arr.length;i++){
        sc.nextInt();
    }
}

    
public static int linearSearch(int arr[],int item){
    for(int i=0;i<arr.length;i++){
        if(arr[i] == item){ 
            return i;
        }
    }
    return -1;
}

public static int largest(int arr[]){
    int max =  Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i] > max){
            max = arr[i];
        }
    }
    return max;
}



public static int binarySearch(int arr[], int item){
    int n = arr.length;
    int start = 0;
    int end = n-1;
    while (start <= end) {
        int mid = (start + end)/2;
        if(arr[mid] == item){
            return mid;
        }
        if(arr[mid] > item){
            end = mid-1;
        }
        else{
            start = mid + 1;
        }

    }
    return -1;
}


public static void reverseArray(int arr[]){
    int n = arr.length;
    int start = 0;
    int end = n-1;
    int temp;
    while(start < end){
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }

}


public static void main(String[] args) { 
    
    int arr[] = {2,4,5,6,8,10,12};
    // takeInput(arr);
    // int key = 8;
    // int ans = binarySearch(arr, key);
    // if(ans == -1){
    //     System.out.println("Not found");
    // }
    // else{
    //     System.out.println("Element is present at " + ans + " index");
    // }
    // System.out.println(largest(arr));
    reverseArray(arr);
    // System.out.println(arr.toString());
    outputArray(arr);
 
    
}
}
