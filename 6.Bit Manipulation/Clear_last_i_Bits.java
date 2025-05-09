public class Clear_last_i_Bits {
    public static void main(String args[]){
        int n = 15;
        int i = 2;
        int ans = n & ((~0)<<i);
        System.out.println(ans);
    }
}
