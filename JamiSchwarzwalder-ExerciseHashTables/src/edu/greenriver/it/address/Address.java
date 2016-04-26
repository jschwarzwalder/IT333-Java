package edu.greenriver.it.address;

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
    
    public static boolean equals(){
		return false;
    }
    
    public static int  hashcode(){
    	int hash = this.number + this.zip;
    	hash += this.street.hashCode();
    	hash += this.city.hashCode();
    	hash += this.state.hashCode();
		
    			
    	return hash;
    }
    

}
