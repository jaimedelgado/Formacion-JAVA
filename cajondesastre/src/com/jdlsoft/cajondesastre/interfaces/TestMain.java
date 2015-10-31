package com.jdlsoft.cajondesastre.interfaces;

public class TestMain {

	public static void main(String[] args) {
		//metodo1();
		metodo2();
	}
	
	public static void metodo1(){
		Moto moto1 = new Moto();
		moto1.arrancar();
		moto1.acelerar();
		moto1.acelerar();
		moto1.acelerar();
		moto1.acelerar();
		moto1.frenar();
		moto1.frenar();
		moto1.frenar();
		moto1.hacerCaballito();
		
		System.out.println("**************************");
		
		Vehiculo vehiculo1 = new Moto();
		((VehiculoMotor) vehiculo1).arrancar();
		((VehiculoMotor) vehiculo1).parar();
		
		Vehiculo vehiculo2 = new Coche();
		((VehiculoMotor) vehiculo2).arrancar();
		((VehiculoMotor) vehiculo2).parar();
	}
	
	public static void metodo2(){
		Vehiculo vehiculo = null;
		int numeroAleatorio = (int)(Math.random()*3);
		switch (numeroAleatorio){
		case 0: vehiculo = new Bicicleta(); break;
		case 1: vehiculo = new Moto(); break;
		case 2: vehiculo = new Coche();
		}
		vehiculo.acelerar();
		vehiculo.frenar();
	}

}
