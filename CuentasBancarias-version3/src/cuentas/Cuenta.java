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
		CBU = cBU;
	}

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int dNI) {
		DNI = dNI;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
