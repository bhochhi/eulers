import java.util.ArrayList;
import java.util.List;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * 
 * What is the largest prime factor of the number 600851475143 ?
 * 
 * @author RBhochhibhoya
 * 
 */
public class LargestPrimeFactor {

	public static void main(String[] args) {
		LargestPrimeFactor lpf = new LargestPrimeFactor();
		System.out
				.println("The Largest prime factor of the number: 600851475143 is "
						+ lpf.getLargePrimeFactor(600851475143L)); // Answer = 6857

	}

	private long getLargePrimeFactor(long num) {
		long largestPrimeFactor = 1;
		List<Integer> primes = new ArrayList<Integer>();
		for (long i = 3; i <= Math.sqrt(num); i+=2) {
			Boolean flag = false;
			for (int k = 0; k < primes.size(); k++) {
				if (i % primes.get(k) == 0) {
					flag = true;
					break;
				}
			}
			if (flag)
				continue;
			if (i % 2 != 0 && num % i == 0 &&  isPrime(i)) {
				primes.add(new Integer((int) i));
				System.out.println(i);
				largestPrimeFactor = i;
			}
		}
		return largestPrimeFactor;

	}

	private boolean isPrime(long i) {
		for (int p = 2; p <= Math.sqrt(i); p++) {
			if (i % p == 0)
				return false;
		}
		return true;
	}
}