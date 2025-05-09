import java.util.Arrays;

public class Check_Anagrams{
    //Function to check the strings are Anagrams are not
    public static boolean check(String str1,String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        //checking the length of both strings
        if(str1.length() == str2.length()){
            char str1Array[] = str1.toCharArray();
            char str2Array[] = str2.toCharArray();
            //Sorting both the Arrays
            Arrays.sort(str1Array);
            Arrays.sort(str2Array);
            //checking both arrays are equal or not
            if(Arrays.equals(str1Array, str2Array)){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }

    public static void main(String args[]){
        String str1="race";
        String str2="care";
        boolean res=check(str1,str2);//Function call
        if(res==true){
            System.out.println("Two Strings are Anagrams");
        }
        else{
            System.out.println("Not Anagrams");
        }
    }
}