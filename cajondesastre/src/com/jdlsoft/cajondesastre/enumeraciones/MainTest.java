package com.jdlsoft.cajondesastre.enumeraciones;

public class MainTest {

	public static void main(String[] args) {
		Estado estado =Estado.READY;
		
		switch(estado){
		case READY: System.out.println("Juego ready..."); break;
		case RUNNING: System.out.println("Juego running..."); break;
		}
	}

}
