package RemoveDuplicatesFromSortedArray;

public class Solution {

    // nums array sorted non-decreasing order
    // remove duplicates in-place such that each unique element appears only once
    // order should be the same
    // return number of unique elements

    // 0, 0, 1, 1, 1, 2, 2, 3, 3, 4
    // i = 0; j = 1
    public static int removeDuplicates(int[] nums) {
        int index = 1;
        int right = 1;
        int left = 0;
        int n = nums.length;

        while (right < n) {
            if (nums[left] == nums[right]) {
                right++;
            } else if (nums[left] != nums[right]) {
                nums[index] = nums[right];
                index++;
                left++;
                right++;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int[] array = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(array));
    }
}
