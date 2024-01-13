package programming.junit.array;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArrayCompareTest {

	@Test
	public void testArraySort_RandomArray() {
		
		int[] numbers = {12,3,4,6};
		int[] expected = {3,4,6,12};
		
		Arrays.sort(numbers);
		
		assertArrayEquals(expected, numbers);
	}

}
