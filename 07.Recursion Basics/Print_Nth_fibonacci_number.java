public class Print_Nth_fibonacci_number {
    public static int fib(int n){
        if(n == 1 | n == 0 ){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
    public static void main(String args[]){
        int n = 10;
        int ans = fib(n);
        System.out.println(ans);
    }
    
}
