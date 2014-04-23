/**
 * The sum of the squares of the first ten natural numbers is,
 * 
 * 12 + 22 + ... + 102 = 385 The square of the sum of the first ten natural
 * numbers is,
 * 
 * (1 + 2 + ... + 10)2 = 552 = 3025 Hence the difference between the sum of the
 * squares of the first ten natural numbers and the square of the sum is 3025 - * 385 = 2640.
 * 
 * Find the difference between the sum of the squares of the first one hundred
 * natural numbers and the square of the sum.
 * 
 * @author RBhochhibhoya
 * 
 */
public class SumSquareDifference {

	public static void main(String[] args) {
		SumSquareDifference sumSquareDifference = new SumSquareDifference();
		System.out.println("The difference between the sum of squares of the first one hundred natural number and square of the sum is:"+sumSquareDifference.getDifference());
		//25164150
	}

	private Object getDifference() {
		int sumOfSquare = 0;
		int squareOfSum = 0;
		for(int i=1;i<=100;i++){
			sumOfSquare+=i*i;
			squareOfSum +=i;
		}
		return squareOfSum*squareOfSum-sumOfSquare;
		
	}
	
	
}
