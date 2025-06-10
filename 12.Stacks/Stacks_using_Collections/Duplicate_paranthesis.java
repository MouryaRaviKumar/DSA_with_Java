package Stacks_using_Collections;

import java.util.*;
public class Duplicate_paranthesis {
    public static boolean isDuplicate(String str){
        Stack <Character> s = new Stack<>();
        for(int i = 0;i<str.length();i++){
            char ch  = str.charAt(i);

            if(ch == ')'){
                int count =  0;
                while(!s.isEmpty() && s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count < 1){
                    return true;
                }else{
                    s.pop();
                }
            }else{
                s.push(ch);
            }
        }
        return false;
        
    }
    public static void main(String args[]){
        String str1 = "(a+b+(c))";//false
        String str2 = "((a+b))";//true
        System.out.println(isDuplicate(str1));
        System.out.println(isDuplicate(str2));
    }    
}
