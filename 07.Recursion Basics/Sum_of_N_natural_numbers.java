public class Sum_of_N_natural_numbers {
    public static int sum (int n){
        if(n == 1){
            return 1;
        }
        return n + sum(n-1);
    }
    public static void main(String args[]){
        int n = 10;
        int ans = sum(n);
        System.out.println(ans);
    }
    
}
