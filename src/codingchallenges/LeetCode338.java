package codingchallenges;

import java.util.Arrays;

public class LeetCode338 {
    public static void main(String[] args) {
        int[] result = countBits(15);
        System.out.println(Arrays.toString(result));
    }


    public static String numberToBinary(int number){
        String result = "";
        int remainder;
        while(number > 0){
            remainder = number % 2;
            number = number / 2;
            result = remainder + result;
        }
        return result;
    }

    /**
     * Count number of set bits
     * @param num - number to count
     * @return - number of set bits
     */
    public static int[] countBits(int num) {
        int[] result = new int[num + 1];
        for (int i=1; i<=num; i++) {
            int index = i & (i - 1);
            result[i] = result[index] + 1;

        }
        return result;
    }
}
