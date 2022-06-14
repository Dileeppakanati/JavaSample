package array;

public class FindDuplicatesElementsInArrayUsingLoop {
	public static void main(String[] args) {
		int[] NumberArray = { 10, 20, 30, 10, 40, 30, 50, 70, 20, 30, 20, 10 };
		for (int i = 0; i < NumberArray.length; i++) {
			for (int j = i + 1; j < NumberArray.length; j++) {
				if (NumberArray[i] == NumberArray[j]) {
					System.out.println("Duplicate Elements Found:" + NumberArray[i]);
				} 
			}
		}

	}

}
