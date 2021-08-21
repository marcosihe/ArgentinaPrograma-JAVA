package puntos;

public class Punto {
	private double x, y;
	
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Punto() {
		
	}
	
	// Getters & Setters
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	// Methods
	public double obtenerX() {
		return this.x;
	}
	
	public double obtenerY() {
		return this.y;
	}
	
	public void cambiarX(double nuevoX) {
		this.x = nuevoX;
	}
	
	public void cambiarY(double nuevoY) {
		this.y = nuevoY;
	}
	
	public boolean estaSobreEjeX() {
		return this.y == 0;
	}
	
	public boolean estaSobreEjeY() {
		return this.x == 0;
	}
	
	public boolean esElOrigen(){
		return estaSobreEjeX() & estaSobreEjeY();
	}
}
