public class Print_Subsets {
    public static void print(String str,String ans,int idx){
        if(idx == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
                return;
            }else{
                System.out.println(ans);
                return;
            }
        }
        print(str, ans+str.charAt(idx), idx+1);
        print(str, ans, idx+1);
    }
    public static void main(String args[]){
        String str = "abcd";
        String ans = "";
        int idx = 0;
        print(str,ans,idx);

    }
    
}
