package com.jdlsoft.cajondesastre.exceptions;

public class Main {

	public static void main(String[] args) {
		try {
			metodo1();
		} catch (JaimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void metodo1() throws JaimeException {
		JaimeException je = new JaimeException();
		DelgadoException de = new DelgadoException();
		throw je;
	}

}
