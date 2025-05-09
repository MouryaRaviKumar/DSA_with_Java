public class InsertionSort{
    
    public static void sort(int arr[]){
        int n = arr.length;

        //iterate to get the curr value which has to be sorted
        for(int i = 1; i<n;i++){
            int curr = arr[i];
            int prev = i-1;

            //while loop is used to push the elements which are greater than curr to right side
            while (prev >= 0 && arr[prev]>curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }

            //now storing the curr value in the correct place
            arr[prev+1] = curr;
        }

    }
    //Function to print the array
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