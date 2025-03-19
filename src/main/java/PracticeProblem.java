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

	

}
