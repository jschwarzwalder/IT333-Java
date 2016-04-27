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
	
	public static void main(String[] args) {
		Address test1 = new Address (123, "Main Street", "Greenwood", "IN", 46143);
		Address test2 = new Address (123, "Main Street", "Greenwood", "IN", 46143);
		Address test3 = new Address (123, "Meridian St E", "Puyallup", "WA", 98373);
		
		System.out.println(test1.equals(test2));
		System.out.println(test1.equals(test3));

	}

	public Address(int number, String street, String city, String state, int zip) {
		super();
		this.number = number;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	private int number;
	private String street;
    private String city;
    private String state;
    private int zip;
	    
    public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}



    
	/**
	 *  Note: Your equals method should address null parameters, the case of a.equals(a), 
	 *  and non-Address objects (see the article above).
	 * 
	 * @param Object object that is compared to current object
	 * @returns boolean if values are equal.
	 * 
	 */
    public boolean equals(Object object){
    	//if passed in object is null
		if (object == null){
			return false;
		} 
		//comparing memory addresses a.equals(a)
		else if (this == object){
			return true;
		} 
		
		//check if passed in object is an Address
		if (!(object instanceof Address)){
			return false;
		} 
		
		//compare fields
		else {
			//Convert other to an Address
			Address otherAddress = (Address)object;
			
			//compare fields
			return this.number == otherAddress.number &&
					this.street == otherAddress.street &&
					this.city == otherAddress.city &&
					this.state == otherAddress.state &&
					this.zip == otherAddress.zip;
			
		}
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
