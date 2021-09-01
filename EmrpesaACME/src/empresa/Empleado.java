package empresa;

public abstract class Empleado {
	private int horasTrabajadas;
	private int cantidadDeHijos;
	private boolean casado;
	private static double VALOR_HIJO = 2000;
	private static double VALOR_CONYUGUE = 1000;
	
	public abstract double getSalario();
	
	public double getSalarioFamiliar() {
		double salarioFamiliar =this.cantidadDeHijos * VALOR_HIJO;
		if(this.casado) {
			salarioFamiliar += VALOR_CONYUGUE;
		}
		return salarioFamiliar; 
	}

	public Empleado(int horasTrabajadas, int cantidadDeHijos, boolean casado) {
		super();
		this.horasTrabajadas = horasTrabajadas;
		this.cantidadDeHijos = cantidadDeHijos;
		this.casado = casado;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

}
