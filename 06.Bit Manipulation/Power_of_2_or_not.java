public class Power_of_2_or_not{
    public static boolean check(int n){
        if((n & (n-1)) == 0){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        int n = 1024;
        boolean ans = check(n);
        System.out.println(ans);
    }
}