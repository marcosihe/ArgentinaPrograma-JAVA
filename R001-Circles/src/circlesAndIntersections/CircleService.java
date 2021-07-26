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
	
	public int sumRadius(int radiusOne, int radiusTwo) {
		return radiusOne + radiusTwo;
	}
	
	public boolean hasIntersection(Circle circleOne, Circle circleTwo) {
		return (findDistance(circleOne.getCenter(), circleTwo.getCenter()) <= sumRadius(circleOne.getRadius(), circleTwo.getRadius()));
		
	}
	
	public static void main(String[] args) {
		CircleService circleService = new CircleService();
		
		Coordinates centerOne = new Coordinates(1,1);
		Circle circleOne = new Circle(centerOne, 8);
		
		Coordinates centerTwo = new Coordinates(1,1);
		Circle circleTwo = new Circle(centerTwo, 5);
		
		System.out.println("Intersection?: " + circleService.hasIntersection(circleOne, circleTwo));

	}
}
