/**
 * A palindromic number reads the same both ways. The largest palindrome made
 * from the product of two 2-digit numbers is 9009 = 91 × 99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * 
 * @author RBhochhibhoya
 * 
 */
public class LargestPalindromeProduct {

	public static void main(String[] args) {
		int leastProd = 100 * 100;
		int maxProd = 999 * 999;
		int largestPalindrome = 0;
		for (int prod = leastProd; prod < maxProd; prod++) {
			if (isPalindrome(prod)) {
				for (int i = 100; i < 999; i++) {
					if (prod % i == 0 && String.valueOf(prod/i).length() == 3) {
						System.out.println("products of: "+i+" *"+prod/i);
						largestPalindrome = prod;
					}
				}
			}
		}
		System.out
				.println("The largest palindrome made from the product of two 3 digit numbers: "
						+ largestPalindrome); //906609
	}

	private static boolean isPalindrome(int prod) {

		String prodS = String.valueOf(prod);
		for (int i = 0, j = prodS.length() - 1; i < j; i++, j--) {
			if (prodS.charAt(i) != prodS.charAt(j))
				return false;
		}
		return true;
	}

}
