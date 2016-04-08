//This doesn't seem like it would work.
//Why are you indexing vowels at i 
//If you are getting indexOf, why do you need to loop over every char in word?

// Not n^2. vowels is not length n
// length of String is value of n
// inner loop is 5 (constant)

//T(n) = Oh( N * 5) or Oh(n)

public boolean containsVowels (String word){
	char[] vowels = {'a', 'e', 'i', 'o', 'u'};
	for (int i = 0; i < word.length(); i++) {
		for (int j = 0; j< vowels.length; j++){
			if (word.indexOf(vowels[i]) != -1) {
				return true;
			}
		}
	}
	
	return false;
}