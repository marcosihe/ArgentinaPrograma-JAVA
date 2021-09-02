package tragamonedas;

public class Casino {
	// Cada premio otorga 50 monedas
	private static final int PREMIO = 50;
	
	private Tragamonedas [] tragamonedas;
	
	/**
	 * post: Inicializa al Casino con la cantidad de Tragamonedas 
	 * que se pasa por parámetro
	 */	
	
	public Casino(int cantidadDeTragamonedas) {
		tragamonedas = new Tragamonedas[cantidadDeTragamonedas];
		for(int i = 0; i < cantidadDeTragamonedas; i++) {
			tragamonedas[i] = new Tragamonedas();
		}
	}
	
	public void simularHastaQueSalgaPremioEnTodos() {
		for(Tragamonedas cT : tragamonedas) {
			int cantidadDeJugadas = cT.simularHastaQueSalgaPremio();
			System.out.println("El jugador recibe " + PREMIO + " Monedas");
			System.out.println("Jugó "+ cantidadDeJugadas + " Monedas");
			System.out.println();
		}
	}
	
	public void cuantosPremiosEntregaEnNgirosEnTodos(int n) {
		for(Tragamonedas cT : tragamonedas) {
			int cantidadDePremios = cT.cuantosPremiosEntregaEnNgiros(n);
			System.out.println("El jugador obtiene: " + cantidadDePremios + 
					" premio y recibe " + cantidadDePremios * PREMIO + " Monedas");
			System.out.println("Jugó " + n + " Monedas");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Casino royal = new Casino(5);
		royal.cuantosPremiosEntregaEnNgirosEnTodos(50);
		
		System.out.println("--------------------------");
		royal.simularHastaQueSalgaPremioEnTodos();
	}
}
