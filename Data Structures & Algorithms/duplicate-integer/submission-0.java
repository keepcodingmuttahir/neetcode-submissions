class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> copy = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(copy.contains(nums[i])){
                return true;
            }
            else{
                copy.add(nums[i]);
            }
        }
        return false;
    }
}