package dp.subsequences;
public class S1 {
    // not the best way to solve
    static Boolean solve1(int arr[], int sum, int index, int tempS) {
        // base case
        if(index == arr.length-1) {
            if(tempS == sum){
                return true;
            } else {
                return false;
            }
        }
        // take
        tempS += arr[index];
        if(solve1(arr,sum,index+1,tempS) == true){
            return true;
        }
        // not take
        tempS -= arr[index];
        if(solve1(arr,sum,index+1,tempS) == true){
            return true;
        }
        return false;
    }
    // a better pattern is to not bring in another variable sum
    // rather decrese the given sum to zero
    static Boolean solve2(int[] arr, int sum, int index) {
        // we can early return as well
        if(sum == 0) {
            return true;
        }
        // actual base case
        if(index == arr.length-1) {
            if(sum-arr[index] == 0) {
                return true;
            } else {
                return false;
            }
        }
        // we can take
        // need to make sure it doesn't go negative
        if(sum >= arr[index] && solve2(arr, sum-arr[index], index+1) == true) {
            return true;
        }
        // or we don't take
        if(solve2(arr, sum, index+1) == true) {
            return true;
        }
        return false;
    }
    // now memoising it
    static Boolean solve3(int[] arr, int sum, int index, Boolean[][] dp) {
        // we can early return as well
        if(sum == 0) {
            return true;
        }
        // actual base case
        if(index == arr.length-1) {
            if(sum-arr[index] == 0) {
                return true;
            } else {
                return false;
            }
        }
        // lookup in dp table
        if (dp[index][sum] != null) {
            return dp[index][sum];
        }
        // we can take
        // need to make sure it doesn't go negative
        if(sum >= arr[index] && solve3(arr, sum-arr[index], index+1, dp) == true) {
            return dp[index][sum] = true;
        }
        // or we don't take
        if(solve3(arr, sum, index+1, dp) == true) {
            return dp[index][sum] = true;
        }
        return dp[index][sum] = false;
    }
    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        return solve1(arr,sum,0,0);
    }
    // tabulation approach
    static Boolean isSubsetSum2(int arr[], int sum) {
        int n = arr.length;
        Boolean[][] dp = new Boolean[n][sum + 1];
        for(int i=0; i<n; i++) {
            dp[i][0] = true;
        }
        dp[0][arr[0]] = true;
        for(int i=1; i<n; i++) {
            for(int t=1; t<=sum; t++) {
                boolean nTake = dp[i-1][t];
                boolean take = false;
                if(arr[i] <= t) {
                    take = dp[i-1][t-arr[i]];
                }
                dp[i][t] = take || nTake;
            }
        }
        return dp[n-1][sum];
    }
}
