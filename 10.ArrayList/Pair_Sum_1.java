import java.util.ArrayList;

public class Pair_Sum_1 {

    //Bruteforce Approach - O(n^2)
    public static boolean bruteForce(ArrayList <Integer> arrList,int target){
        for(int i = 0; i<arrList.size()-1; i++){
            for(int j = i+1; j<arrList.size(); j++){
                if( arrList.get(i) + arrList.get(j) == target){
                    return true;
                }
                
            }
        }
        return false;//if not found
    }

    //Optimized Code using Two Pointer Approach - O(n)
    public static boolean Optimized (ArrayList <Integer> arrList,int target){
        int lP = 0;//left pointer
        int rP = arrList.size()-1;//right pointer
        while(lP != rP){
            int curr = arrList.get(lP) + arrList.get(rP);
            if(curr == target){
                return true;
            }
            else if(curr < target){
                lP++;
            }
            else{
                rP--;
            }
        }
        return false;//if not found
    }

    public static void main(String args[]){

        int arr[]={1,2,3,4,5,6};
        ArrayList <Integer> arrList=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            arrList.add(arr[i]);
        }
        int target=5;
        System.out.println(arrList);
        System.out.println(Optimized(arrList,target));
        
    }
    
}
