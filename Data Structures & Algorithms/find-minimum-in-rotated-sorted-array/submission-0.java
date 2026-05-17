class Solution {
    public int findMin(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int n : nums){
            list.add(n);
        }
        return Collections.min(list);
    }
}
