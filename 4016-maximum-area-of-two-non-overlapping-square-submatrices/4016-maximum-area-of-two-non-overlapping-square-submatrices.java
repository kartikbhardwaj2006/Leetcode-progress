class Solution {
    public int maxArea(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[][] p = new int[m + 1][n + 1];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                p[i + 1][j + 1] = mat[i][j] + p[i][j + 1]+ p[i + 1][j] - p[i][j];
        int ans = 0;
        for (int k = 1; k <= Math.min(m, n); k++) {
            int top = Integer.MAX_VALUE;
            int right = Integer.MAX_VALUE;
            int left = -1;
            for (int i = 0; i + k <= m; i++) {
                for (int j = 0; j + k <= n; j++) {
                    int sum = p[i + k][j + k] - p[i][j + k]- p[i + k][j] + p[i][j];
                    if (sum != k * k){ 
                        continue;
                    }
                    if (top <= i || right <= j || left >= j + k){
                        ans = k * k;
                    }
                    top = Math.min(top, i + k);
                    right = Math.min(right, j + k);
                    left = Math.max(left, j);
                }
            }
        }
        return ans;
    }
}