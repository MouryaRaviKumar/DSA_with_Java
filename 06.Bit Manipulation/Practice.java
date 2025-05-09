public class Practice {
    public static void main(String args[]){
        int n = 6;
        System.out.println(-~n);//to add +1 using not operator
        int a = 10;
        int b = 20;
        //Swapping of two numbers without using third variable with xor operator
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a);
        System.out.println(b);
    }
    
}
