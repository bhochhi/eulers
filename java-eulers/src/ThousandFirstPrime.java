/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
 * that the 6th prime is 13.
 * 
 * What is the 10001st prime number?
 * 
 * @author RBhochhibhoya
 * 
 */
public class ThousandFirstPrime {

	public static void main(String[] args) {
		long nextPrime = 2;
		int nth = 1;
		long p = 3;
		while (true) {
			if (isPrime(p)) {
				System.out.println(p);
				nextPrime = p;				
				if (++nth == 10001)
					break;				
			}
			p+=2;
		}
		System.out.println("The 10001st prime number is: " + nextPrime);
	}

	private static boolean isPrime(long p) {
		for (int i = 2; i < (p); i++)
			if (p % i == 0)
				return false;		
		return true;
	}

}
