public class Remove_Duplicates {
    //Function to remove duplicates from a string 
    public static void duplicates(String str,StringBuilder sb,boolean map[],int idx){
        if(idx == str.length()){//Base Case
            System.out.println(sb);
            return;
        }
        char curr = str.charAt(idx);
        if(map[curr-'a'] == true){
            duplicates(str, sb, map, idx+1);
        }
        else{
            map[curr-'a'] = true;
            duplicates(str, sb.append(curr), map, idx);
        }
    }
    //Main method
    public static void main(String args[]){
        int idx = 0;
        String str = "appnnacollege";
        StringBuilder sb = new StringBuilder("");
        boolean map[] = new boolean[26];
        duplicates(str,sb,map,idx);

    }
    
}
