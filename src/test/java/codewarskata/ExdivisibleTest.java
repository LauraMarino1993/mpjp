package codewarskata;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ExdivisibleTest {

	@Test
	void test() {
		assertTrue(Arrays.equals(new int[] { 2, 4, 6 }, Exdivisible.divisibleBy(new int[] { 1, 2, 3, 4, 5, 6 }, 2)));
	}

}
