package com.krakedev.juegos.test;

import com.krakedev.juegos.servicios.Dealer;

public class TestAleatorio {

	public static void main(String[] args) {
		// Validara el metodo generarAleatorio que genere 100 interacciones, de valores entre 0 y el numero maximo
		// Aplicando banderas booleanas que salga 0 
		
		Dealer elGanador = new Dealer();
        int maximo = 10;

        boolean hayCero = false;
        boolean hayMaximo = false;

        for (int i = 0; i < 100; i++) {
            int numero = elGanador.generarAleatorio(maximo);
            System.out.println(numero);

            if (numero == 0) {
                hayCero = true;
            }

            if (numero == maximo) {
                hayMaximo = true;
            }
        }

        System.out.println("¿Salió 0? " + hayCero);
        System.out.println("¿Salió " + maximo + "? " + hayMaximo);
 
	}

}
