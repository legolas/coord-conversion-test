package nl.endofdullart.coordinate_conversion.model.test;

import junit.framework.TestCase;
import nl.endofdullart.coordinate_conversion.model.DMSCoordinate;

public class DMSCoordinateTest extends TestCase {

	public void testGetDegrees() {
		DMSCoordinate coordinate = new DMSCoordinate(12.345678);

		assertEquals(12, coordinate.getDegrees());
		assertEquals(20, coordinate.getMinutes());
		assertEquals(44.44, coordinate.getSeconds());
	}

	public void testToString() {
		DMSCoordinate coordinate = new DMSCoordinate(12.345678);
		assertEquals("12 20 44.44", coordinate.toString());
	}
}
