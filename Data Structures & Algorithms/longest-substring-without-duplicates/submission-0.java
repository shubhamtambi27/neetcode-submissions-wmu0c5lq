class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int[] last = new int[256];
        Arrays.fill(last, -1);

        int left = 0, max = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (last[c] >= left)
                left = last[c] + 1;

            last[c] = right;
            max = Math.max(max, right - left + 1);
        }
        return max;
    
    
    }
}
