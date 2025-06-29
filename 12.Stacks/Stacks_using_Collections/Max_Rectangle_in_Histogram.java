package Stacks_using_Collections;

import java.util.Stack;

public class Max_Rectangle_in_Histogram {
    public static int  maxArea(int arr[]){
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];
        int maxiArea = Integer.MIN_VALUE;
        Stack <Integer> s = new Stack<>();
        
        for(int i = arr.length-1;i>=0;i--){
            while(!s.isEmpty() &&  arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = arr.length;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        s.clear();
        for(int i = 0;i<arr.length;i++){
            while(!s.isEmpty() &&  arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        for(int i = 0;i<arr.length;i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i] -1;
            int area  = height*width;
            maxiArea = Math.max(area,maxiArea);
        }
        return maxiArea;
    }
    public static void main(String args[]){
        int arr[] = {2,1,5,6,2,3};
        int res = maxArea(arr);
        System.out.println(res);
    }
}
