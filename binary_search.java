class Solutionb {
    int binary_seach(int[]nums,int target,int low,int high){
        if(high>=low){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>target){
                return binary_seach(nums,target,low,mid-1);
            }
            return binary_seach(nums,target,mid+1,high);
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int low=0,high=nums.length-1;
        return binary_seach(nums,target,low,high);
    }
}
public class binary_search {
    
}
