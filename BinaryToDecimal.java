public class BinaryToDecimal {

    public static int BinToDec(int n){
        int ld;
        int dec = 0; 

        // to find decimal number of binary number

       int i = 0;
       while(n!=0){
        ld = n%10;
        dec = (int)(dec + ld*(Math.pow(2, i)));
        i++;
        n /= 10;
       }
       return dec;
    }

    public static void main(String[] args) {
        System.out.println(BinToDec(101));
    }
}
