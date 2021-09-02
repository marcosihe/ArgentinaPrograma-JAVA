package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import sumo.Luchador;

public class LuchadorTests {

	@Test
	public void dominioTotal() {
		Luchador uno = new Luchador(300,1500);
		Luchador dos = new Luchador(290,1450);
		
		assertTrue(uno.dominaA(dos));
		assertFalse(dos.dominaA(uno));
	}
	
	@Test
	public void dominioEnPeso() {
		Luchador uno = new Luchador(300,1500);
		Luchador dos = new Luchador(290,1500);
		
		assertTrue(uno.dominaA(dos));
		assertFalse(dos.dominaA(uno));
	}
	
	@Test
	public void dominioEnAltura() {
		Luchador uno = new Luchador(300,1500);
		Luchador dos = new Luchador(300,1450);
		
		assertTrue(uno.dominaA(dos));
		assertFalse(dos.dominaA(uno));
	}
	
	@Test
	public void empate() {
		Luchador uno = new Luchador(300,1500);
		Luchador dos = new Luchador(300,1500);
		
		assertFalse(uno.dominaA(dos));
		assertFalse(dos.dominaA(uno));
	}
	
	@Test
	public void EmpateCombinado() {
		Luchador uno = new Luchador(300,1450);
		Luchador dos = new Luchador(250,1500);
		
		assertFalse(uno.dominaA(dos));
		assertFalse(dos.dominaA(uno));
	}

}
