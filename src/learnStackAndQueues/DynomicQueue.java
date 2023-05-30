package learnStackAndQueues;

public class DynomicQueue extends CircularQueue {
	
	public DynomicQueue() {
		super();
	}
	
	public DynomicQueue(int size) {
		super(size);
	}
	
	@Override
	public boolean insert(int item) {
		if (this.isFull()) {
			// double the array size
			int[] temp = new int[data.length*2];
			
			// copy all previous items in data
			
			//System.arraycopy(data, 0, temp, 0, data.length);
			
			for (int i = 0; i < data.length; i++) {
				temp[i] = data[(front +i)%data.length];
			}
			
			data = temp;
		}
		return super.insert(item);
	}
	

}
