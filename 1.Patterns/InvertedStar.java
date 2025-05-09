/*  
    *****
    ****
    ***
    **
    *  
         
    This is the Pattern we have to print
*/ 
import java.util.Scanner;
public class InvertedStar {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();



    }
}
