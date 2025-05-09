import java.util.ArrayList;

public class Container_with_most_water {

    //BruteForce Approach - O(n^2)
    public static void BruteForce (ArrayList <Integer> List){

        int big = Integer.MIN_VALUE;
        for(int i = 0; i < List.size()-1; i++){
            for(int j = i+1; j < List.size();j++){
                int length = Math.min (List.get(i),List.get(j));
                int width = (j-i);
                int water = length * width;
                big = Math.max (big,water);
            }
        }
        System.out.println(big);
    }

    //Optimized code using Two Pointer Approach - O(n)
    public static void Optimized (ArrayList <Integer> List){
        int largest=Integer.MIN_VALUE;
        int LP=0;//Left Pointer
        int RP=List.size()-1;//Right Pointer
        while(LP < RP){
            int length=Math.min(List.get(LP),List.get(RP));
            int width=RP-LP;
            int currWater=length*width;
            largest=Math.max(currWater,largest);
            if(LP<RP){
                LP++;
            }
            else{
                RP--;
            }
        }
        System.out.println(largest);

    }
    public static void main(String args[]){

        int arr[] = {1,8,6,2,5,4,8,3,7};
        ArrayList <Integer> List =new ArrayList<>();
        for(int i = 0;i<arr.length;i++){
            List.add(arr[i]);
        }
        System.out.println(List);
        Optimized(List);
    }
    
}
