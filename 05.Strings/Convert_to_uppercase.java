public class Convert_to_uppercase {
    //To convert each words first letter to Uppercase
    public static void main(String args[]){
        String str = "hi, i am mourya";
        StringBuilder sb=new StringBuilder("");
        
        sb.append(Character.toUpperCase(str.charAt(0)));//making first letter of sentence as Capital letter

        for(int i=1;i<str.length();i++){
            if(str.charAt(i-1)==' '){
                sb.append(Character.toUpperCase((str.charAt(i))));//converting characters to uppercase where value at i-1 is a space
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
    }
    
}
