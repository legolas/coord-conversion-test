package nl.endofdullart.coordinate_conversion.model.test;

import junit.framework.TestCase;
import nl.endofdullart.coordinate_conversion.model.DecDegCoordinate;

public class DecDegCoordinateTest extends TestCase {

	public void testGetDegrees() {
		DecDegCoordinate coordinate = new DecDegCoordinate(12.345678);
		assertEquals(12.345678, coordinate.getDegrees());
	}

	public void testGetRawCoordinate() {
		DecDegCoordinate coordinate = new DecDegCoordinate(12.345678);
		assertEquals(12.345678, coordinate.getRawCoordinate());
	}

	public void testToString() {
		DecDegCoordinate coordinate = new DecDegCoordinate(12.345678);
		assertEquals("12.345678", coordinate.toString());
	}
}
