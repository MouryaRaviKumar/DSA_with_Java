public class Practice1{
    //function to check if a number is repeated again or not
    public static boolean check(int nums[]){
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }    
    public static void main(String args[]){

        int nums[]={1,2,3,1};
        boolean ans=check(nums);
        System.out.println(ans);
    }
}