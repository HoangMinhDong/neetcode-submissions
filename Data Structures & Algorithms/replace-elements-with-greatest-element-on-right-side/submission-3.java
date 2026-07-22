class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] rs = new int[n];

        for(int i=0;i<n;i++) {
            int rightMax = -1;
            for(int j=i+1;j<n;j++) {
                rightMax = Math.max(arr[j], rightMax);
            }

            rs[i] = rightMax;
        }

        return rs;
    }
}