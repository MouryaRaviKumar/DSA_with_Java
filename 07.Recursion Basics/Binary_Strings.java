public class Binary_Strings {
    //Function to print Binary Strings 
    public static void printStrings(int n,int lastValue,String str ){
        if(n == 0){
            System.out.println(str);
            return;
        }
        printStrings(n-1, 0, str+"0");
        if(lastValue == 0){
            printStrings(n-1, 1, str+"1");
        }
    }
    public static void main(String args[]){
        int n = 3;
        int lastValue = 0;
        String str = "";
        printStrings(n,lastValue,str);
    }
}
