public class SelectionSort{

    //Function to perform Selection Sort 
    public static void sort(int arr[]){
        int n = arr.length;
        
        for(int i = 0;i<n;i++){
            int minPos = i;
            for(int j=i+1;j<n;j++){
                if( arr[minPos] > arr[j] ){
                    minPos = j;//finding the smallest value and storing it in minPos 
                }
            }
            //swapping the smallest variable 
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
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