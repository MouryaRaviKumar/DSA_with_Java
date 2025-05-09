import java.util.*;
public class InbuiltSort {
    //Function to print the array
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String args[]){

        int arr[]={5,4,1,3,2};
        
        //Inbuilt sorting function in java
        Arrays.sort(arr);
        printArr(arr);
    }
    
}
