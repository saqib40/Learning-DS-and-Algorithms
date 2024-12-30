public class S11 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int countConsecutive = 0;
        int countOnes = 0;
        for(int i : nums) {
            if(i==0) {
                if(countConsecutive > countOnes) {
                    countOnes = countConsecutive;
                }
                countConsecutive = 0;
            }
            else {
                countConsecutive++;
            }
        }
        if(countConsecutive > countOnes) {
            countOnes = countConsecutive;
        }
        return countOnes;
    }
}
