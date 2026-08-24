
class Solution {

    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    public static void quickSort(int[] nums, int l, int h) {

        if (l < h) {

            int pi = partition(nums, l, h);

            quickSort(nums, l, pi - 1);
            quickSort(nums, pi + 1, h);
        }
    }

    public static int partition(int[] nums, int l, int h) {

        int pivot = nums[h];

        int i = l - 1;

        for (int j = l; j <= h - 1; j++) {

            if (nums[j] < pivot) {
                i++;
                Swap(nums, i, j);
            }
        }

        Swap(nums, i + 1, h);

        return i + 1;
    }

    public static void Swap(int[] nums, int i, int j) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}