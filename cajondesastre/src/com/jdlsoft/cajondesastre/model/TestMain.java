package com.jdlsoft.cajondesastre.model;

public class TestMain {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		Direccion direccion1 = new Direccion();
		
		direccion1.setId(50);
		direccion1.setDireccion("Avenida de los pinos, 23");
		direccion1.setPoblacion("Madrid");
		direccion1.setCodigoPostal("08560");
		direccion1.setPais("España");
		
		cliente1.setId(10);
		cliente1.setNIF("651516452");
		cliente1.setMoroso(false);
		cliente1.setNumeroTrabajadores(5);
		cliente1.setNombre("Pepin Galvez Productions S.L");
		cliente1.setDireccion(direccion1);
		
		System.out.println(cliente1);
		
		//construimos otro cliente usando otro constructor
		
		Cliente cliente2 = new Cliente(23, "6516516814", "PRODUCCIONES BORLAN, S.L", false);
		
		System.out.println(cliente2);
	}

}
