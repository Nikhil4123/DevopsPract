import java.util.HashMap;

public class Twosum {
    // Method to find two indices of the numbers that add up to the target
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the number and its index
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement
            int complement = target - nums[i];
            
            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i }; // Return indices
            }
            // Store the number and its index in the map
            map.put(nums[i], i);
        }
        
        // Return an empty array if no solution is found
        return new int[0];
    }
    
    // Main method for testing
    public static void main(String[] args) {
        Twosum ts = new Twosum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = ts.twoSum(nums, target);
        
        // Output
    }
}