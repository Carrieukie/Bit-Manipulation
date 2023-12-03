package codingchallenges;

public class Leetcode1318 {
    public static void main(String[] args) {
        System.out.println(minFlips(2, 6, 5));
    }

    /**
     * Minimum number of flips to make a OR b equal to c
     * @param a - first number
     * @param b - second number
     * @param c - third number
     * @return - minimum number of flips
     */
    public static int minFlips(int a, int b, int c) {
        int count = 0;
        while (a != 0 || b != 0 || c != 0) {
            int aBit = a & 1;
            int bBit = b & 1;
            int cBit = c & 1;
            if (cBit == 0) {
                if (aBit == 1 && bBit == 1) {
                    count += 2;
                } else if (aBit == 1 || bBit == 1) {
                    count += 1;
                }
            } else {
                if (aBit == 0 && bBit == 0) {
                    count += 1;
                }
            }
            a = a >> 1;
            b = b >> 1;
            c = c >> 1;
        }
        return count;
    }
}
