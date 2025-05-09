public class BinarySearch {
    public static int Search(int arr[],int key){
        int si=0;
        int ei=arr.length-1;
        while(si<=ei){

            int mid=si+(ei-si)/2;
            if(arr[mid]==key){
                return mid;//if key is found at mid return mid value
            }
            else if(arr[mid]>key){
                ei=mid-1;//if value at mid is greater than key ,Go to Left half of the array so Ending point is  to mid-1
                
            }
            else{
                si=mid+1;//if value at mid is lesser than key ,Go to Right half of the array so Starting  point is   mid+1
            }
        }
        return -1;//Return -1 if not found
    }
    public static void main(String args[]){
        int arr[] = {2,4,5,6,8,10};
        int key = 4;
        int idx = Search(arr,key);
        
        if(idx == -1){
            System.out.println("Key not found ");
        }
        else{
            System.out.println("Key found at :"+ idx);
        }
    }
}
