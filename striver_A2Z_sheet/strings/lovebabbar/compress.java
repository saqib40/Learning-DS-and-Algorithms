public class compress {
    // almost thought the same way
    // but to correct the logic
    // used gpt
    // sad day
    public int compress(char[] chars) {
        int n = chars.length;
        int j = 0; // Write pointer
        int count = 1; // Count of current group
    
        // Iterate through the array
        for (int i = 1; i <= n; i++) {
            // Check if the current character is different from the previous one, or we've reached the end
            if (i == n || chars[i] != chars[i - 1]) {
                // Write the character to the write pointer
                chars[j] = chars[i - 1];
                j++;
                
                // If count > 1, write the digits of the count
                if (count > 1) {
                    String countStr = Integer.toString(count);
                    for (char c : countStr.toCharArray()) {
                        chars[j] = c;
                        j++;
                    }
                }
    
                // Reset count for the new group
                count = 1;
            } else {
                // Increment count if the current character matches the previous one
                count++;
            }
        }
    
        // Return the new length of the compressed array
        return j;
    }
    
}
