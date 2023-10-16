public class FindMissingNumber {
    public static int findMissingNumber(int[] nums) {
        int n = nums.length + 1;
        int totalSum = (n * (n + 1)) / 2;

        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }

        return totalSum - actualSum;
    }

}
