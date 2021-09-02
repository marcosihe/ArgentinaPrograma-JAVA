package sumo;

public class Luchador {

	private int peso, altura;

	public Luchador(int peso, int altura) {
		this.peso = peso;
		this.altura = altura;
	}

	public boolean dominaA(Luchador otro) {
		boolean superaEnPeso = this.peso > otro.peso;
		boolean superaEnAltura = this.altura > otro.altura;
		boolean mismoPeso = this.peso == otro.peso;
		boolean mismaAltura = this.altura == otro.altura;

		return (superaEnPeso && superaEnAltura || mismaAltura && superaEnPeso || mismoPeso && superaEnAltura);
	}

}
