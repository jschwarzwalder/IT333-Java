//Constant Time T(n)=7
public void swap (int[] array, int first, int second){
	int temp = array[first];
	array[first] = array[second];
	array[second] = temp;
}