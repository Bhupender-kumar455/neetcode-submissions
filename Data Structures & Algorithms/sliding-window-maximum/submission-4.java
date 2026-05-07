class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int d = k;
        int counter = 0;
        int max = 0;
        int[] result = new int[nums.length - k + 1];
        for (int i = 0; i <= nums.length - d; i++) {
            for (int j = counter; j < k; j++) {
                if (max < nums[j] && nums[j]>0) {
                    max = nums[j];
                } else if (nums[j]<0 && d ==1) {
                    max = nums[j];
                }
            }
            result[i] = max;
            max = 0;
            counter++;
            k++;
        }
        return result;
    }
}
