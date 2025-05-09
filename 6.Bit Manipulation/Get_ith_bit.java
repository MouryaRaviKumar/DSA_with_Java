import java.util.Scanner;

public class Get_ith_bit {
    public static int check(int n,int i){
        int ans = n & (1 << i);
        if(ans==0){
            return 0;
        }
        else{
            return 1;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        System.out.print("\nEnter the i-value:");
        int i = sc.nextInt();
        int res = check(n,i);
        if(res==0){
            System.out.println("0");
        }
        else{
            System.out.println("1");
        }
        sc.close();
    }
    
}
