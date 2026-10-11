class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while(right > left){
            if(s.charAt(left) != s.charAt(right)){
                return isPalindrome(s, left+1, right) || isPalindrome(s, left, right-1);
            }
            right--;
            left++;
        }

        return true;
    }

    public boolean isPalindrome(String s, int left, int right){
        while(right > left){
            if(s.charAt(left) != s.charAt(right)) 
                return false;
            
            right--;
            left++;
        }

        return true;
    }
}