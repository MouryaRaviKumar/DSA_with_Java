public class Check_Array_Sorted_or_not {
    public static boolean check (int arr[],int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return check(arr,i+1);
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,8};
        int i = 0;
        System.out.println(check(arr,i));
    }
    
}
