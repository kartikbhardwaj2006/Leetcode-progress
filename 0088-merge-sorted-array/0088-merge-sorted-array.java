class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        int k=0;
        int number [] = new int [m+n];
        while(i<m && j<n){
            if(nums1[i]>=nums2[j]){
                number[k]=nums2[j];
                j++;
            }
            else{
                number[k]=nums1[i];
                i++;
            }
            k++;
        }
         while (i < m) {
            number[k] = nums1[i];
            i++;
            k++;
        }
        while (j < n) {
            number[k] = nums2[j];
            j++;
            k++;
        }
         for (int x = 0; x < m + n; x++) {
            nums1[x] = number[x];
        }
    }
}