package ExpediaTest;

import org.junit.Test;

import Expedia.Hotel;

public class HotelTest {
	@Test(expected=RuntimeException.class)
	public void TestThatHotelThrowsOnBadNightsToRent() {
		new Hotel(-1);
	}
}
