public class Quick_Sort_Program {
    public static void quickSort(int arr[],int si,int ei){
        if(si >= ei){
            return;
        }
        int pivotIdx = partition(arr,si,ei);
        quickSort(arr, si, pivotIdx-1);
        quickSort(arr, pivotIdx+1, ei);
    }
    public static int partition(int arr[],int si,int ei){
        int i = si-1;
        int pivot = arr[ei];
        for(int j=si;j<ei;j++){
            if(arr[j]<pivot){
                i++;
                int temp =arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        //To Place the Pivot in Position
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[] = {6,7,8,5,4,3,2,1};
        quickSort(arr,0,arr.length-1);
        printArr(arr);
    }
}
