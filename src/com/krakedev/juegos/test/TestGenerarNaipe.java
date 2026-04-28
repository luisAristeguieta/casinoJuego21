package com.krakedev.juegos.test;

import com.krakedev.juegos.servicios.Dealer;

public class TestGenerarNaipe {

	public static void main(String[] args) {
		// Validar que se genere las 52 combinaciones con anidacion de for: 
		
		Dealer elGanador = new Dealer();
		elGanador.generarNaipe();
		System.out.println("El tamaño de la lista es: " + elGanador.getNaipe().size());
	}

}
