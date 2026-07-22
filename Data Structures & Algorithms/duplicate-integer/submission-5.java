class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> s = new HashSet<>();

        for(int x:nums) {
            if(s.contains(x)) {
                return true;
            }

            s.add(x);
        }
        return false;
    }
}