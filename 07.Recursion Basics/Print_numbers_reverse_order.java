public class Print_numbers_reverse_order {
    public static void print(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        print(n-1);//Recursion works here
    }
    public static void main(String args[]){
        int n = 10;
        print(n);
    }
}
