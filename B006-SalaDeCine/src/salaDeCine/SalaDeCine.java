package salaDeCine;

public class SalaDeCine {
	private int filas, columnas;
	private boolean[][] sala;
	
	public SalaDeCine(int filas, int cantidadDeButacas) {
		this.filas = filas;
		this.columnas = cantidadDeButacas/filas;
		sala = new boolean[filas][cantidadDeButacas/filas];
	}
	
	// Methods
	
	public boolean estaOcupado(int fila, int asiento) {
		return sala[fila][asiento];
	}
	
	public boolean existeElAsiento(int fila, int asiento) {
		return !(fila > filas-1 || asiento > (columnas - 1));
	}
	
	public boolean ocuparAsiento(int fila, int asiento) {
		if(existeElAsiento(fila, asiento))
			return !this.estaOcupado(fila, asiento) ? sala[fila][asiento] = true : false;
		return false;
	}
	
	public boolean desocuparAsiento(int fila, int asiento) {
		if(existeElAsiento(fila,asiento))
			return this.estaOcupado(fila, asiento) ? !(sala[fila][asiento] = false) : false;
		return false;
	}
	
	public int getCantidadDeButacasOcupadas() {
		int cantidad = 0;
		for(int i = 0; i < filas; i++) {
			for(int j = 0; j < columnas; j++) {
				if(sala[i][j])
					cantidad++;
			}
		}
		return cantidad;
	}
	
	
	public boolean hayEspacioPara(int cantidadDePersonas) {
		if(cantidadDePersonas <= columnas) {
			for(int i = 0; i < filas; i++) {
				int espaciosContiguo = 0;
				for(int j = 0; j < columnas && espaciosContiguo < cantidadDePersonas; j++) {
					if(!estaOcupado(i,j)) {
					++espaciosContiguo;
					}else {
						espaciosContiguo = 0;
						if(cantidadDePersonas >= columnas - j)
							break;
					}
				}
				if(espaciosContiguo == cantidadDePersonas)
					return true;
			}
		}
		return false;
	}
	
}
