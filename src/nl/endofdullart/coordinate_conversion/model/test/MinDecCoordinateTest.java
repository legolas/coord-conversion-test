package nl.endofdullart.coordinate_conversion.model.test;

import junit.framework.TestCase;
import nl.endofdullart.coordinate_conversion.model.MinDecCoordinate;

public class MinDecCoordinateTest extends TestCase {

	public void testGetDegrees() {
		MinDecCoordinate coordinate = new MinDecCoordinate(12.345678);
		assertEquals(12, coordinate.getDegrees());
		assertEquals(20.741, coordinate.getMinutes());
	}

	public void testGetRawCoordinate() {
		MinDecCoordinate coordinate = new MinDecCoordinate(12, 20.741);
		assertEquals(20.741 / 60 + 12, coordinate.getRawCoordinate());
	}

	public void testToString() {
		MinDecCoordinate coordinate = new MinDecCoordinate(12, 20.74068);
		assertEquals("12 20.741", coordinate.toString());
	}
}
