class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> count = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                count.add(i);
            }
        }
        return count;
    }
}