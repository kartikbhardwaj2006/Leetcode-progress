class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);

        List<Integer> number = new ArrayList<>();
        int result = 1;

        for (int i = 0; i < nums.length; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            while (result < nums[i]) {
                number.add(result);
                result++;
            }

            if (result == nums[i]) {
                result++;
            }
        }

        while (result <= nums.length) {
            number.add(result);
            result++;
        }
        return number;
    }
}