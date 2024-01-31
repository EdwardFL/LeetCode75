package MoveZeroes;

import java.util.Arrays;

public class Solution {

    // nums = [0, 1, 0, 3, 12]
    // o: [1, 3, 12, 0, 0]

    public static void moveZeroes(int[] nums) {
        // Base case
        int n = nums.length;
        if (n < 2) {
            return;
        }

        // Define pointers
        int left = 0, right = 1;

        // Move zeros to the back
        while (right < n) {
            if (nums[left] != 0) {
                left++;
                right++;
            } else if (nums[right] == 0) {
                right++;
            } else {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
            }
        }

    }

    public static void main(String[] args) {
        int[] array = {0, 1, 0, 3, 12};
        moveZeroes(array);
        System.out.println(Arrays.toString(array));
    }
}
