class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int right = 0;
        int maxLen = 0;

        while(right < s.length()){
            char r = s.charAt(right);

            if(!set.contains(r)){
                set.add(r);
                right++;
                maxLen = Math.max(maxLen, right - left);
            }
            else{
                char l = s.charAt(left);
                set.remove(l);
                left++;
            }
        }

        return maxLen;
    }
}
