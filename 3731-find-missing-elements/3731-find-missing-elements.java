class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> number = new ArrayList<>();
        Arrays.sort(nums);
        int target = nums[0];
        for(int i=0;i<nums.length;i++){
            if(i>0 &&(nums[i]==nums[i-1])){
                continue;
            }
            if(nums[i]==target){
                target ++;
            }
            while(nums[i]>target){
                number.add(target);
                target++;
            }
            target = nums[i]+1;
        }
        return number;
    }
}