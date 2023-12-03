package codingchallenges;

public class LonelyInteger {
    public static void main(String[] args) {
        int[] arr = {1, 1,1,2,2,2,3,3,3,6};
        System.out.println(lonelyInteger2(arr));
    }

    /**
     * Find lonely integer in array
     * @param arr - array of integers
     * @return - lonely integer
     * explain how this works
     */
    public static int lonelyInteger2(int[] arr) {
        int answer = 0;
        for (int i = 0; i < 32; i++) {
            // count number of ith bits
            int currentIthBits = 0;
            for (int j = 0; j < arr.length; j++) {
                currentIthBits += arr[j] & 1;
                arr[j] = arr[j] >> 1;
            }

            if (currentIthBits % 3 != 0){
                answer += (int) Math.pow(2,i);
            }
        }

        return answer;
    }
}
