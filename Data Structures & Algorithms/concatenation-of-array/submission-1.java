class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] rs = new int[2 * nums.length];

        for(int i=0;i<nums.length;i++) {
            rs[i] = nums[i];
            rs[i+nums.length] = nums[i];
        }

        return rs;
    }
}