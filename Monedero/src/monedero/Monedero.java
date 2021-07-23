package monedero;

public class Monedero {
	
	private double dinero;
	
	/* Constructor */
		
	public Monedero (double dineroInicial) {
		dinero = dineroInicial;
	}

	/* Methods */
		
	public void ingresarDinero(double dineroAIngresar) {
		dinero += dineroAIngresar;
	}
		
	public double sacarDinero(double dineroASacar) {
		if(dinero >= dineroASacar) {
			dinero -= dineroASacar;
			return dineroASacar;
		}else
			return 0;
	}
		
	double consultarSaldo() {
		return dinero;
	}

	public static void main(String[] args) {
		Monedero miMonederoRosa = new Monedero(1000);
		double disponible = miMonederoRosa.consultarSaldo();
		
		double extraccion = miMonederoRosa.sacarDinero(300);
		System.out.println("Saldo disponible en monedero rosa: $" + disponible);
		System.out.println("Dinero extraido del monedero rosa: $" + extraccion);
		System.out.println("Saldo actual en el monedero rosa: $" + (disponible -= extraccion));
		
		Monedero miMonederoAzul = new Monedero(5650.5);
		System.out.println("Sadlo del monedero azul: $" + miMonederoAzul.consultarSaldo());
	}

}
