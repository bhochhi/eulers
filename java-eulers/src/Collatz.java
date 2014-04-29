
public class Collatz {

	private long number;
	private int size;
	private boolean isComplete;

	public Collatz(long number) {
		this.setNumber(number);
		this.setSize(1);
		this.setComplete(number==1?true:false);
		
	}
	
	public boolean isComplete() {
		return isComplete;
	}
	public void setComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}
