//T(n) = n^2
//worst case - goes throw all elements i times and then j steps (n * n)


public boolean duplicates (int[] array){
	
	for (int i = 0; i < array.length(); i++) {
		for (int j = 0; j< array.length; j++){
			if (i != j && array[i] == array[j]) {
				return true;
			}
		}
	}
	
	return false;
}