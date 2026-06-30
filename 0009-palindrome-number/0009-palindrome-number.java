class Solution {
    public boolean isPalindrome(int x) {
        // negative numbers are not palindrome
        if (x < 0) return false;

        int original = x;
        int rev = 0;

        while (x > 0) {
            int ld = x % 10;
            rev = (rev * 10) + ld;
            x = x / 10;
        }

        return original == rev;
    }
}