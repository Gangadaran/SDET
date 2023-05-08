package Babuvideo;

public class LearnLambda {

	@FunctionalInterface
	interface shopping {
		public boolean makePayment();
	}

	@FunctionalInterface
	interface cancel {
		public int cancelOrder(int orderNumber);
	}
 
	
	
	shopping shop = () -> {
		return false;
	};
	
	cancel cancelOrder = (orderNumber) -> {
		return 30;
	};
	
}
