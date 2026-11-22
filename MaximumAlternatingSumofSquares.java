
import java.util.*;

class Solution {
    public long maxAlternatingSum(int[] nums) {
        long[] squares = new long[nums.length];

        for (int i = 0; i < nums.length; i++) {
            long x = nums[i];
            squares[i] = x * x;
        }

        Arrays.sort(squares);

        long ans = 0;
        int n = squares.length;

        for (int i = 0; i < n; i++) {
            if (i < (n + 1) / 2) {
                ans += squares[n - 1 - i];
            } else {
                ans -= squares[n - 1 - i];
            }
        }

        return ans;
    }
}
