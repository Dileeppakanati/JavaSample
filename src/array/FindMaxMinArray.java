package array;

public class FindMaxMinArray {

	public static void main(String[] args) {
		int[] numArray = {10, 20, 500, 1000, 40};
		int maxNumber = numArray[0];
		int minNumber = numArray[0];
		for(int i = 0; i < numArray.length; i++) {
			//System.out.println(i);
			if(maxNumber < numArray[i]) {
				maxNumber = numArray[i];
			}
			else if(minNumber > numArray[i]) {
				minNumber = numArray[i];
			}
		}
		System.out.println( "LARGEST NUMBER:"+  maxNumber );
		System.out.println("SMALLEST NUMBER:"+ minNumber );
	}
	 
	}