public class DiagonalSum {
    //Function to calculate the Diagonal Sum of 2D array
    public static int diagonalSum(int arr[][]){
        int sum=0;
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i == j || i+j == arr.length-1){ 
                    sum=sum+arr[i][j];
                }
            }
        }
        return sum;
    }

    public static void printMatrix(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int val=1;
        int arr[][]=new int[3][3];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=val;
                val++;
            }
        }
        printMatrix(arr);
        int ans=diagonalSum(arr);
        System.out.println(ans);
    }
    
}
