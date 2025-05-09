public class Check_Palindrome{
    //Function to check string is palindrome or not -O(log n)
    public static boolean check(String str){
        int si=0;
        int ei=str.length()-1;
        while(si<=ei){
            if(str.charAt(si)!=str.charAt(ei)){
                return false;
            }
            si++;
            ei--;
        }
        return true;
    }

    public static void main(String args[]){
        String str="racecar";
        System.out.println(check(str));
    }
}