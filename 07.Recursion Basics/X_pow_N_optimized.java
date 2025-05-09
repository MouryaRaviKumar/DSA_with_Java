public class X_pow_N_optimized {
    //Function to get the value of x power n using optimized code -O(log n)
    public static int pow(int x,int n){
        if(n == 0){//Base case
            return 1;
        }
        int half = pow(x,n/2);
        int halfsq = half * half;
        if(n%2 != 0){
            halfsq = x * halfsq;
        }
        return halfsq;
    }
    public static void main(String args[]){
        int x = 2;
        int n = 10;
        System.out.println(pow(x,n));  
    }
    
}
