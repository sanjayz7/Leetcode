package Arrays;
class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        freq.put(0, 1); // To handle subarrays starting at index 0
        int prefix = 0, count = 0;

        for (int num : nums) {
            prefix += num;
            if (freq.containsKey(prefix - k)) {
                count += freq.get(prefix - k);
            }
            freq.put(prefix, freq.getOrDefault(prefix, 0) + 1);
        }
        return count;
    }
}