package com.jdlsoft.cajondesastre.collections2;

import java.util.Comparator;

public class ComparatorID implements Comparator<Cliente>{

	@Override
	public int compare(Cliente cliente1, Cliente cliente2) {
		return cliente1.getId() - cliente2.getId();
	}

}
