class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int curr = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==curr){
                return nums[i];
            }
            curr = nums[i];
        }
        return -1;
    }
}