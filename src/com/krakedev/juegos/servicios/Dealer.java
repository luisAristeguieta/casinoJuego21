package com.krakedev.juegos.servicios;

import java.util.ArrayList;

import com.krakedev.juegos.entidades.Carta;

public class Dealer {
	private ArrayList<Carta> naipe = new ArrayList<>();

	public Dealer() {
	    generarNaipe();
	}
	
	public ArrayList<Carta> getNaipe() {
		return naipe;
	}

	public void setNaipe(ArrayList<Carta> naipe) {
		this.naipe = naipe;
	}
	
	public void generarNaipe() {
		// Genera una lista que recorra los palos  luego los valores para que haga la combinacion:
		
		ArrayList<String> auxiliarPalos = new ArrayList<>();
		auxiliarPalos.add("T");
		auxiliarPalos.add("CN");
		auxiliarPalos.add("CR");
		auxiliarPalos.add("D");
		
		ArrayList<String> auxiliarValor = new ArrayList<>();
		auxiliarValor.add("A");
		auxiliarValor.add("2");
		auxiliarValor.add("3");
		auxiliarValor.add("4");
		auxiliarValor.add("5");
		auxiliarValor.add("6");
		auxiliarValor.add("7");
		auxiliarValor.add("8");
		auxiliarValor.add("9");
		auxiliarValor.add("10");
		auxiliarValor.add("J");
		auxiliarValor.add("Q");
		auxiliarValor.add("K");
				
//		for (int i=0;i<auxiliarPalos.size();i++) {
//			for (int a=0;a<auxiliarValor.size();a++) {
//				
//				Carta carta = new Carta();
//				
//				carta.setPalo(auxiliarPalos.get(i));
//				carta.setValor(auxiliarValor.get(a));
//				
//				naipe.add(carta);
//			}
//		}
//		System.out.println(naipe.size());
		
		for (String palo : auxiliarPalos) {
			for(String valor : auxiliarValor) {
				Carta carta = new Carta();
				
				carta.setPalo(palo);
				carta.setValor(valor);
				
				naipe.add(carta);
			}
		}
	}
	
	public void imprimirNaipe() {
	    for (Carta carta : naipe) {
	        carta.imprimir();
	    }
	}
	
	public int generarAleatorio(int maximo) {
		// Genera un valor entre 0 y un valor maximo que se ingresa como parametro
	    int numero = (int)(Math.random() * (maximo + 1));
	    return numero;
	}
	
	
}
