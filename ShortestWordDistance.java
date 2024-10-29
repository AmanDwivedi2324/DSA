public class ShortestWordDistance {

    public static int shortestWord(String[] word,String word1, String word2){
        for(int i=0;i<word.length;i++){
            int w1 = 0,w2 = 0;
            int dis;
            int ans = word.length;

            if(word[i]==word1){
                w1 = i;
            }else if(word[i] == word2){
                w2 = i;
            }
            dis = w2-w1;
            if(ans > dis){
                ans = dis;
            }
        }
        return dis;
    }
    public static void main(String[] args) {
        String[] word = {"practice","makes","perfect","coding","makes"};
        String word1 = "coding";
        String word2 = "practice";
        shortestWord(word, word1, word2);
    }
}
