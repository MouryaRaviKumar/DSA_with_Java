import java.util.ArrayList;

public class Pair_Sum_2 {
    //function to find pairSum with o(N) -time complexity using Two pointer Approach
    public static boolean PairSum2 (ArrayList <Integer> List,int target){
        int bp = -1;
        int n = List.size();
        for(int i = 0;i<List.size()-1;i++){
            if(List.get(i)>List.get(i+1)){
                bp = i;
                break;
            }
        }
        int lp = bp+1;
        int rp = bp;
        while(lp != rp){
            if(List.get(lp) + List.get(rp) == target){
                return true;
            }

            if(List.get(lp) + List.get(rp) < target){
                lp = (lp - 1) % n;
            }else{
                rp = (n+rp-1) % n;
            }
        }
        return false;
    }

    public static void main(String args[]){
        ArrayList <Integer> List = new ArrayList<>();
        int arr[] = {11,15,6,8,9,10};
        for(int i = 0;i<arr.length;i++){
            List.add(arr[i]);
        }
        int target = 16;
        boolean ans=PairSum2(List,target);
        System.out.println(ans);
    }
    
}
