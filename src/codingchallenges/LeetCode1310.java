package codingchallenges;

import java.util.Arrays;

public class LeetCode1310 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 8};
        int[][] queries = {{0, 1}, {1, 2}, {0, 3}, {3, 3}};
        int[] result = xorQueries(arr, queries);
        System.out.println(Arrays.toString(result));
    }


    /**
     * Find xor of subarray
     * @param arr - array of integers
     * @param queries - queries
     * @return - xor of subarray
     */
    public static int[] xorQueries(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];
        int[] xor = new int[arr.length];
        xor[0] = arr[0];
        for (int i=1; i<arr.length; i++) {
            xor[i] = xor[i-1] ^ arr[i];
        }

        for (int i=0; i<queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];

            if (start == 0) {
                result[i] = xor[end];
            } else {
                result[i] = xor[start -1] ^ xor[end];
            }
        }
        return result;
    }
}
