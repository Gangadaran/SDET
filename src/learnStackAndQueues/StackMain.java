package learnStackAndQueues;

public class StackMain {

	public static void main(String[] args) throws Exception {
		CustomStacks stack = new DynomicStack(5);
		stack.push(7);
		stack.push(8);
		stack.push(9);
		stack.push(10);
		stack.push(11);
		stack.push(11);
		
		
		
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}
	
}
