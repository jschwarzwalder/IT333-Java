package edu.greenriver.it.address;

/*
 * Jami Schwarzwalder
 * 4/26/2016
 * Address.java
 * Exercises - Hash Tables
 * 
 *  For the following class, write a custom hashcode() and equals() method. 
 *  Both should be based on the fields of the class.
 * 
 */

/**
 * @author Jami Schwarzwalder
 * @version 1.0
 */

public class Address {
	private int number;
    private String street;
    private String city;
    private String state;
    private int zip;
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

   //constructors, getters, setters, toString()...
    
	/**
	 *  Note: Your equals method should address null parameters, the case of a.equals(a), 
	 *  and non-Address objects (see the article above).
	 * 
	 * @param
	 * @returns boolean if values are equal.
	 * 
	 */
    public boolean equals(){
		return false;
    }
    
    /** 
     * Note: Your hash codes should be generated directly from the fields in the Address class. 
     * If the fields in two Address objects are the same, then their hash codes should be the same. 
     * Use your creativity to find a solution!
     * 
     * @returns hashcode as an integer that is the combination of number, zip, and string hashes of street, city, & state.
     */
    public int  hashcode(){
    	int hash = this.number + this.zip;
    	hash += this.street.hashCode();
    	hash += this.city.hashCode();
    	hash += this.state.hashCode();
		
    	return hash;
    }
    

}
