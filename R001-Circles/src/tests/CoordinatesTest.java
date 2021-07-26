package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import circlesAndIntersections.Coordinates;

public class CoordinatesTest {

	@Test
	public void createPoint() {
		Coordinates xy = new Coordinates(3,1);
		assertNotNull(xy);
	}
	
	@Test
	public void checkParameters() {
		Coordinates xy = new Coordinates(3,1);
		assertEquals(3, xy.getX(), 0.0);
		assertEquals(1, xy.getY(), 0.0);
	}
}
