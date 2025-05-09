public class Subarrays {

    //Function to Print all Subarrays in an Array
    public static void subarray(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){//i starts from 0 until n-1

            for(int j=i;j<n;j++){// j starts from i until n-1

                for(int k=i;k<=j;k++){// k starts from i until j
                    
                    System.out.print(arr[k]+" ");// every possible subarray gets printed in between i and j 
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10};
        subarray(arr);
    }
    
}
