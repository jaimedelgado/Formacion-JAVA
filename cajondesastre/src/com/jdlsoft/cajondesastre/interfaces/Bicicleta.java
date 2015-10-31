package com.jdlsoft.cajondesastre.interfaces;

public class Bicicleta implements Vehiculo{

	@Override
	public void acelerar() {
		System.out.println("Bicicleta acelerada");
		
	}

	@Override
	public void frenar() {
		System.out.println("Bicicleta frenada");
		
	}

}
