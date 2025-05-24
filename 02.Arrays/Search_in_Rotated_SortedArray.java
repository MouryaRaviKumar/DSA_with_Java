public class Search_in_Rotated_SortedArray {
    public static int getPosition(int arr[],int key){
        int si = 0;
        int ei = arr.length-1;
        while(si < ei){
            int mid = si + (ei - si)/2;
            if(arr[mid]==key){
                return mid;
            }else if(arr[si] <= arr[mid]){
                if(arr[si] <= key && key < arr[mid]){
                    ei = mid-1;
                }else{
                    si = mid+1;
                }
            }else{
                if(arr[mid] < key && key <= arr[ei]){
                    si = mid+1;
                }else{
                    ei = mid-1;
                }
            }   
        }return -1;   
    }
    public static void main(String args[]){
        int arr[] = {6,7,8,9,0,1,2,3};
        int key = 1;
        int ans = getPosition(arr,key);
        System.out.println(ans);
    }
}
