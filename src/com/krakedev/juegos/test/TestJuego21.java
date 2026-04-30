package com.krakedev.juegos.test;

import com.krakedev.juegos.entidades.Jugador;
import com.krakedev.juegos.servicios.Juego21;

public class TestJuego21 {

	public static void main(String[] args) {
		// Verifica toda la clase Juego21 y sus metodos para esto debe existir los
		// constructores en jugador y al menos get en la misma clase. Instancio, agrego
		// jugadores, inicializo, reparte e imprimo los resultados

		Juego21 juego = new Juego21();
		juego.agregarJugador(new Jugador("Maria"));
		juego.agregarJugador(new Jugador("Carlos"));
		juego.agregarJugador(new Jugador("Luis"));

		juego.inicializar();
		juego.repartirRonda();

		// 5. Imprimir jugadores y sus cartas
		System.out.println("***** CARTAS DE LOS JUGADORES ******");
		for (Jugador jugador : juego.getJugadores()) {
			jugador.imprimir();
		}

//		ver cartas restantes en el naipe
//		System.out.println("=== NAIPE RESTANTE ===");
//		System.out.println("Cartas restantes: " + juego.getDealer().getNaipe().size());
//		juego.getDealer().imprimirNaipe();
	}
}