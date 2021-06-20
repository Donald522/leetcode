package leetcode.task;

/**
 * Problem #33 leetcode.com
 * <p>
 * Given the array nums after the rotation and an integer target,
 * return the index of target if it is in nums, or -1 if it is not in nums.
 */
public class Task_33 {

    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        int pivot = searchPivot(nums);
        if (target == nums[pivot]) {
            return pivot;
        }
        int pos = -1;
        int l, r;
        if (target > nums[nums.length - 1]) {
            l = 0;
            r = pivot - 1;
        } else {
            l = pivot;
            r = nums.length - 1;
        }
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) {
                pos = mid;
                break;
            } else if (target > nums[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return pos;
    }

    private int searchPivot(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (nums[mid] > nums[r]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return r;
    }
}
