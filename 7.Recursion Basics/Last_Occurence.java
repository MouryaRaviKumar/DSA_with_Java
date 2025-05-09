public class Last_Occurence {
    public static int check(int arr[],int key,int i){
        if(i < 0){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return check(arr,key,i-1);

    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,1,2,3,4,5,6};
        int key = 3;
        int i = arr.length-1;
        System.out.println(check(arr,key,i));
        
    }
    
}
