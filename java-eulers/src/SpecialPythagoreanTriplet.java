/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for
 * which,
 * 
 * a2 + b2 = c2 For example, 32 + 42 = 9 + 16 = 25 = 52.
 * 
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000. Find
 * the product abc.
 * 
 * @author rbhochhibhoya
 * 
 */
public class SpecialPythagoreanTriplet {
	
	public static void main(String[] args) {
		SpecialPythagoreanTriplet specialPythagoreanTriplet = new SpecialPythagoreanTriplet();
		
		System.out.println("The product of abc is:"+specialPythagoreanTriplet.getProductOfPythagoreanTriplet());
	}

	private int getProductOfPythagoreanTriplet() {
		long start = System.currentTimeMillis();
		for(int a=1;a<1000;a++){
			for(int b=1;b<1000;b++){
				double c = Math.sqrt(a*a+b*b);
				if(a+b+c == 1000 && Math.floor(c) == Math.ceil(c)){
					System.out.println((System.currentTimeMillis() - start));
					System.out.format("The pythagorean triplets are a%d, b=%d and c=%f",a,b,c);
					return a*b*(int)c;
				}
			}
		}		
		return 0;
	}
	

}
