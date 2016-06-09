
public class Sort {

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
