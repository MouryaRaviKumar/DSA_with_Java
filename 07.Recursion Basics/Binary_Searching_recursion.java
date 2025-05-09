public class Binary_Searching_recursion{
    public static int binarySearch(int arr[],int key,int si,int ei){
        if(si>ei){
            return -1;
        }
        int mid=si+(ei-si)/2;
        if(arr[mid]==key){
            return mid;
        }
        else if(arr[mid]>key){
            
            return binarySearch(arr, key, si, mid-1);
        }
        else{
            
            return binarySearch(arr, key, mid+1, ei);
        }
    }

    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9};
        int key=1;
        int si=0;
        int ei=arr.length-1;
        int res=binarySearch(arr,key,si,ei);
        System.out.println(res);
    }
}