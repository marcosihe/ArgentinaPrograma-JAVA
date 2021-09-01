package empresa;

public class PlantaTemporaria extends Empleado {
	
	private static double VALOR_HORA= 2000;
	
	public PlantaTemporaria(int horasTrabajadas, int cantidadDeHijos, boolean casado) {
		super(horasTrabajadas, cantidadDeHijos, casado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getSalario() {
		return super.getHorasTrabajadas() * PlantaTemporaria.VALOR_HORA + super.getSalarioFamiliar();
	}

}
