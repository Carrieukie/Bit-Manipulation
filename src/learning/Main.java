package learning;

public class Main {
    public static void main(String[] args) {
        System.out.println(leftShift(10, 2));
    }

    /**
     * Left shift operator - multiply by 2 to the power of shift
     * @param num - number to shift
     * @param shift - number of times to shift
     * @return - shifted number
     */
    public static int leftShift(int num, int shift) {
        return num << shift;
    }


    /**
     * Right shift operator - divide by 2 to the power of shift
     * @param num - number to shift
     * @param shift - number of times to shift
     * @return - shifted number
     */
    public static int rightShift(int num, int shift) {
        return num >> shift;
    }

    /**
     * Check if ith bit is set
     * @param num - number to check
     * @param i - bit to check
     * @return - true if bit is set, false otherwise
     */
    public static boolean ithBitSet(int num, int i) {
        return (num & (1 << i)) != 0;
    }

    /**
     * Count number of set bits
     * @param num - number to count
     * @return - number of set bits
     */
    public static int numberOfSetBits(int num) {
        int count = 0;
        while (num != 0) {
            count += num & 1;
            num = num >> 1;
        }
        return count;
    }

    /**
     * Clear last i bits
     * @param num - number to clear
     * @param i - number of bits to clear
     * @return - number with last i bits cleared
     */
    public static int clearLastIBits(int num, int i) {
        return num & (-1 << i);
    }


    /**
     * Toggle ith bit
     * @param num - number to toggle
     * @param i - bit to toggle
     * @return - number with ith bit toggled
     */
    public static int toggleIthBit(int num, int i) {
        return num ^ (1 << i);
    }

    /**
     * Clear ith bit
     * @param num - number to clear
     * @param i - bit to clear
     * @return - number with ith bit cleared
     */
    public static int clearIthBit(int num, int i) {
        return num & ~(1 << i);
    }

    /**
     * Set ith bit
     * @param num - number to set
     * @param i - bit to set
     * @return - number with ith bit set
     */
    public static int setIthBit(int num, int i) {
        return num | (1 << i);
    }

}