package circlesAndIntersections;
//import circlesAndIntersections.Coordinates;
//import circlesAndIntersections.Circle;

public class CircleService {
	
	public CircleService() {
		// Empty constructor method
	}
	
	// Define methods
	
	public double findDistance(Coordinates centerOne, Coordinates centerTwo) {
		return Math.sqrt((Math.pow( centerOne.getX() - centerTwo.getX() ,2)) + (Math.pow( centerOne.getY() - centerTwo.getY() ,2)));
	}
	
	public int sumRadius(int radiusOne, int radiusTwo) {
		return radiusOne + radiusTwo;
	}
	
	public boolean hasIntersection(Circle circleOne, Circle circleTwo) {
		//boolean result = false;
		if(findDistance(circleOne.getCenter(), circleTwo.getCenter()) <= sumRadius(circleOne.getRadius(), circleTwo.getRadius())) {
			return true;
		}else {
			return false;
		}
	}

}
