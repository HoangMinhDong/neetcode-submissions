class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt=1;
        int max=1;
        if(isAllOnes(nums)) {
            return nums.length;
        }
        if(isAllZeros(nums)) {
            return 0;
        }
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==1 && i>0) {
                if(nums[i-1]==1) {
                    cnt++;
                }
            } else {
                cnt=1;
            }
            max = Math.max(max, cnt);
        }
        return max;
    }


    public static boolean isAllOnes(int[] nums) {
        for(int x:nums) {
            if(x==0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isAllZeros(int[] nums) {
        for(int x:nums) {
            if(x==1) {
                return false;
            }
        }

        return true;
    }
}