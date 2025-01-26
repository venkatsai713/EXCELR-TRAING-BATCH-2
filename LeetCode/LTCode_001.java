public class LTcode_001 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        System.out.println(solution.isPalindrome(121));    // true
        System.out.println(solution.isPalindrome(-121));   // false
        System.out.println(solution.isPalindrome(10));     // false
        System.out.println(solution.isPalindrome(0));      // true
        System.out.println(solution.isPalindrome(12321));  // true
    }
}

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0; 
        int original = x; 
        while (x > 0) {
            int digit = x % 10;         
            reversed = reversed * 10 + digit; 
            x /= 10;                  
        }

        return original == reversed;
    }
}
