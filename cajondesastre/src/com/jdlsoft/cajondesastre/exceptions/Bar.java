package com.jdlsoft.cajondesastre.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketException;

public class Bar {
	public static void main(String[] args){
		System.out.println(i());
	}
	private static void metodo1(){
		try {
			metodo2();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (SocketException e) {
			e.printStackTrace();
			
		}catch(IOException e){
			
		} finally {
			System.out.println("ME EJECUTO SIEMPRE");
		}
	}
	//Lee un fichero
	private static void metodo2() throws FileNotFoundException, SocketException{
		int numeroAleatorio = (int) (Math.random() * 2);
		switch(numeroAleatorio){
		case 0: throw new FileNotFoundException();
		case 1: throw new SocketException();
		}
	}
	private static int i(){
		int i=10;
		try{
			throw new Exception();
		}catch(Exception e){
			return i++;
			
		}finally{
			//return i++;
		}
	}
}
