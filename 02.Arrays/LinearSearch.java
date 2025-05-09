public class LinearSearch{
    
    public static int Search(int arr[],int key){ //Linear time Compllexity -O(n)
        int n=arr.length;

        for(int i = 0; i < n; i++){
            if(arr[i] == key){//Checks every value in the Array to find the index of the key value
                return i;
            }
        }
        return -1;//Return -1, if key is not found
    }
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10,12,14,16};
        int key = 10;
        int idx = Search(arr,key);
        
        if(idx == -1){
            System.out.println("Key Not Found");//If key is not there in array
        }
        else{
            System.out.println("Key found at "+ idx);
        }
    }
}