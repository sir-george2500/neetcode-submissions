class Solution {
    public int maxSubArray(int[] nums) {
        int maxSoFar  = nums[0];
        int maxCurrent = 0;

        for(int i = 0; i<nums.length; i++){

            if( nums[i] > maxCurrent + nums[i]){
                maxCurrent = nums[i];
            }else{
                maxCurrent += nums[i];
            }

            if(maxCurrent > maxSoFar){
                maxSoFar = maxCurrent;
            }
        }

        return maxSoFar;
    }
}
