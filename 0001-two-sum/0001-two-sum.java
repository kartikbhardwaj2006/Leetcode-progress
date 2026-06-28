class Solution {
    public int[] twoSum(int[] nums, int target) {
        int number = nums.length;
        for(int i=0;i<number;i++){
            for(int j=i+1;j<number;j++){
                int sum = nums[i]+nums[j];
                if(target==sum){
                    return new int[]{i,j};
                }
            }
        }
        return new int []{};
    }
    
}