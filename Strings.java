
import java.util.*;
public class Strings {

    public static boolean isPalindrome(String str)
    {
        // String check = "";
        // for(int i = str.length()-1;i>=0;i--){
        //     check += str.charAt(i);
        // }
        // if(str.equals(check)){
        //     return true;k
        // }
        // return false;

        int start = 0;
        int end = str.length()-1;
        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
     }

     public static String subStr(String str,int start,int end){
        String subStr = "";
        for(int i=start;i<end;i++){
            subStr += str.charAt(i);
        }
        return subStr;
     }

     public static String largestString(String[] str){

        //time complexity == O(x * n) where x is length of string and n is size of array
        String largest = str[0];
        for(int i=1;i<str.length;i++){
            if(largest.compareToIgnoreCase(str[i]) < 0){
                largest = str[i];
            }
        }
        return largest;
     }

     public static void toUpperCase(String str){
       StringBuilder sb = new StringBuilder("");
       char ch = Character.toUpperCase(str.charAt(0));
       sb.append(ch);

       for(int i=1;i<str.length();i++){
        if(str.charAt(i) == ' ' && i < str.length()-1){
            sb.append(str.charAt(i));
            i++;
            sb.append(Character.toUpperCase(str.charAt(i)));
        }
        else{
            sb.append(str.charAt(i));
        }
       }
       System.out.println(sb.toString());
     }

     public static void stringCompression(String str){

        //O(n)
        StringBuilder sb = new StringBuilder("");
        
        for(int i=0;i<str.length();i++)
        {   
            Integer count = 0;
            char ch = str.charAt(i);
            sb.append(ch);
            count = 1;
            while(i<str.length()-1 && str.charAt(i+1) == ch){
                count++;
                i++;
            }
            if(count > 1){
                sb.append(count.toString());
            }
        }
        System.out.println(sb.toString());
     }

     public static int isLowerOccurence(String str){
        int count = 0;
        for(int i=0;i<str.length();i++){
            if(Character.isLowerCase(str.charAt(i))){
                count++;
            }
        }
        return count;
     }


     public static int lowerCaseVowelsOccurence(String str){
        int count = 0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                count++;
            }
        }
        return count;
     }

     public static boolean isAnagram(String str1,String str2){

        if(str1.length() != str2.length()){
            return false;
        }
       char[] char1 = str1.toCharArray();
       Arrays.sort(char1);

       char[] char2 = str2.toCharArray();
       Arrays.sort(char2);

      
    //    for(int i=0;i<char1.length;i++){
    //      if(char1[i] != char2[i]){
    //         return false;
    //     }
    //    }

    if(Arrays.equals(char1,char2) == false){
        return false;
    }
       return true;
    }
     
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        // System.out.println(isPalindrome(str));

        // System.out.println(subStr("HelloWorld", 0, 5));
        // String[] str = {"apple","zoo","mango","banana"};
        // System.out.println(largestString(str)); 
        // toUpperCase("hi, i am aman");
        // toUpperCase("hello brOTHER");
        // stringCompression("aaabbcccdd");
        //System.out.println(isLowerOccurence("Hi i am Aman"));
        // System.out.println(lowerCaseVowelsOccurence("Hi I am Aman"));
        System.out.println(isAnagram("race", "care"));
 }
    
}
