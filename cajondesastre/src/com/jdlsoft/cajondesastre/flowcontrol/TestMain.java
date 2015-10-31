package com.jdlsoft.cajondesastre.flowcontrol;

public class TestMain {

	public static void main(String[] args) {
		//metodo1();
		//metodo2();
		metodo3();
	}

	private static void metodo3() {
		int codigo = 0; // 0 es activo, 1 es inactivo
		String strCodigo;
		strCodigo = (codigo == 0) ? "activo":"inactivo";
	}

	private static void metodo2() {
		int opcion=4;
		switch(opcion){
		case 1: System.out.println("uno");
				break;
		case 2: System.out.println("dos");
				break;
		case 3: System.out.println("tres");
				break;
		case 4: System.out.println("cuatro");
				break;
		default: System.out.println("Otro numero");
		}
		
	}

	private static void metodo1() {
		for(int i=10, j=0; i>j; --i){
			System.out.println("i:" + i + " j:" + j);
		}
		
	}

}
