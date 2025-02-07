// Maximum Sum of K Elements
// Codechef

import java.lang.*;
import java.util.*;

public class S1 {
    class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
		    arr[i] = sc.nextInt();
		}
		// initialising sliding window sum
		int sum = 0;
		for(int i=0; i<K; i++) {
		    sum+=arr[i];
		}
		int left=0;
		int right=K-1;
		int maxSum = sum;
		while(right<N-1) {
		    sum = sum-arr[left];
		    right++;
		    left++;
		    sum = sum+arr[right];
		    maxSum = Math.max(sum,maxSum);
		}
		System.out.println(maxSum);
	}
}
}
