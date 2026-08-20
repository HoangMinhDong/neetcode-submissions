class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] rs = new int[2 * nums.length];

        for(int i=0;i<rs.length;i++) {
            if(i>=nums.length) {
             rs[i] = nums[i-nums.length];
            } else {
                rs[i] = nums[i];
            }
        }

        return rs;
    }
}