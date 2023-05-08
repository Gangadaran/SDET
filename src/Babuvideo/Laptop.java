package Babuvideo;

public class Laptop  {

	public static void main(String[] args) {
		Computer computer = (brand, model) -> {
			return "92.000";
		};
		
		
		String osVersion = computer.getOSVersion("dell", "xps");
		System.out.println(osVersion);
	}

}
