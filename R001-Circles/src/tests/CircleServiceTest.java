package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import circlesAndIntersections.CircleService;
import circlesAndIntersections.Circle;
import circlesAndIntersections.Coordinates;

public class CircleServiceTest {

	@Test
	public void createCircleService_shouldReturnAnObject() {
		CircleService circleService = new CircleService();
		assertNotNull(circleService);
	}
	
	@Test
	public void hasIntersectionTest_whenDistanceIsSmallerThanRadiusSum_shouldReturnsTrue() {
		CircleService circleService = new CircleService();
		
		Coordinates centerOne = new Coordinates(1,1);
		Circle circleOne = new Circle(centerOne, 8);
		
		Coordinates centerTwo = new Coordinates(-1,-1);
		Circle circleTwo = new Circle(centerTwo, 5);
		assertTrue(circleService.hasIntersection(circleOne, circleTwo));
	}
	
	@Test
	public void hasIntersectionTest_whenDistanceIsBiggerThanRadiusSum_shouldReturnsFalse() {
		CircleService circleService = new CircleService();
		
		Coordinates centerOne = new Coordinates(1,1);
		Circle circleOne = new Circle(centerOne, 1);
		
		Coordinates centerTwo = new Coordinates(5,5);
		Circle circleTwo = new Circle(centerTwo, 1);
		assertFalse(circleService.hasIntersection(circleOne, circleTwo));
	}
	
	@Test
	public void hasIntersectionTest_whenDistanceIsEqualThanRadiusSum_shouldReturnsTrue() {
		CircleService circleService = new CircleService();
		
		Coordinates centerOne = new Coordinates(0,0);
		Circle circleOne = new Circle(centerOne, 1);
		
		Coordinates centerTwo = new Coordinates(2,0);
		Circle circleTwo = new Circle(centerTwo, 1);
		assertTrue(circleService.hasIntersection(circleOne, circleTwo));
	}
	
	@Test
	public void hasIntersection_whenCircleAreTheSame_shouldReturnsTrue() {
		CircleService circleService = new CircleService();
		
		Coordinates centerOne = new Coordinates(-5,-5);
		Circle circleOne = new Circle(centerOne, 3);
		
		Coordinates centerTwo = new Coordinates(-5,-5);
		Circle circleTwo = new Circle(centerTwo, 3);
		assertTrue(circleService.hasIntersection(circleOne, circleTwo));
	}
}
