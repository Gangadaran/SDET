package week2;

public class FindNumber2ArePresentInArray {

	public void example() {
		int[] arr = { 1, 2, 3, 4, 5 };
		int x = 2;
		int y = 3;
		findNos(arr, x, y);
	}

	public boolean findNos(int[] arr, int x, int y) {
		boolean check = false;
		boolean check1 = false;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				check = true;

			}
			if (arr[i] == 7) {
				check1 = true;

			}

		}

		if (check  && check1) {
			return true;
		}
		return false;
	}

}
