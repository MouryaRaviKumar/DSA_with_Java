public class ReverseArray {
    public static void reverse(int arr[]){
        int si=0;
        int ei=arr.length-1;
        //function is to reverse the array 
        while(si<=ei){

            int temp=arr[ei];
            arr[ei]=arr[si];
            arr[si]=temp;
            si++;
            ei--;
        }
        //function is to Print the array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={2,3,4,5,6,7,8};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        reverse(arr);
    }
    
}
