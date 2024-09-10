package org.example.arraysOrString;

public class RotateArrayByK {
    private static void rotate(int[] nums, int k) {
        int[] result = new int[nums.length];
        int j = 0;

        for (int i = nums.length - k; i < nums.length; i++) {
            result[j++] = nums[i];
        }

        for (int i = 0; i < nums.length - k; i++) {
            result[j++] = nums[i];
        }

        for(int i=0; i<result.length; i++){
            nums[i] = result[i];
        }
    }

    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7};
        for (int i : input) {
            System.out.println(i);
        };
        rotate(input, 3);
        System.out.println("\n \n");
        for (int i : input) {
            System.out.println(i);
        };
    }
}
