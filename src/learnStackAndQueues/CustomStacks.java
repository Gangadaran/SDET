package learnStackAndQueues;

public class CustomStacks {
   
	protected int[] data;
	private static final int DEFAULt_SIZE = 10;
	
	public CustomStacks() {
		this(DEFAULt_SIZE);
	}
	
	int ptr = -1;
	
	public CustomStacks(int size) {
		this.data = new int[size];
		
	}
	
	public boolean push(int item) {
        if (isFull()) {
			System.out.println("Stack is full");
			return false;
		}
		ptr++;
        data [ptr] = item;
        return true;

	}
	
	public int pop() throws Exception {
		if (isEmpty()) {
			throw new StackException("Cannot remove from an empty array");
		}
		
//		int remove = data[ptr];
//		ptr--;
//		return remove;
		
		return data[ptr--];
		

	}

	public int peek() throws Exception {
		if (isEmpty()) {
			throw new StackException("Cannot peek from an empty Stack");
		}
		return data[ptr];
		

	}
	
   public boolean isFull() {
		
		return ptr==data.length-1;
	}
   
    public boolean isEmpty() {
		
		return ptr==-1;
	}
	
}
