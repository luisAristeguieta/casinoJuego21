package com.krakedev.juegos.test;

import com.krakedev.juegos.servicios.Dealer;

public class TestConstructorDealer {

	public static void main(String[] args) {
		// Valida que se genere la combinacions de las 52 cartas que se invoca en el contructor de deales
		
		Dealer elGanador = new Dealer();
		System.out.println(elGanador.getNaipe().size());
		elGanador.imprimirNaipe();
	}

}
