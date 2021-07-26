package circlesAndIntersections;

public class Main {

	public static void main(String[] args) {
		CircleService circleService = new CircleService();
		
		Coordinates centerOne = new Coordinates(1,1);
		Circle circleOne = new Circle(centerOne, 8);
		
		Coordinates centerTwo = new Coordinates(1,1);
		Circle circleTwo = new Circle(centerTwo, 5);
		
		System.out.println("Intersection?: " + circleService.hasIntersection(circleOne, circleTwo));

	}

}
