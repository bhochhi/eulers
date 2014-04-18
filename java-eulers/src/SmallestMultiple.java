/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1
 * to 10 without any remainder.
 * 
 * What is the smallest positive number that is evenly divisible by all of the
 * numbers from 1 to 20?
 * 
 * @author RBhochhibhoya
 * 
 * 
 */
public class SmallestMultiple {

	public static void main(String[] args) {
		SmallestMultiple smallestMultiple = new SmallestMultiple();
		System.out
				.println("Smallest position number that is evenly divisible by all the numbers from 1 to 20: "
						+ smallestMultiple.getSmallestMultiple()); //Answer 232792560
	}

	private long getSmallestMultiple() {
		long x = 2520;
		int i = 0;
		while (true) {			
			for (i = 20; i>1; i--) {
				if (x % i != 0) {
					x+=2520;
					break;
				}
			}
			if (i <2)
				return x;
		}
	}

}
