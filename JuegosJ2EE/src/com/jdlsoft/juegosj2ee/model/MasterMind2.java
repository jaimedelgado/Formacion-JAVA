package com.jdlsoft.juegosj2ee.model;


/**
 * 
 * @author Paloma Ortiz, Francisco Nájera
 *
 */

public class MasterMind2 extends Juego {

	// variables de instancia necesarias para 
	private String[] solucion = new String[4];
	
	//private String[] solucion = {"A","A","A","A"};
	
	
	public MasterMind2() {
		super();
		for (int i = 0; i < 4; i++) {
			int solucionParcial = 1 + (int) (Math.random() * 8);
			String color = "";
			switch (solucionParcial) {
			case 1:
				color = "A";
				break;
			case 2:
				color = "V";
				break;
			case 3:
				color = "R";
				break;
			case 4:
				color = "N";
				break;
			case 5:
				color = "B";
				break;
			case 6:
				color = "M";
				break;
			case 7:
				color = "G";
				break;
			case 8:
				color = "L"; 
				break;

			}
			solucion[i] = color;
		}
	}

	@Override
	public void reset() {
		super.reset();
		// Continuar...

	}

	@Override
	public void start() {
		estado = Estado.RUNNING;

	}

	@Override
	public String play(String jugada) {

		System.out.println("La solución es " + solucion[0] + solucion[1] + solucion[2]
				+ solucion[3]);
		String[] respuesta = new String[4];
		String[] copiaSolucion = new String[4];
		String[] copiaRespuesta = new String[4];

		for (int i = 0; i <= 3; i++) {
			copiaSolucion[i] = solucion[i]; // obtenemos una copia de la solución
		}

		System.out.println("La copia de la solución es " + copiaSolucion[0]
				+ copiaSolucion[1] + copiaSolucion[2] + copiaSolucion[3]);


		for (int i = 0; i <= 3; i++) {
			respuesta[i] = jugada.substring(i, i + 1);
		}	// Transformamos la respuesta del usuario en un array de string
		
		int respuestaInvalida = 0;
		
		for (int i = 0; i<4;i ++){ // comprobamos la respuesta del usuario
			if (respuesta[i].equals("A")||respuesta[i].equals("V")||respuesta[i].equals("R")
			||respuesta[i].equals("N")||respuesta[i].equals("B")||respuesta[i].equals("M")
			||respuesta[i].equals("G")||respuesta[i].equals("L")){
			}else{
				respuestaInvalida = 1;
			}
		}
		
		if (respuestaInvalida == 1){
			System.out.println("Tu respuesta no es válida");
		}
		
		int negras = 0; // contador fichas negras
		int blancas = 0; // contador fichas blancas
		
		if (respuestaInvalida == 0) {

			for (int i = 0; i <= 3; i++) {
				copiaRespuesta[i] = respuesta[i];
			} // Obtenemos una copia de la respuesta

			System.out.println("La respuesta del usuario es " + respuesta[0]
					+ respuesta[1] + respuesta[2] + respuesta[3]);


			for (int x = 0; x < 4; x++) {
				if (copiaRespuesta[x].equals(copiaSolucion[x])) {
					negras++;
					copiaSolucion[x] = "";
					copiaRespuesta[x] = "";
				}
			} // Buscamos coincidencias de posición y color. Si encontramos una,
				// aumentamos negras y borramos la ficha de solución y
				// respuesta.

			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					if (copiaRespuesta[i].equals("")) {
						j = 4;
					} else if (copiaRespuesta[i].equals(copiaSolucion[j])) {
						blancas++;
						copiaSolucion[j] = "";
						j = 4;
					}

				}
			}

			System.out.println("El número de negras es..." + negras);
			System.out.println("El número de blancas es ..." + blancas);
		}
		
		if (negras == 4){
			System.out.println("Has ganado");
			estado = Estado.WIN;
		}
		
		//numeroJugada = numeroJugada + 1;
		numeroJugada++;
		System.out.println("Esta jugada es la número: " + numeroJugada);
		if (numeroJugada == 10){
			estado = Estado.LOSE;
			System.out.println("Fin del Juego");
		}
				
		return null;
	}

	@Override
	public String getVendor() {
		return "PGRSOFT GAME DIVISION\n";
	}

	@Override
	public String getCredits() {
		return "Pepín Gálvez Ridruejo\n";
	}

	@Override
	public String getHelp() {

		StringBuilder sb = new StringBuilder();

		sb.append("AYUDA MASTERMIND\n\n");
		sb.append("Colores disponibles:\n\n");
		sb.append("Escribe cuatro letras que correspondan a los siguientes colores:\n\n");
		sb.append("A - Azul\nV - Verde\nR - Rojo\nN - Negro\nB - Blanco\nM - Marrón\nG - Gris\nL - Amarillo\n\n");

		return sb.toString();
	}
	
	@Override
	public String getChivato(){
		//TODO
		return null;
	}

}
