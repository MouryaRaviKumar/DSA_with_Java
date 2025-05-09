public class Update_ith_bit {
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
        int n = 5;
        int i = 2;
        int ith = check(n,i);
        if(ith == 1){
            int ans = n & ~(1<<i);//~ operator is used to invert the bits
            System.out.println(ans);   
        }else{
            int res = n | (1<<i);
            System.out.println(res);
        }
    }
    
}
