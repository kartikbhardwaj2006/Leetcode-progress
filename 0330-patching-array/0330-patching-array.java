class Solution {
    public int minPatches(int[] nums, int n) {
        int pat = 0;
        long reach = 0;
        int i =0;
        while(reach<n){
            if((i<nums.length)&&(nums[i]<=reach+1)){
                reach +=nums[i];
                i++;
            }
            else {
                reach += reach + 1;
                pat++;
            }
        }
        return pat;
    }
}