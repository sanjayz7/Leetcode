class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int index=0;

        ArrayList <Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
       int abs = Math.abs(nums[i]) - 1;
if (nums[abs] < 0) {
    ans.add(Math.abs(nums[i]));
} else {
    nums[abs] = nums[abs] *  -1;
}
        }

        return ans;
    }
}