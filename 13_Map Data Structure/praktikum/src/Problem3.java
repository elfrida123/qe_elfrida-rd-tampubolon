public class Problem3 {
    public static void main(String[] args) {
        int[] nums = { 2, 5, 9, 11};
        int target = 11;

        findPair(nums, target);
    }

    private static void findPair(int nums[], int target) {
        int index = -1;
        int index1 = -1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    index = i;
                    index1 = j;
                }
            }
        }
        System.out.println("[" + index + " , " + index1 + "]");
    }
}
