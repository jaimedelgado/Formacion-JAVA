package com.jdlsoft.cajondesastre.arrays;

public class TestMain {
	public static void main(String[] args){
		//metodo1();
		metodo2();
		metodo3();
	}

	private static void metodo3() {
		// TODO Auto-generated method stub
		
	}

	private static void metodo2() {
		int[][] numeros = new int[3][];
		numeros[2] = new int[3];
	}

	private static void metodo1() {
		int[] enteros1 = {0,1,2,3,4,5,6,7,8,9};
		int[] enteros2 = new int[10];
		int[] enteros3 = enteros2;
		for(int i=0; i<enteros1.length; i++){
			System.out.println(enteros1[i]);
		}
		
		for(int numero:enteros1){
			System.out.println(numero);
		}
	}
}
