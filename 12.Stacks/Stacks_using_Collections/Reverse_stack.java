//The program is to Reverse a Stack without using extra space 
package Stacks_using_Collections;

import java.util.*;
public class Reverse_stack{

    public static void pushBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushBottom(s, data);
        s.push(top);
    }

    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushBottom(s, top);
    }
    
    public static void printStack(Stack <Integer> s){
        if(s.isEmpty()){
            return;
        }
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    } 

    public static void main(String args[]){
        Stack <Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        reverseStack(s);
        printStack(s);
    }
}