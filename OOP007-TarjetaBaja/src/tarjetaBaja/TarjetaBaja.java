package tarjetaBaja;

public class TarjetaBaja {
	
	private double saldo;
	private double costoDelViajeEncolectivo = 21.50;
	private double costoDelViajeEnSubte = 19.50;
	private int cantidadDeViajesEnColectivo = 0;
	private int cantidadDeViajesEnSubte = 0;
	
	public TarjetaBaja(double saldoInicial) {
		this.saldo = saldoInicial;
	}
	

	// Getters & Setters
	
	public int getCantidadDeViajesEnColectivo() {
		return cantidadDeViajesEnColectivo;
	}

	public void setCantidadDeViajesEnColectivo() {
		this.cantidadDeViajesEnColectivo += 1;
	}

	public int getCantidadDeViajesEnSubte() {
		return cantidadDeViajesEnSubte;
	}

	public void setCantidadDeViajesEnSubte() {
		this.cantidadDeViajesEnSubte += 1;
	}
	
	public double getCostoDelViajeEncolectivo() {
		return costoDelViajeEncolectivo;
	}
	
	public double getCostoDelViajeEnSubte() {
		return costoDelViajeEnSubte;
	}

	// Methods
	
	public double obtenerSaldo() {
		return this.saldo;
	}
	
	public void cargar(double monto) {
		this.saldo = monto;
	}
	
	public boolean verificarSiElSaldoEsSuficiente(double precioDelViaje) {
		return this.saldo >= precioDelViaje;
		
	}
	
	public void pagarViajeEnColectivo() {
		if(verificarSiElSaldoEsSuficiente(costoDelViajeEncolectivo)) {
			this.saldo -= costoDelViajeEncolectivo;
			setCantidadDeViajesEnColectivo();
		}
	}
	
	public void pagarViajeEnSubte() {
		if(verificarSiElSaldoEsSuficiente(costoDelViajeEnSubte)) {
			this.saldo -= costoDelViajeEnSubte;
			setCantidadDeViajesEnSubte();
		}
	}
	
	public int contarViajesEnColectivo() {
		return getCantidadDeViajesEnColectivo();
	}
	
	public int contarCantidadDeViajesEnSubte() {
		return getCantidadDeViajesEnSubte();
	}
	
	public int contarViajes() {
		return getCantidadDeViajesEnColectivo() + getCantidadDeViajesEnSubte();
	}
}
