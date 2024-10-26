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

public static boolean duplicateInArray(int[] arr){
    Arrays.sort(arr);
    int n = arr.length;

    for(int i=1;i<n;i++){
        if(arr[i] == arr[i-1]){
            return true;
        }
    }
    return false;
}


public static boolean duplicateInArrayUsingSet(int[] arr){
    HashSet<Integer> hs = new HashSet<>();
    for(int i=0;i<arr.length;i++){
        if(hs.contains(arr[i])){
            return true;
        }else{
            hs.add(arr[i]);
        }
    }
    return false;
}

public static int indexOfTarget(int[] arr, int target){
    
    for(int i=0;i<arr.length;i++){
        if(arr[i] == target){
            return i;
        }
    }
    return -1;
}

public static void maxProfit(int[] arr){
    int n = arr.length;
    int[] temp = new int[n];
    temp[0] = arr[0];
    for(int i=1;i<n;i++){
      temp[i] = arr[i]<temp[i-1]?arr[i]:temp[i-1];
}
    int maxProfit = 0;
    for(int i=0;i<n;i++){
        int tempProfit = arr[i] - temp[i];
        if(tempProfit > maxProfit){
            maxProfit = tempProfit;
        } 
    }
    System.out.println("Max profit is : " + maxProfit);
    // outputArray(temp);

}

public static char[] mid(String str){
    int n = str.length();
   
    if(n%2==0){
        char temp[] = new char[2];
        temp[0] = str.charAt(n/2 -1);
        temp[1] = str.charAt(n/2);
        return temp;
    }else{
        char[] temp1 = new char[1];
        temp1[0] = str.charAt(n/2);
        return temp1;
    }
}

public static void bubbleSort(int[] arr){
    for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length-1-i;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
    outputArray(arr);
}

public static void selectionSort(int[] arr){
   for(int i=0;i<arr.length;i++){
    int minPos = i;
    for(int j=i+1;j<arr.length;j++){
        if(arr[minPos] > arr[j]){
            minPos = j;
        }
    }
    //swap

    int temp = arr[minPos];
    arr[minPos] = arr[i];
    arr[i] = temp;
   }
   outputArray(arr);
}



public static void main(String[] args) { 
    
    int arr[] = {7,6,4,3,1,45,748,65};

    // int arr1[] = {1,2,3,1};
    // int arr2[] = {1,2,3,4};
    // int arr3[] = {1,1,1,3,3,4,3,2,4,2};

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
    // buyAndSellStocks(arr);
    // System.out.println(duplicateInArrayUsingSet(arr1));
    // System.out.println(duplicateInArrayUsingSet(arr2));
    // System.out.println(duplicateInArrayUsingSet(arr3));
    // System.out.println(indexOfTarget(arr,0));
    // System.out.println(indexOfTarget(arr,3));
    // maxProfit(arr);
    
    // System.out.println(mid("Abhishek"));
    // System.out.println(mid("Yogesh"));
    // System.out.println(mid("Devendraa"));
    // System.out.println(mid("Yogesh"));
    // bubbleSort(arr);  
    selectionSort(arr);  
 
}
}
