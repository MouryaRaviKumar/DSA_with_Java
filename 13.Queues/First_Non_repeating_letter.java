import java.util.*;
public class First_Non_repeating_letter {
    public static void printNonRepeating(String str){
        Queue<Character> q = new  LinkedList<>();
        int freq[] = new int[26];

        for(int i = 0;i<str.length();i++){
            char curr = str.charAt(i);
            q.add(curr);
            freq[curr-'a']++;

            while(!q.isEmpty() && freq[q.peek()-'a'] > 1 ){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.print(-1+" ");
            }else{
                System.out.print(q.peek()+" ");
            }
        }
        System.out.println();
    }
    public static  void main(String args[]){
        String  str = "aabccxb";
        printNonRepeating(str);
    }
}
