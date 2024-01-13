package programming.junit.exp;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ExpectExpTest {

	@Test(expected = NullPointerException.class)
	public void testArraySort_NullArray() {
		
		int[] numbers = null;
		int[] expected = {3,4,6,12};
		
		Arrays.sort(numbers);
		
		assertArrayEquals(expected, numbers);
	}

}
