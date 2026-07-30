class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> number = new ArrayList<>();

        Arrays.sort(nums);

        int current = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == current) {
                count++;
            } else {
                if (count > nums.length / 3) {
                    number.add(current);
                }
                current = nums[i];
                count = 1;
            }
        }

        if (count > nums.length / 3) {
            number.add(current);
        }

        return number;
    }
}