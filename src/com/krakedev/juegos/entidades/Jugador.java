package com.krakedev.juegos.entidades;

import java.util.ArrayList;

public class Jugador {
	private String nickname;
	private ArrayList<Carta> cartas = new ArrayList<>();
	
	public void recibirCarta(Carta carta) {
		cartas.add(carta);
	} 
	
	public void imprimir() {
	    System.out.println("Jugador: " + nickname);

	    for (Carta carta : cartas) {
	        carta.imprimir();
	    }

	    System.out.println("*******************");
	}
}
