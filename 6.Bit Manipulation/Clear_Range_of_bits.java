public class Clear_Range_of_bits {
    public static void main(String args[]){
        int n = 2515;
        int i = 2;
        int j = 7;
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int res = n & (a | b);
        System.out.println(res);
    }
}
