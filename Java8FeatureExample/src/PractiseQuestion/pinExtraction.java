package PractiseQuestion;

public class pinExtraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String address="44/1 Bharat Apartment 4C 5th Main Road Jayanagar Bangalore 560041 ND";
		String pin ="";
		String[] arr = address.split(" ");
		
		for (String part : arr) {
			// here \\d for matching digit from 0-9 and {6} length
			if(part.matches("\\d{6}")) {
				pin=part;
				break;
			}
			
		}
		System.out.println("Pincode is "+ pin);
	}

}
