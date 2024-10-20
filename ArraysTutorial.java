import java.util.*;
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

public static void pairs(int []arr){
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++)
        {
            System.out.print("(" + arr[i] + "," + arr[j] + ")");
        }
        System.out.println();
    }
}

public static void printSubArrays(int []arr){
    for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr.length;j++){
            for(int k=i;k<=j;k++){
                System.out.print(arr[k]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

public static void maxSubArraySum(int []arr){
    int sum = 0;
    int max = Integer.MIN_VALUE;

    for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr.length;j++){
            for(int k=i;k<=j;k++){
                System.out.print(arr[k] + " ");
                sum += arr[k];
            }
            System.out.print("& sum is "+  sum);
            if(sum > max){
                max = sum;
            }
            sum = 0;
            System.out.println();
        }
        System.out.println();
    }
    System.out.println("Max subarray sum is : " + max);
}


public static void prefixSum(int[] arr){ 
    int n = arr.length;
    int sum = 0;
    int max = Integer.MIN_VALUE;
    int[] prefix = new int[n];
    prefix[0] = arr[0];
    for(int i=1;i<n;i++){
        prefix[i] = prefix[i-1] + arr[i];
    }
    // outputArray(prefix);

    for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
            sum = i == 0? prefix[j] : prefix[j] - prefix[i-1];
            if(sum > max){
                max = sum;
            } 
        }
    }
    System.out.println("Max subarray sum is : " + max);
}


public static void KadanesTheorem(int arr[]){
    int sum = 0;
    int max = Integer.MIN_VALUE;

    for(int i=0;i<arr.length;i++){
        sum = sum + arr[i];
        if(sum < 0){
            sum = 0;
        }
        // if(max < sum){
        //     max = sum;
        // }
        max = Math.max(sum, max);
    }
    System.out.println("Max subarray sum is : " + max);
}

public static void buyAndSellStocks(int[] arr){
    int n = arr.length;
    int[] min = new int[n];
    min[0] = arr[0];
    for(int i=1;i<n;i++){
        min[i] = arr[i]<min[i-1] ? arr[i]:min[i-1]; 
    }
    // outputArray(min);

    int profit = 0;
    for(int i=1;i<n;i++){
        int temp = arr[i] - min[i-1];
        if(temp > profit){
            profit = temp;
        }
    }
    System.out.println("Maximum profit is : " + profit);
    
}
public static void main(String[] args) { 
    
    int arr[] = {7,1,5,3,6,4};

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
    // reverseArray(arr);
    // System.out.println(arr.toString());
    // outputArray(arr);

    // pairs(arr);
    // printSubArrays(arr);
    // maxSubArraySum(arr);
    // prefixSum(arr);
    // KadanesTheorem(arr);
    buyAndSellStocks(arr);
    
}
}
