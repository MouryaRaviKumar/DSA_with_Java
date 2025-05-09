public class Rotate_Sorted_Array {
    //function to do the rotation
    public static void rotation(int arr[],int turn){
        int ei=arr.length-1;

        reverse(arr,0,ei);//Reverse the whole array first
        reverse(arr,0,turn-1);//Reverse the array from 0 to the number u want-1
        reverse(arr,turn,ei);//reverse the remaining part i.e turn idx to ending index
    }
    //Function to reverse an Array
    public static void reverse(int arr[],int si,int ei){
        while(si<=ei){

            int temp=arr[si];
            arr[si]=arr[ei];
            arr[ei]=temp;
            si++;
            ei--;
        }
    }
    //Function to print an Array
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int turn=5;

        rotation(arr,turn);
        printArr(arr);
    }
    
}
