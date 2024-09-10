package org.example.arraysOrString;

//80. Remove Duplicates from Sorted Array II
public class RemoveDuplicatesFromSortedArrayII {
    public static void main(String[] args) {
        //int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        //int[] nums = {1,1,1,2,2,3};
        int[] nums = {0,0,1,1,1,1,2,3,3};
        int result = removeDuplicates(nums);
        System.out.println("Result = " + result);
        for (int num : nums) {
            System.out.print(" " + num);
        }

    }

    private static int removeDuplicates(int[] nums) {
        int position = 0;
        int elementCounter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (elementCounter < 2 && nums[position] == nums[i]) {
                nums[position++] = nums[i];
                ++elementCounter;
            } else if (nums[position - 1] != nums[i]) {
                nums[position++] = nums[i];
                elementCounter=1;
            } else {
                elementCounter = 0;
            }
        }
        return position;
    }
}