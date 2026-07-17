class Solution {
    public int countQuadruplets(int[] nums) {
        int count = 0;
        for(int i=0;i<=nums.length-4;i++){
            for(int j=i+1;j<=nums.length-3;j++){
                for(int k=j+1;k<=nums.length-2;k++){
                    for(int l=k+1;l<=nums.length-1;l++){
                        if(nums[i]+nums[j]+nums[k]==nums[l]){
                            count++;
                        }
                    }
                }
            }
        }
        return count ;
    }
}