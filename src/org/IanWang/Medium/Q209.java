package org.IanWang.Medium;

public class Q209 {
    public static int minSubArrayLen(int s, int[] nums) {
        int left = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            System.out.println("right = "+ right);
            sum += nums[right];
            System.out.println("sum = " + sum);
            while (sum >= s) {
                result = Math.min(result, right - left + 1);
                sum -= nums[left++];
                System.out.println("sum = " + sum);
                System.out.println("result = " + result);
            }
            System.out.println("left = " + left);
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }

    public static void main(String[] args) {
        //int target = 7;
        //int[]nums = {2,3,1,2,4,3};
        int target =11;
        int[]nums = {1,1,1,1,1,1,1,1};
        int i = minSubArrayLen(target, nums);
        System.out.println(i);
    }
}
