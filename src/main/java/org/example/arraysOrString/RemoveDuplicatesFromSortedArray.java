package org.example.arraysOrString;

//26. Remove Duplicates from Sorted Array
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 5, 6, 7, 7, 7, 8};
        //int[] nums = {1, 1, 2};
        int result = removeDuplicates(nums);
        System.out.println("Result = " + result);
        for (int num : nums) {
            System.out.print(" " + num);
        }

    }

    private static int removeDuplicates(int[] nums) {
        int position = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[position] != nums[i]) {
                nums[++position] = nums[i];
            }
        }
        return position + 1;
    }
}