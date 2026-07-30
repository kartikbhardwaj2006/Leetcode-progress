class Solution {
    public int[] numberOfPairs(int[] nums) {
        int[] freq = new int[101];

        for (int num : nums) {
            freq[num]++;
        }

        int pairs = 0;
        int leftover = 0;

        for (int i = 0; i <= 100; i++) {
            pairs += freq[i] / 2;
            leftover += freq[i] % 2;
        }

        return new int[]{pairs, leftover};
    }
}