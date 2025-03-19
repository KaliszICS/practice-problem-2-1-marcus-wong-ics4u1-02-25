public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static int find(int[] arr, int num) {
		for (int i  = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				return i;

			}
			
		}
		return -1;

	} 
	public static int findLast(String[] arr, String str) {
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i].equals(str)) {
				return i; 

			}
		}
		return -1;

	}
	public static int findSecond(char[] arr, char c) {
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == c) {
				counter++;
				if (counter == 2) {
					return i;

				}
				

			}

		}
		if (counter == 1) {
			return arr.length - 1;

		}
		return -1;

	}

	

}
