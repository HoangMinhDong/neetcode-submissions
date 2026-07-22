class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> m = new HashMap<>();

        for(int x:nums) {
            if(m.containsKey(x)) {
                return true;
            }

            m.put(x,1);
        }
        return false;
    }
}