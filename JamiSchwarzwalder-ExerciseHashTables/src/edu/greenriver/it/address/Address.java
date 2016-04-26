package edu.greenriver.it.address;

public class Address {
	private static int number;
    private static String street;
    private static String city;
    private static String state;
    private static int zip;
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

   //constructors, getters, setters, toString()...
    
    public static boolean equals(){
		return false;
    }
    
    public static int  hashcode(){
    	int hash = this.number + this.zip;
    	hash += this.street.hash();
    	hash += this.city.hash();
    	hash += this.state.hash();
		
    			
    	return hash;
    }
    

}
