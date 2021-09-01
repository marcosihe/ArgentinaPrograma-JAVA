package cuentas;

public class Cuenta {
	private	String titular;
	private long CBU;
	private int DNI;
	private double saldo;
	
	public Cuenta() {	
		this.saldo = 0;
	}
	
	// Getters & Setters
	
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public long getCBU() {
		return CBU;
	}

	public void setCBU(long cBU) {
		this.CBU = cBU;
	}

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int dNI) {
		if(dNI < 0)
			throw new Error("El DNI ingresado no es válido");
		this.DNI = dNI;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		if(saldo < 0)
			throw new Error("No se admiten cantidades negativas de dinero");
		this.saldo = saldo;
	}
	
}
