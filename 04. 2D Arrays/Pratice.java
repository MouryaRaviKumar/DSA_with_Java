public class Pratice {
    //Function to count no of 7s in  a 2D array
    public static int count7s(int arr[][]){
        int n=arr.length;
        int m=arr[0].length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==7){
                    count++;
                }
            }
        }
        return count;
    }
    //Function to Add all the elements in 2nd Row
    public static int sum(int arr[][]){
        int m=arr[0].length;
        int sum=0;
        for(int i=0;i<m;i++){
            sum=sum+arr[1][i];
        }
        return sum;
    }
    
    public static void main(String args[]){

        //print the no of 7s in the array
        int[][] arr = { {4,7,8},{8,8,7} };
        System.out.println(count7s(arr));

        //sum of elements in 2nd row of array
        int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
        System.out.println(sum(nums));
    }
    
}
