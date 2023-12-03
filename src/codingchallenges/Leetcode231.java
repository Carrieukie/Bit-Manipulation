package codingchallenges;

public class Leetcode231 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
    }

    /**
     * Check if number is power of two
     * @param num - number to check
     * @return - true if number is power of two, false otherwise
     */
    public static boolean isPowerOfTwo(int num) {
        return (num & (num - 1)) == 0;
    }
}
