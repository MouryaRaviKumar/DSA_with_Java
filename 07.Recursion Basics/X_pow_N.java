public class X_pow_N {
    public static int pow(int x,int n){
        if(n == 0){
            return 1;
        }
        return x * pow(x,n-1);
    }
    public static void main(String args[]){
        int x = 2;
        int n = 5;
        System.out.println(pow(x,n));
    }
    
}
