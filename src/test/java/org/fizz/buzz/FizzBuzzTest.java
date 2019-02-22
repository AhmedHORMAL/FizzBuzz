package org.fizz.buzz;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class FizzBuzzTest {
	 
	private static final String ONE = "1";
	private static final String FIZZ = "FIZZ"; 
	private static final String BUZZ = "BUZZ";

	private FizzBuzz fizzbuzz=new FizzBuzz();

	@Test
	public void shouldReturnOne() throws Exception {
		Assertions.assertThat(fizzbuzz.getResult(1)).isEqualTo(ONE);
	}
	
	@Test
	public void shouldReturnFizz() throws Exception {
		Assertions.assertThat(fizzbuzz.getResult(3)).isEqualTo(FIZZ);
	}
	
	@Test
	public void shouldReturnBuzz() throws Exception {
		Assertions.assertThat(fizzbuzz.getResult(5)).isEqualTo(BUZZ);	
	}
	
	@Test
	public void shouldReturnFizzBuzz() throws Exception {
		Assertions.assertThat(fizzbuzz.getResult(15)).isEqualTo(FIZZ+BUZZ);
		
	}
	
	@Test
	public void shouldReturnFizzBuzz2() throws Exception {
		Assertions.assertThat(fizzbuzz.getResult(15)).isEqualTo(FIZZ+BUZZ);
		
	}
	

}
