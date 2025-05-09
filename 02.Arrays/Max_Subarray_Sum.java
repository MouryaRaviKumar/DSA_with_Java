public class Max_Subarray_Sum {

    //BruteForce Approach -O(n^3)
    public static void bruteForce(int arr[]){
        int n=arr.length;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int currSum=0;
                for(int k=i;k<=j;k++){
                    currSum=currSum+arr[k];//storing sum of values at index i until index k in currSum
                }
                max=Math.max(max,currSum);//using Math.max to find the biggest number in max and currSum and storing it in max
            }
        }

        System.out.println(max);
    }

    //Better Approach with O(n^2)----Prefix Sum Approach
    public static void prefixSum(int arr[]){
        int n = arr.length;
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int prefix[] = new int [n];
        prefix[0] = arr[0];

        for(int i = 1; i < prefix.length; i++){
            prefix[i] = prefix[i-1] + arr[i];//Creating a prefix array to store sum of values from start until index i
        }

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                currSum = i==0 ? prefix[j] : prefix[j] - prefix[i-1]; 
                maxSum = Math.max(currSum,maxSum);//Storing the largest value in maxSum
            }
        }

        System.out.println(maxSum);
    }

    //Optimized approach (Kadane Algorithm)-- O(n)
    public static void kadane (int[] arr) {
        int currsum = arr[0];
        int maxsum = arr[0];

        for(int i = 1; i < arr.length; i++){
            currsum = Math.max(arr[i],currsum + arr[i]);
            maxsum = Math.max(maxsum,currsum);
        }
        
        System.out.println(maxsum);
    }
    //Main Fucntion
    public static void main(String args[]){
        int arr[] = {1,-2,6,-1,3};
        kadane(arr);
    }
    
}
