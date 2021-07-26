package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import circlesAndIntersections.Circle;
import circlesAndIntersections.Coordinates;

public class CircleTest {

	@Test
	public void createCircle() {
		Coordinates center = new Coordinates(3,1);
		Circle circleOne = new Circle(center, 2);
		assertNotNull(circleOne);
	}
	
	@Test
	public void checkRadius() {
		Coordinates center = new Coordinates(3,1);
		Circle circleOne = new Circle(center, 2);
		assertEquals(2, circleOne.getRadius(), 0.0);
	}
	
	@Test
	public void checkCenter() {
		Coordinates center = new Coordinates(3,1);
		Circle circleOne = new Circle(center, 2);
		assertEquals(center, circleOne.getCenter());
	}

}
