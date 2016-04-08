//loop over input of size n
//worst case n times - go through entire list then return -1
//best case find first time, immediately exit
public int linearSearch(int[] array, int search) {
	for (int i = 0; i < array.length; i++){
		if (array[i] == search){
			return array[i];
		}
	}
	
	return -1;
}