package org.example.arraysOrString;

//LC 27. Remove Element
public class RemoveElement {

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int target = 2;
        int result = removeElement(nums, target);
        System.out.println("Result = "+ result);
        for(int num : nums){
            System.out.print(" "+ num);
        }
    }


    private static int removeElement(int[] nums, int val) {

        int position = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[position++] = nums[i];
            }
        }

        return position;

    }
}
