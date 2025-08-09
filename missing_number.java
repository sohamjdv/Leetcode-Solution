class Solutionm {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int count=0,miss=0;
        for(int i=0;i<n;i++){
            if(nums[i]==i){
                count++;
            }
            else if (nums[i]!=i){
                miss=i;
                break;
            }
        }
        if(n==count){
            return n;
        }
        return miss;
    }
}

public class missing_number {
    
}
