import java.util.Scanner;
public class IncomeTaxx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income : ");
        int income = sc.nextInt();
        int tax;
        
        if(income < 500000){
            tax = 0;
            // System.out.println("Your tax is 0.");
        }

        else if(income >= 500000 && income <= 1000000){
            tax = (int)(0.2*income);
            System.out.println("Your tax is : " + tax);
        }

        else{
            tax = (int)(0.3*income);
            System.out.println("Your tax is : " + (30/100)*income);
        }

        System.out.println(tax);
    }
} 
