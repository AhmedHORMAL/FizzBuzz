package org.fizz.buzz;

public class FizzBuzz {
	
	private static final String FIZZ = "FIZZ";
	private static final String BUZZ = "BUZZ";

	public String getResult(int inNumber) {
		if ( inNumber%3 == 0  && inNumber%5 == 0 ) {
			return FIZZ+BUZZ;
		}
		if ( inNumber%3 == 0 ) {
			return FIZZ;
		}	
		if ( inNumber%5 == 0 ) {
			return BUZZ;
		}
		return String.valueOf(inNumber);
	}

}
