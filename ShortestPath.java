import java.security.PublicKey;

public class ShortestPath {

    public static double shortestPath(String str){
        double x = 0;
        double y = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'N'){
                y++;
            }else if(str.charAt(i) == 'S'){
                y--;
            }else if(str.charAt(i) == 'E'){
                x++; 
            }else if(str.charAt(i) == 'W'){
                x--;
            }
        }
       double ans = Math.sqrt((Math.pow(x, 2)) + (Math.pow(y,2)));
       return ans;
    }
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(shortestPath(str));
    }
}
