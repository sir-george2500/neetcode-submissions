class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();

        // sort the array 
        Arrays.sort(nums);

        backTrack(list,new ArrayList<Integer>(),nums,target,0);

        return  list;
    }

    public void backTrack(List<List<Integer>> list, List<Integer> tempList, int[] nums ,int rem, int start){

        if(rem < 0){
        }else if (rem == 0) list.add(new ArrayList<>(tempList));
        else{
            for(int i = start; i<nums.length; i++){
                tempList.add(nums[i]);
                backTrack(list,tempList,nums,rem - nums[i],i);
                tempList.remove(tempList.size()-1);
            }
        }

    }
}
