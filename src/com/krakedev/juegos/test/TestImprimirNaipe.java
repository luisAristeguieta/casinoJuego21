package com.krakedev.juegos.test;

import com.krakedev.juegos.servicios.Dealer;

public class TestImprimirNaipe {

	public static void main(String[] args) {
		// imprime las cartas generadas en la lista de naipe
		
		Dealer elGanador = new Dealer();
		// elGanador.generarNaipe();// Al agregar el contructor se tiene el metodo generarNaipe 
		elGanador.imprimirNaipe();

	}

}
