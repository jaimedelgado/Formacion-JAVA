package com.jdlsoft.juegosj2ee.model;

import java.util.StringTokenizer;

/**
 * 
 * @author Obi Fran Kenobi, Saul Vader & Pablo Skywalker
 *
 */
public class MasterMind4 extends Juego {

	// Tendr� que tener variables de instancia necesarias para que el juego
	// tenga una combinaci�n concreta que otros no tienen.

	private static final int JUGADAS_MAXIMAS = 10;
	private String[] combinacionSecreta = { "Negro", "Negro", "Negro", "Negro" };
	private String[] colores = { "rojo", "azul", "verde", "amarillo", "blanco",
			"negro", "marron", "naranja" };

	public MasterMind4() {
		System.out
				.println("****Welcome to Star Wars Mastermind****\n           Hace mucho tiempo,\n    En una galaxia muy muy lejana...\n\n");
		//iniCombinacionSecreta();
	}

	private void iniCombinacionSecreta() {
		for (int i = 0; i < 4; i++) {
			combinacionSecreta[i] = colores[(int) (Math.random() * 8)];
		}
	}

	private boolean existeColor(String color) {
		for (int i = 0; i < 8; i++) {
			if (colores[i].equalsIgnoreCase(color)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void reset() {
		super.reset();
		iniCombinacionSecreta();
		// continuamos con nuestras cosas del Mastermind
	}

	@Override
	public void start() {
		if (estado == Estado.READY) {
			System.out.println("La guerra comenzado ha...");
			estado = Estado.RUNNING;
		} else {
			System.err.println("La batalla ya ha comenzado");
			// TODO
		}
	}

	@Override
	public String play(String jugada) {
		if (estado != Estado.RUNNING) {
			return "Error: La estrella de la muerte invadida ha sido, comenzar la batalla debe";
		} else {

			if (jugada.equals("R2D2")) {
				return getChivato();
			} else {
				if (jugada.equals("")) {
					return "Combinaci�n secreta introducir debe...";
				}
				int negras = 0;
				int blancas = 0;
				String[] secreta = combinacionSecreta.clone();

				String[] combinacionJugador = new String[4];
				int i = 0;
				StringTokenizer st = new StringTokenizer(jugada);
				while (st.hasMoreElements()) {
					if (i > 3) {
						break;
					}
					combinacionJugador[i] = st.nextToken();
					if (!existeColor(combinacionJugador[i])) {
						return combinacionJugador[i]
								+ ": Un color definido meter debe.";
					}
					System.out.print(combinacionJugador[i] + " ");
					i++;
				}
				
				if (i != 4){
					return "Cuatro colores introducir debe.";
				}

				System.out.println("");

				for (i = 0; i < 4; i++) {
					if (secreta[i].equalsIgnoreCase(combinacionJugador[i])) {
						negras++;
						secreta[i] = "*";
						combinacionJugador[i] = "-";
					}
				}
				if (negras == 4) {
					estado = Estado.WIN;
					return "WON YOU HAVE, YOUNG PADAWAN";
				}
				for (i = 0; i < 4; i++) {
					for (int j = 0; j < 4; j++) {
						if (secreta[i].equalsIgnoreCase(combinacionJugador[j])) {
							blancas++;
							secreta[i] = "*";
							combinacionJugador[j] = "-";
						}
					}

				}
				numeroJugada++;
				// System.out.println("Lleva " + numeroJugada + " jugada(s) de "
				// + jugadasMaximas);
				if (numeroJugada >= 10) {
					estado = Estado.LOSE;
					return "YOU LOSE... Welcome to the Dark Side";
				} else {
					return "Blancas: " + blancas + "; Negras: " + negras
							+ "\nLleva " + numeroJugada + " jugada(s) de "
							+ JUGADAS_MAXIMAS + "\n";
				}
			}

		}

	}

	@Override
	public String getHelp() {
		// TODO "a�adir informaci�n que pueda ser �til"
		StringBuilder stbu = new StringBuilder();

		stbu.append("REFUERZOS MASTERMIND\n\n")
				// en lugar de escribir una y otra vez sb.append, lo hacemos
				// como se muestra.
				.append("Colores disponibles:\n")
				.append("rojo, azul, verde, amarillo, blanco, negro, marron, naranja\n")
				.append("Cuatro de los colores disponibles introducir debe por espacios separados.\n")
				.append("Si m�s de cuatro colores introduce, los cuatro primeros en cuenta se tendr�n s�lo.\n")
				.append("Que los colores le acompa�en...\n");

		return stbu.toString();
	}

	@Override
	public String getVendor() {
		return "Stormtrooper Team & Co.";
	}

	@Override
	public String getCredits() {
		return "Star Wars Division";
	}

	@Override
	public String getChivato() {
		return "Intruso en el sistema, contrase�a robada: "
				+ combinacionSecreta[0] + " " + combinacionSecreta[1] + " "
				+ combinacionSecreta[2] + " " + combinacionSecreta[3];
	}
}
