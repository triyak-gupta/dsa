/*
 * https://leetcode.com/problems/palindrome-number/
 */
public class PalindromeNumber {
	public boolean isPalindrome(int x) {
		int reverse = 0;
		int num = x;
		while (x > 0) {
			reverse = reverse * 10 + x % 10;
			x = x / 10;
		}
		if (reverse == num) {
			return true;
		}
		return false;
	}
}
