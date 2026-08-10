class Solution {
    public boolean canFinish(int[] piles, int h, int k) {
    int hourNeeded = 0;
    for (int pile : piles) {
      if (pile <= k) {
        hourNeeded++;
      } else {
        if (pile % k == 0) {
          hourNeeded = hourNeeded + pile / k;
        } else {
          hourNeeded = hourNeeded + pile / k + 1;
        }
      }
    }

    return hourNeeded <= h;

  }

    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int left = 1;
        int right = 0;
        for(int pile: piles) {
            right = Math.max(right, pile);
        }

        int ans = right;

        while(left<=right) {
            int middle = left + (right-left)/2;

            if(canFinish(piles, h, middle)) {
                ans = middle;
                right = middle -1;
            } else {
                left = middle +1;
            }
        }

        return ans;
    }
}
