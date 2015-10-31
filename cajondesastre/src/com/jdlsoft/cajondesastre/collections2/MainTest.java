package com.jdlsoft.cajondesastre.collections2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MainTest {

	public static void main(String[] args) {
		Cliente c1 = new Cliente(15, "Pepin", "6151451554H");
		Cliente c2 = new Cliente(10, "Carlota", "7894516514A");
		Cliente c3 = new Cliente(17, "Manolo", "8565165154G");
		Cliente c4 = new Cliente(9, "Juan", "9565165154F");
		
		Set<Cliente> clientes = new TreeSet<Cliente>();
		List<Cliente> clientes2 = new ArrayList<Cliente>();
		clientes.add(c1);
		clientes.add(c2);
		clientes.add(c3);
		clientes.add(c4);
		System.out.println("\n***** TreeSet de clientes *****");
		for(Cliente c: clientes){
			System.out.println(c);
			clientes2.add(c);
		}
		System.out.println("\n***** Lista de clientes antes de ordenar *****");
		for(Cliente c: clientes2){
			System.out.println(c);
		}
		
		Collections.sort(clientes2, new ComparatorID());
		System.out.println("\n***** Lista de clientes ordenada *****");
		for(Cliente c: clientes2){
			System.out.println(c);
		}
	}

}
