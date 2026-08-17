class Solution {
    public int threeSumMulti(int[] arr, int target) {
        Arrays.sort(arr);
        long count = 0;
        long MOD = 1000000007;
        int n = arr.length;
        for (int i = 0; i < n - 2; i++) {
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum < target) {
                    j++;
                }
                else if (sum > target) {
                    k--;
                }
                else {
                    if (arr[j] != arr[k]) {
                        long left = 1;
                        long right = 1;
                        while (j + 1 < k && arr[j] == arr[j + 1]) {
                            left++;
                            j++;
                        }
                        while (k - 1 > j && arr[k] == arr[k - 1]) {
                            right++;
                            k--;
                        }
                        count += left * right;
                    }
                    else {
                        long len = k - j + 1;
                        count += len * (len - 1) / 2;
                        break;
                    }
                    count %= MOD;
                    j++;
                    k--;
                }
            }
        }
        return (int)(count % MOD);
    }
}