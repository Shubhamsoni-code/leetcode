class Solution {
    public boolean isPalindrome(int x) {
        int original = x, rev = 0; 
        // isPalindrome = true;
        
        while (x > 0) {
            int last = x%10;
            rev = rev*10 + last;
            x = x/10;
        }

        return original == rev;
    }
    
}