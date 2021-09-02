package tarjetaBaja;

public class TarjetaBaja {
	/**
	 * post: saldo de la Tarjeta en saldoInicial...
	 */
	public TarjetaBaja(double saldoInicial) {
		
	}
	/**
	 * post: devuelve el saldo actual de la Tarjeta
	 */
	public double obtenerSaldo() {}
	
	/**
	 * post: agregar el monto al saldo de la Tarjeta
	 */
	public void cargar(double monto) {}
	
	/**
	 * pre: saldo suficiente
	 * post: utiliza 21.50 del saldo para un viaje en colectivo
	 */
	public void pagarViajeEnSubte() {}
}
