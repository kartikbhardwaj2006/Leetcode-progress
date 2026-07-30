class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int number = 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==number){
                number++;
            }
            if(nums[i]>number){
                return number;
            }
        }
        return number;
    }
}