import java.util.*;
public class Odd_or_Even{
    public static boolean check(int n){
        int res=n & 1;
        if(res==0){
            return true;
        }
        return false;
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        boolean ans = check(n);
        if(ans==true){
            System.out.println(n+" is an Even number");
        }
        else{
            System.out.println(n+" is an Odd number");
        }
        sc.close();
    }
}
