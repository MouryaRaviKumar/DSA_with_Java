public class CountingSort {

    public static void sort(int arr[]){
        int n = arr.length;
        int largest=Integer.MIN_VALUE;

        //Find the largest element in the array
        for(int i=0;i<n;i++){
            largest=Math.max(largest,arr[i]);
        }
        int count[]=new int[largest+1];

        //increase  the count by one for each time the element appears
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }
        //Print the elements orderwise using the count array by print and reducng the count by 1
        int j=0;
        for(int i=0;i<=largest;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){

        int arr[]={5,4,1,3,2};
        sort(arr);
        printArr(arr);
    }
    
}
