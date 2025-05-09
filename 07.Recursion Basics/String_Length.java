public class String_Length {
    public static int length(String name){
        if(name.length() == 0){
            return 0;
        }
        return length(name.substring(1))+1;
    }
    public static void main(String args[]){
        String name = "Mourya";
        System.out.println(length(name));
    }
    
}
