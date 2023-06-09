import java.util.*;
import java.io.*;

public class Solution {

    public static long maxSubarraySum(int[] arr, int n) {
        // write your code here
        long maxi = Long.MIN_VALUE;
        long sum = 0;
        for (int x : arr) {
            sum += x;

            if (sum > maxi) {
                maxi = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }
        if (maxi < 0)
            maxi = 0;
        return maxi;
    }

}
