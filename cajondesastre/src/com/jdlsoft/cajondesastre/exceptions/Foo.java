package com.jdlsoft.cajondesastre.exceptions;

import java.io.IOException;

public class Foo {
	public static void main(String[]args){
		//metodo1();
		Foo foo = new Foo();
		foo.metodoA();
	}
	private static void metodo1(){
		metodo2();
	}
	private static void metodo2(){
		try{
			metodo3();
		}catch(IOException e){
			System.out.println("Excepcion");
		}
	}
	private static void metodo3() throws IOException{
		int a = 10/0;
	}
	public void metodoA(){
		metodoB();
	}
	public void metodoB(){
		metodoA();
	}
}
