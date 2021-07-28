package circlesAndIntersections;
//import circlesAndIntersections.Coordinates;
//import circlesAndIntersections.Circle;

public class CircleService {
	
	public CircleService() {
		// Empty constructor method
	}
	
	public double findDistance(Coordinates centerOne, Coordinates centerTwo) {
		return Math.sqrt((Math.pow( centerOne.getX() - centerTwo.getX() ,2)) + (Math.pow( centerOne.getY() - centerTwo.getY() ,2)));
	}
	
	public boolean hasIntersection(Circle circleOne, Circle circleTwo) {
		return (findDistance(circleOne.getCenter(), circleTwo.getCenter()) <= (circleOne.getRadius() + circleTwo.getRadius()));
	}
}
