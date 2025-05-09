public class First_occurence {
    public static int check(int arr[],int key,int i){
        if(i == arr.length-1){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return check(arr,key,i+1);

    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,5,5,3,2,2};
        int key = 3;
        int i = 0;
        System.out.println(check(arr,key,i));
    }
    
}
