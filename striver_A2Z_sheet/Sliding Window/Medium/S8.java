public class S8 {
    class Solution {
        public int maxScore(int[] cardPoints, int k) {
            int lSum = 0;
            for(int i=0; i<k; i++) {
                lSum += cardPoints[i];
            }
            int rSum = 0;
            int maxSum = lSum;
            int rightIndex = cardPoints.length-1;
            for(int i=k-1; i>=0; i--) {
                lSum = lSum-cardPoints[i];
                rSum = rSum+cardPoints[rightIndex];
                rightIndex--;
                maxSum = Math.max(maxSum, lSum+rSum);
            }
            return maxSum;
        }
    }
}
