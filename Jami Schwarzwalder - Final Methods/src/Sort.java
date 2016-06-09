import java.util.Arrays;

public class Sort {
	
	public static void main(String[] args){
		
		Integer[] test1 = {5, 4, 3, 2, 1};
		Integer[] test2 = {6, 4, 5, 2, 7};
		String[] test3 = {"z", "y", "x", "c", "b", "a"};
		System.out.println("Selection");
		selectionSort(test1);
		System.out.println(Arrays.toString(test1));
		selectionSort(test2);
		System.out.println(Arrays.toString(test2));
		selectionSort(test3);
		System.out.println(Arrays.toString(test3));
		
		test1 = new Integer[]{5, 4, 3, 2, 1};
		test2 = new Integer[]{6, 4, 5, 2, 7};
		test3 = new String[]{"z", "y", "x", "c", "b", "a"};
		System.out.println("Insertion");
		insertionSort(test1);
		System.out.println(Arrays.toString(test1));
		insertionSort(test2);
		System.out.println(Arrays.toString(test2));
		insertionSort(test3);
		System.out.println(Arrays.toString(test3));
		
	}
	
	public static <T extends Comparable<T>> void selectionSort(T[] input) {

		for (int i = 0; i < input.length; i++) {
			// assign element at beginning of list to min
			T min = input[i];
			int minIndex = i;
			for (int j = i; j < input.length; j++) {
				// find smallest thing
				// compare current element to min
				if (input[j].compareTo(min) < 0){
					min = input[j];
					minIndex = j;
				}
			}
			// swap min with element
			input[minIndex] = input[i];
			input[i]= min;
				
		}

	}

	public static <T extends Comparable<T>> void insertionSort (T[] input){
		//compare first unsorted to previously sorted
		for (int i = 1; i < input.length; i++) {
			T element = input[i];
			int j = i;
			//compare first unsorted to previously sorted
			while(( j > 0) && (input[j-1].compareTo(element) > 0)) {
				//if less than previous, swap places
				input[j]= input[j-1];
				j = j-1;	
			}
			input[j] = element;

		}

	}
}
