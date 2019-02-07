import java.lang.*;

public class MaxSubArray
{
    public int maxSubArray(int[] arr) {
        int max = arr[0];
        int sum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            sum = Math.max(arr[i], sum + arr[i]);
            max = Math.max(max, sum);
        }

        return max;

    }
}
