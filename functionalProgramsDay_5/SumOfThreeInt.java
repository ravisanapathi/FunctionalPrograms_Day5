package functionalProgramsDay_5;

public class SumOfThreeInt {
	public static void main(String[] args) {
		int arr[] = {1, 2, 4, -3, -1, 5, 6};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				for (int k = j+1; k < arr.length; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						System.out.println("Numbers found: " +arr[i]+ "," +arr[j]+ "," +arr[k]);
					}
				}
			}
		}
	}

}
