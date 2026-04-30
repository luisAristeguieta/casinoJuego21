package com.krakedev.juegos.test;

import java.util.ArrayList;

import com.krakedev.juegos.entidades.Jugador;
import com.krakedev.juegos.servicios.Juego21;

public class TestJuego21Final {

	public static void main(String[] args) {
		// Prueba integral de la clase Juego21:
		// Se crean jugadores, se inicializa el juego, se reparte y se valida el flujo completo
		
		Juego21 juego = new Juego21();
		juego.agregarJugador(new Jugador("Maria"));
		juego.agregarJugador(new Jugador("Carlos"));
		juego.agregarJugador(new Jugador("Luis"));

		juego.inicializar();

		// PRUEBA INICIAL:
		// Ejecuta una ronda para verificar que cada jugador recibe una carta
		juego.repartirRonda();

		// Imprime las cartas asignadas a cada jugador
		System.out.println("***** CARTAS DE LOS JUGADORES ******");
		for (Jugador jugador : juego.getJugadores()) {
			jugador.imprimir();
		}

		// PRIMERA PRUEBA:
		// Ejecuta el método jugar(), que simula hasta 3 rondas buscando ganadores
		System.out.println("\n***** PRIMERA PRUEBA: JUGAR() *****");

		ArrayList<Jugador> ganadores = juego.jugar();

		// Muestra resultados de la partida
		imprimirResultado(juego, ganadores);

		// SEGUNDA PRUEBA:
		// Ejecuta múltiples partidas (10 iteraciones) para validar comportamiento aleatorio

		for (int i = 0; i < 10; i++) {

		    System.out.println("\n--- Juego #" + (i + 1) + " ---");

		    juego.reiniciarJugadores(); // limpia jugadores
		    juego.inicializar();        // recrea el mazo

		    ganadores = juego.jugar();

		    imprimirResultado(juego, ganadores);
		}
	}

	// Método auxiliar que imprime cartas, puntajes y ganadores
	public static void imprimirResultado(Juego21 juego, ArrayList<Jugador> ganadores) {

		// Imprime cartas y total de cada jugador
		for (Jugador jugador : juego.getJugadores()) {
			jugador.imprimir();
			System.out.println("Total: " + jugador.getPuntajeCartas());
		}

		// Verifica si hubo ganadores en la partida
		if (ganadores.isEmpty()) {
			System.out.println("No hubo ganador");
		} else {
			System.out.println("Ganadores:");
			for (Jugador j : ganadores) {
				System.out.println(j.getNickname());
			}
		}
	}
}