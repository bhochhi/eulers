/***
 * The following iterative sequence is defined for the set of positive integers:

n → n/2 (n is even)
n → 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:

13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.
 */

import java.util.HashMap;
import java.util.Map;

public class LongestCollatzSequence {

	private static HashMap<Long, Collatz> sequence;
	private Collatz maxCollatz;

	public LongestCollatzSequence() {
		sequence = new HashMap<Long, Collatz>();
		maxCollatz = new Collatz(1L);
	}

	public static void main(String[] args) {
		Long start = System.currentTimeMillis();
		LongestCollatzSequence collatzSequence = new LongestCollatzSequence();
		collatzSequence.populateCollatzSequence();
		Collatz collatz = collatzSequence.getLongestCollatz();
		System.out.format(
				"The longest collatz Sequence size is %d for an integer %d",
				collatz.getSize(),collatz.getNumber()); //The longest collatz Sequence size is 525 for an integer 837799
		//	bruteForce();			  
			  
		System.out.println("\nTotal Time(ms):"+(System.currentTimeMillis()-start));
	}

	private static void bruteForce() {
		int longest = 0;
		  int terms = 0;
		  int i;
		  long j;

		  for (i = 1; i <= 1000000; i++)
		  {
		    j = i;
		    int this_terms = 1;

		    while (j != 1)
		    {
		      this_terms++;

		      if (this_terms > terms)
		      {
		        terms = this_terms;
		        longest = i;
		      }

		      if (j % 2 == 0)
		      {
		        j = j / 2;
		      }
		      else
		      {
		        j = 3 * j + 1;
		      }
		    }
		  }
		  System.out.println("term:"+terms+"  Longest:"+longest);
	}

	private void populateCollatzSequence() {
		for (long i = 1; i<1000000; i++) 
		{ 
			if (!sequence.containsKey(i)) {
				Collatz z = new Collatz(i);
				sequence.put(i, z);
				z.setSize(getCollatzSize(i));
				z.setComplete(true);
			}			
		}
	}

	private int getCollatzSize(long num) {
		if (sequence.containsKey(num)) {
			Collatz z = sequence.get(num);
			if (z.isComplete())
				return z.getSize();
			else {
				if (num % 2 == 0)
					num = num / 2;
				else
					num = 3 * num + 1;
				int size = getCollatzSize(num);
				z.setSize(z.getSize()+size);
				z.setComplete(true);
			//	System.out.println(z.isComplete()+" competed:"+z.getNumber()+"  "+z.getSize());
				return z.getSize(); 
			}
		} else {
			Collatz newZ = new Collatz(num);
			sequence.put(num, newZ);
			return getCollatzSize(num);
		}		
	}

	private Collatz getLongestCollatz() {
		for(Map.Entry<Long, Collatz> entry : sequence.entrySet()){
			if(entry.getValue().getSize()>maxCollatz.getSize())
				maxCollatz = entry.getValue();
		}
		return maxCollatz;
	}

}
