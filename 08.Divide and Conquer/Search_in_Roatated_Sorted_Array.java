public class Search_in_Roatated_Sorted_Array{
    public static int Search(int nums[],int target){
        int si = 0;
        int ei = nums.length-1;
        while(si <= ei){
            int mid = si +(ei - si)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[si] <= nums[mid]){
                if(nums[si] <= target && target < nums[mid]){
                    ei = mid-1;
                }
                else{
                    si = mid+1;
                }
            }else{
                if(nums[mid] < target && target <= nums[ei]){
                    si = mid+1;
                }
                else{
                    ei = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int nums[] = {6,7,8,9,1,2,3,4,5};
        int target = 8;
        int ans = Search(nums,target);
        System.out.println(ans);
    }
}