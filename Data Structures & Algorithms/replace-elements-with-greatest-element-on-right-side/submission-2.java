class Solution {
    public int[] replaceElements(int[] arr) {
        int[] rs = new int[arr.length];
        int rightMax = -1;
        for(int i=arr.length-1;i>=0;i--) {
            rs[i] = rightMax;
            rightMax = Math.max(rightMax, arr[i]);
        }

        return rs;
    }
}