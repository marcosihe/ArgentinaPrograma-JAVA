package tragamonedas;

public class Tambor {
	private int posicion;
	
	/**
	 * post: inicialmente el Tambor est� en la posici�n 1
	 */
	public Tambor() {
		posicion = 1;
	}
	
	/**
	 * post: devuelve el n�mero de posici�n en la que se encuentra el Tambor. Es un
	 * valor comprendido entre 1 y 8
	 */
	public int obtenerPosicion() {
		return posicion;
	}
	
	/**
	 * post: hace girar el tambor y luego se detiene en una posici�n 
	 * entre 1 y 8
	 */
	public void girar(){
		/* provee un n�mero aleatorio en el rango [0.0, 1.0) */
		double aleatorio = Math.random();
		
		posicion = (int) (aleatorio * 8) + 1;
	}

}
