package interval_oop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntervalTest {
	
	@Test
	void test() {
		Interval myInterval = new Interval();
		Interval.setLowerBound(myInterval, 3);
		Interval.setUpperBound(myInterval, 7);
		int length = Interval.getUpperBound(myInterval) - Interval.getLowerBound(myInterval);
		assertEquals(4, length);
	}

}
