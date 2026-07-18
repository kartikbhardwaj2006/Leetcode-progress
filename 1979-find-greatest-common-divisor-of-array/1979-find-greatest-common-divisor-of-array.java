class Solution {
    public int findGCD(int[] nums) {
        int big = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        for(int i = 0;i<nums.length;i++){
            big = Math.max(big,nums[i]);
            small = Math.min(small,nums[i]);
        }
        while (small!=0){
            int temp = small ;
            small = big%small;
            big = temp;
        }
        return big;
    }
}