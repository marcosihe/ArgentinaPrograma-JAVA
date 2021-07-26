package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import circlesAndIntersections.CircleService;
import circlesAndIntersections.Circle;
import circlesAndIntersections.Coordinates;

public class CircleServiceTest {

	@Test
	public void createCircleService() {
		CircleService circleService = new CircleService();
		assertNotNull(circleService);
	}
	
	@Test
	public void checkHasIntersectionMethod_true() {
		CircleService circleService = new CircleService();
		
		Coordinates centerOne = new Coordinates(1,1);
		Circle circleOne = new Circle(centerOne, 8);
		
		Coordinates centerTwo = new Coordinates(1,1);
		Circle circleTwo = new Circle(centerTwo, 5);
		assertTrue(circleService.hasIntersection(circleOne, circleTwo));
	}
	
	@Test
	public void checkHasIntersectionMethod_false() {
		CircleService circleService = new CircleService();
		
		Coordinates centerOne = new Coordinates(1,1);
		Circle circleOne = new Circle(centerOne, 1);
		
		Coordinates centerTwo = new Coordinates(5,5);
		Circle circleTwo = new Circle(centerTwo, 1);
		assertFalse(circleService.hasIntersection(circleOne, circleTwo));
	}

}
