class Solution {
    public int[] applyOperations(int[] nums) {
        int slow = 0;
        int n = nums.length;
         for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] = nums[i] * 2;
                nums[i + 1] = 0;
            }
        }
        for (int fast = 0; fast < n; fast++) {
            if (nums[fast] != 0) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
         while (slow < n) {
            nums[slow] = 0;
            slow++;
        }

        return nums;
    }
}