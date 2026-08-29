class Solution {
    public int removeDuplicates(int[] nums) {
        // Handle empty array
        if (nums.length == 0) {
            return 0;
        }
        
        int officer = 0;  // Position to place next unique element
        
        // Traverse array starting from index 1
        for (int i = 1; i < nums.length; i++) {
            // If current element is different from last unique element
            if (nums[i] != nums[officer]) {
                officer++;
                nums[officer] = nums[i];  // Place new unique element
            }
        }
        
        return officer + 1;  // Number of unique elements
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 1, 2, 2, 3, 3};
        
        int result = sol.removeDuplicates(nums);
        
        System.out.println("Number of unique elements: " + result);
        System.out.print("Array: ");
        for (int i = 0; i < result; i++) {
            System.out.print(nums[i] + " ");
        }
        // Output: Number of unique elements: 3
        //         Array: 1 2 3
    }
}