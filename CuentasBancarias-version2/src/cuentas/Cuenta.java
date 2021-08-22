package cuentas;

public class Cuenta {
	
	private double saldo;
	
	public Cuenta() {	
		this.saldo = 0;
	}
	
	// Methods
	
	public double consultarSaldo() {
		return this.saldo;
	}
	
	public boolean verificarMontoDeDinero(double monto) {
		if(monto >= 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean verificarSiTieneSaldoSuficiente(int monto) {
		if(monto <= consultarSaldo()) {
			return true;
		}else {
			return false;
		}
	}
	
	public void depositarDinero(double monto) {
		if(verificarMontoDeDinero(monto)) {
			this.saldo += monto;
		}
	}
	
	public void extraerDinero(int monto) {
		if(verificarMontoDeDinero(monto) & verificarSiTieneSaldoSuficiente(monto)) {
			this.saldo -= monto;
		}
	}
}
