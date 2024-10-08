import java.sql.ResultSet;
import java.util.Scanner;
public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Positive or negative

        // System.out.print("Enter the number : ");
        // int num = sc.nextInt();
        // if(num>0){
        //     System.out.println("Positive");
        // }
        // else{
        //     System.out.println("Negative");
        // }

        //fever question

        // System.out.print("Enter the temperature : ");
        // double temp = sc.nextDouble();
        // if(temp>100){
        //     System.out.println("You have fever..");
        // }else{
        //     System.out.println("You don't have fever");
        // }

        //day 

        // System.out.print("Enter the day number : ");
        // int day = sc.nextInt();

        // switch (day) {
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //      case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;
        //     case 4:
        //         System.out.println("Thursday");
        //         break;
        //     case 5:
        //         System.out.println("Friday");
        //         break;
        //     case 6:
        //         System.out.println("Saturday");
        //         break;
        //     case 7:
        //         System.out.println("Sunday");
        //         break;
        
        //     default:
        //         System.out.println("Wrong choice");
        //         break;
        // }

        // x = false , y = 63

        //leap year

        // System.out.print("Enter the year : ");
        // int year = sc.nextInt();

        // if((year%4==0 && year%100!=0) || year%400==0){
        //     System.out.println("Leap year");
        // }else{
        //     System.out.println("Not leap year");
        // }

        //largest of three numbers

        // System.out.print("Enter first number : ");
        // int a = sc.nextInt();
        // System.out.print("Enter second number : ");
        //  int b = sc.nextInt();
        // System.out.print("Enter third number : ");
        //  int c = sc.nextInt();

        // if(a>b && a>c){
        //     System.out.print("a is largest");
        // }
        // else if(b>c){
        //     System.out.print("b is largest");
        // }
        // else{
        //     System.out.print("c is largest");
        // }

        //pass fail using ternary operator

        // System.out.print("Enter the marks : ");
        // int marks = sc.nextInt();
        // String result = (marks>=33)?"Pass":"Fail";
        // System.out.println(result);


        //print number from 1 to n
        
        // System.out.print("Enter the number : ");
        // int n = sc.nextInt();
        // int i = 1;
        // while(i<=n){
        //     System.out.println(i);
        //     i++;
        // }

        //square pattern using while

        // int i = 1;
        // while(i<=4){
        //     int j = 1;
        //     while(j<=4){
        //         System.out.print("*");
        //         j++;
        //     }
        //     i++;
        //     System.out.println();
        // }

        //sum of first n natural numbers

        // System.out.print("Enter the number of terms: ");
        // int n = sc.nextInt();
        // int i = 1;
        // int sum = 0;
        // while(i<=n){
        //     sum += i;
        //     i++;
        // }
        // System.out.println(sum);


        //Reverse of a number

        // System.out.print("Enter the number : ");
        // int n = sc.nextInt();
        // // int temp = n;
        // int reverse = 0;
        // int ld = 0;

        // while(n!=0){
        //     ld = n%10;
        //     reverse = ld + reverse*10;
        //    n /= 10;
        // }
        // System.out.println(reverse);

        //do while loop

    //     int n =0;
    //     do{
    //         System.out.println("Hello");
    //         n++;
    //     }while(n<10);

    //print 1 to 5 and exit the loop when 3 comes ==  break statement

    // int n = 1;
    // while(n<=5){
    //     if(n==3){
    //         break;
    //     }
    //     System.out.println(n);
    //     n++;
    // }

        
    // keep entering and printing the number until user enter a multiple of 10

    
    // while(true){
    //     System.out.print("Enter number : ");
    //     int n = sc.nextInt();
    //     if(n%10==0){
    //         break;
    //     }
    //     System.out.println(n);
    // }

    //print from 1 to 5 and skip when 3 comes

    // int n = 1;
    // while (n<=5) {
    //     if(n==3){
    //         n++;
    //         continue;4
    //     }
    //     System.out.println(n);
    //     n++;
    // }

    // for(int i=1;i<=5;i++){
    //     if(i==3){
    //         continue;
    //     }
    //     System.out.println(i);
    // }
    
    //prime number 

    // System.out.print("Enter the number : ");
    // int n = sc.nextInt();
    // boolean result = true;
    // if(n<2){
    //     result = false;
    // }
    // else{
    //     for(int i=2;i<=Math.sqrt(n);i++){
    //         if(n%i==0){
    //             result = false;
    //             break;
    //         }
    //     }
    // }
    
    // if(result){
    //     System.out.println("Yes a prime number");
    // }else{
    //     System.out.println("Not a prime number");
    // }

    //ques

   
        // for(int i=0; i<5; i++) {
        // System.out.println("Hello");
        // i+=2;
        // }

    // sum of even and odd numbers
    
    // int evenSum = 0;
    // int oddSum = 0;
    // int choice;
   
    // do{
    //     System.out.print("Enter the number : ");
    //     int n = sc.nextInt();
    
    //     if(n%2==0){
    //         evenSum+=n;
    //     }else{
    //         oddSum+=n;
    //     }
    // System.out.print("If you want to continue, press 1 and if you want to exit, press 0 : ");
    // choice = sc.nextInt();
    // }while(choice == 1);

    // System.out.println("Sum of even numbers : " + evenSum);
    // System.out.println("Sum of odd numbers : " + oddSum);

    
    //factorial

    // System.out.print("Enter the number : ");
    // int n = sc.nextInt();
    // int fact = 1;
    // for(int i=n;i>=1;i--){
    //     fact *= i;
    // }
    // System.out.println(fact);


    // table

    // System.out.print("Enter the number : ");
    // int n = sc.nextInt();

    // for(int i=1;i<=10;i++){
    //     System.out.println(n + " * " + i + " = " + (n*i));
    // }

    
        
        
}
    
}
