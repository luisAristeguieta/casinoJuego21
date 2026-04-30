package com.krakedev.juegos.test;

import com.krakedev.juegos.entidades.Carta;
import com.krakedev.juegos.servicios.Dealer;

public class TestEntregarCarta {

	public static void main(String[] args) {
		// Verifica el metodo para entregar cartas, verifica el tamaño inicial, las
		// entrega, imprime y verifica la cantidad restante:

		Dealer dealer = new Dealer();

		System.out.println("Cartas iniciales: " + dealer.getNaipe().size());

		Carta carta = dealer.entregarCarta();

		System.out.println("Carta entregada:");
		carta.imprimir();

		System.out.println("Cartas restantes: " + dealer.getNaipe().size());

	}

}
