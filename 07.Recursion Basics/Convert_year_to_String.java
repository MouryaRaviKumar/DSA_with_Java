public class Convert_year_to_String {
    static String digits[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void convert(int number){
        if(number == 0){
            return;
        }
        int lastDigit = number%10;
        convert(number/10);
        System.out.print(digits[lastDigit]+" ");
    }
    public static void main(String args[]){
        int number = 1947;
        convert(number);
    }
}
