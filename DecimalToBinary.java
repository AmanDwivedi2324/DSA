public class DecimalToBinary {

    public static int DecToBin(int n){
        int bin = 0;
        int rem;
        int i=0;
        while(n!=0){
            rem = n%2;
            bin =(bin + rem*(int)Math.pow(10, i));
            n = n/2;
            i++;    
        }
        return bin;
    }

    public static void main(String[] args) {
        System.out.println(DecToBin(15));
 
    }
}
