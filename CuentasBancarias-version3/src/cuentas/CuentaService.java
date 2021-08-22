package cuentas;

public class CuentaService {
	public CuentaService() {}
	
	// Methods
	
	public boolean verificarMontoDeExtraccionODeposito(double monto) {
		 return monto > 0;
	}
	
	public boolean verificarSiTieneSaldoSuficiente(Cuenta cuenta, int monto) {
		return monto <= cuenta.getSaldo();
	}
	
	public void depositarDinero(Cuenta cuenta, double monto) {
		if(verificarMontoDeExtraccionODeposito(monto)) {
			 cuenta.setSaldo(cuenta.getSaldo() + monto);
		}
	}
	
	public void extraerDinero(Cuenta cuenta, int monto) {
		if(verificarMontoDeExtraccionODeposito(monto) & verificarSiTieneSaldoSuficiente(cuenta, monto)) {
			cuenta.setSaldo(cuenta.getSaldo() - monto);
		}
	}
	
	public boolean verificarTransferencia(Cuenta cuentaUno, double saldoInicialUno, Cuenta cuentaDos, double saldoInicialDos, double monto) {
		double valorUno = saldoInicialUno - monto;
		double valorDos = saldoInicialDos + monto;
		return cuentaUno.getSaldo() == valorUno & cuentaDos.getSaldo() == valorDos;
	}
	
	public void transferir(Cuenta cuentaUno, Cuenta cuentaDos, double monto) {
		double saldoInicialUno = cuentaUno.getSaldo();
		double saldoInicialDos = cuentaDos.getSaldo();
		int error = 0;
		
		do {
			if(error > 0) {
				cuentaUno.setSaldo(saldoInicialUno);
				cuentaDos.setSaldo(saldoInicialDos);
				error = 0;
			}
			if(verificarMontoDeExtraccionODeposito(monto) & cuentaUno.getSaldo() >= monto) {
				error++;
				cuentaUno.setSaldo(cuentaUno.getSaldo() - monto);
				cuentaDos.setSaldo(cuentaDos.getSaldo() + monto);
			}
		}while(!verificarTransferencia(cuentaUno, saldoInicialUno, cuentaDos, saldoInicialDos, monto));
	}
	
}
