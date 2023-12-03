package codingchallenges;

public class Leetcode191 {
    public static void main(String[] args) {
        System.out.println(hammingWeight(10));
    }

    /**
     * Count number of set bits
     * @param num - number to count
     * @return - number of set bits
     */
    public static int hammingWeight(int num) {
        int count = 0;
        while (num != 0) {
            count ++;
            num = num & (num - 1);
        }
        return count;
    }
}
