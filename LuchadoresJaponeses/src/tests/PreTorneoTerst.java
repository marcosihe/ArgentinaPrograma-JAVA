package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import sumo.Luchador;
import sumo.PreTorneo;

public class PreTorneoTerst {

	@Test
	public void test() {
		PreTorneo torneo = new PreTorneo(10);
		
		torneo.agregarLuchador(new Luchador(300, 1500));
		torneo.agregarLuchador(new Luchador(320, 1500));
		torneo.agregarLuchador(new Luchador(299, 1580));
		torneo.agregarLuchador(new Luchador(330, 1690));
		torneo.agregarLuchador(new Luchador(330, 1540));
		torneo.agregarLuchador(new Luchador(339, 1500));
		torneo.agregarLuchador(new Luchador(298, 1700));
		torneo.agregarLuchador(new Luchador(344, 1570));
		torneo.agregarLuchador(new Luchador(276, 1678));
		torneo.agregarLuchador(new Luchador(289, 1499));
		
		assertArrayEquals(new int[]{1,2,1,6,3,3,2,5,0,0}, torneo.calcularDominios() );
	}

}
