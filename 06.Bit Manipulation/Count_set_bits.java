public class Count_set_bits {
    public static void main(String args[]){
        int count = 0;
        int n = 15;
        while(n > 0){
            if((n&1)!=0){
                count++;
            }
            n = n>>1;
        }
        System.out.println(count);
    }
    
}
