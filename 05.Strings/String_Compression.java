public class String_Compression {
    //To Compress the string 
    public static void main(String args[]){
        String str="aaabbcccdd";
        String str1="";
        
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            str1=str1+str.charAt(i);
            if(count>1){
                str1=str1+count.toString();
            }  
        }
        System.out.println(str1);
    }
}
