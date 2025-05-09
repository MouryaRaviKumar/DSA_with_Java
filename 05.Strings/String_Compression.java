public class String_Compression {
    //To Compress the string 
    public static void main(String args[]){
        String str="aaabbcccdd";
        String str1="";
        
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;//counting the no of similar characters
                i++;
            }
            str1=str1+str.charAt(i);
            if(count>1){//only print the number if count is greater than 1
                str1=str1+count.toString();//converting to String
            }  
        }
        System.out.println(str1);
    }
}
