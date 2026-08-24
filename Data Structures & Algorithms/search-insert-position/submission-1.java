class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        
        while (start <= end) {
            // Prevents potential integer overflow compared to (start + end) / 2
            int mid = start + (end - start) / 2; 
            
            if (nums[mid] == target) {
                return mid; // Target found, return its index immediately
            } else if (nums[mid] < target) {
                start = mid + 1; // Search the right half
            } else {
                end = mid - 1; // Search the left half
            }
        }
        
        // If not found, 'start' holds the exact insertion position
        return start; 
    }
}
