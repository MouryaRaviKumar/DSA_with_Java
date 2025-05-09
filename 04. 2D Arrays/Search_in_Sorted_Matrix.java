public class Search_in_Sorted_Matrix {
    //Function to perform Search in a Sorted 2D array
    public static void Search(int arr[][],int key){
        int i=0;
        int j=arr[0].length-1;
        //Search starts from Top-Right most position in the 2D Array
        while(i<arr.length && j >=0){
            if(arr[i][j]==key){
                System.out.println("Key found at ("+i+","+j+")");
                return;
            }
            else if(key<arr[i][j]){
                j--; //Positon goes to left index of the present position
            }
            else{
                i++; //Position goes to bottom index of the present position
            }
        }
    }
    public static void main(String args[]){
        int arr[][]={{10,20,30,40},{15,25,35,45},{27,29,38,48},{32,33,39,50}};
        int key =33;
        
        Search(arr, key);
    }
    
}
