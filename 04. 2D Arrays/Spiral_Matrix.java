public class Spiral_Matrix{
    //Function to print the values in a spiral design
    public static void printSpiral(int arr[][]){
        int n=arr.length;
        int m=arr[0].length;
        int startrow=0;
        int startcol=0;
        int endrow=n-1;
        int endcol=m-1;

        while(startcol<=endcol && startrow<=endrow){
            for(int j=startcol;j<=endcol;j++){  //Top row 
                System.out.print(arr[startrow][j]+" ");
            }
            for(int i=startrow+1;i<=endrow;i++){ //Right column
                System.out.print(arr[i][endcol]+" ");
            }
            for(int j=endcol-1;j>=startcol;j--){ //Bottom row
                if(startrow==endrow){
                    break;
                }
                System.out.print(arr[endrow][j]+" ");
            }
            for(int i=endrow-1;i>=startrow+1;i--){ //Left Column
                if(startcol==endcol){
                    break;
                }
                System.out.print(arr[i][startcol]+" ");
            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }
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
        int arr[][]=new int[3][3];
        int val=1;

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=val;
                val++;
            }
        }

        printMatrix(arr);
        printSpiral(arr);
    }
}