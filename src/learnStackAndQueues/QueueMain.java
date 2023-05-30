package learnStackAndQueues;

public class QueueMain {
	
	public static void main(String[] args) throws Exception {
		CustomQueue queue = new CustomQueue();
		queue.insert(9);
		queue.insert(8);
		queue.insert(67);
		queue.insert(5);
		queue.insert(3);
		
		queue.display();
		
		System.out.println(queue.remove());
		queue.display(); 
	}

}
