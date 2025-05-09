public class BubbleSort{
    //Function to perform Bubble sorting on array -O(n^2)
    public static void sort(int arr[]){
        int n = arr.length;

        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i-1;j++){
                if(arr[j] < arr[j-1]){//comparing the value at particular index and previous index and swaps them if needed
                     
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }

    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String args[]){

        int arr[]={5,4,1,3,2};
        sort(arr);
        printArr(arr);
    }
}