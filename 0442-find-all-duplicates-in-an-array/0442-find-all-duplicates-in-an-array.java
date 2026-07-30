class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);

        List<Integer> number = new ArrayList<>();

        int current = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != current) {
                current = nums[i];
            } else {
                number.add(nums[i]);
            }
        }

        return number;
    }
}