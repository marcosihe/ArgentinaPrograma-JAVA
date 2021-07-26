package circlesAndIntersections;

public class Circle {
	private int radius = 0;
	private Coordinates center;
	
	// Constructor method
	public Circle(Coordinates center, int radius) {
		this.center = center;
		this.radius = radius;
	}

	// Getters & Setters
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public Coordinates getCenter() {
		return center;
	}

	public void setCenter(Coordinates center) {
		this.center = center;
	}
}