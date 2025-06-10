package Stacks_using_Collections;
import java.util.*;
public class Next_Greater_Element {

    public static void NextGreater(int nums[],int Nextarr[]){
        Stack <Integer> s = new Stack<>();
        
        for(int i = nums.length-1;i>=0;i--){
            while(!s.isEmpty() &&  nums[s.peek()] <= nums[i]){
                s.pop();
            }
            if(s.isEmpty()){
                Nextarr[i] = -1;
            }else{
                Nextarr[i] = nums[s.peek()];
            }
            s.push(i);
        }
        
    }
    public static  void main(String args[]){
        int nums[] = {5,4,3,6,1,8};
        int Nextarr[] = new int[nums.length];
        NextGreater(nums,Nextarr);
        for(int i = 0;i<Nextarr.length;i++){
            System.out.print(Nextarr[i]+" ");
        }
    }
}
