public class Clear_ith_bit{
    
    public static void main(String args[]){
        int n = 5;
        int i = 2;
        int ans = n & ~(1<<i);//~ operator is used to invert the bits
        System.out.println(ans);
    }
}