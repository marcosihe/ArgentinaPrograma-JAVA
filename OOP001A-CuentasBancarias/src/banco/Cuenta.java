package banco;

public class Cuenta {
	
	private double saldo;
	public Cuenta() {
		this.saldo = 0;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double montoADepositar) {
		this.saldo += montoADepositar;
	}
	
	public void extraer(double montoAExtraer) {
		this.saldo -= montoAExtraer;
	}
}
