package com.jdlsoft.cajondesastre.model4;

import java.util.ArrayList;
import java.util.List;

public class MainTest {

	public static void main(String[] args) {
		Humano h1 = new Hombre(23, 67, 176);
		Humano h2 = new Mujer(44, 54, 164);
		
		List<Humano> humanos = new ArrayList<Humano>();
		
		humanos.add(h1);
		humanos.add(h2);
		
		System.out.println(humanos);
		
		System.out.println("Vida media hombres: " + Hombre.VIDA_MEDIA);
		System.out.println("Vida media mujeres: " + Mujer.VIDA_MEDIA);
		
		// ATENCIÓN!!!! MUY MALA PRÁCTICA. Absolutamente prohibido hacer lo siguiente:
		Hombre hombre1 = new Hombre(100, 82, 187);
		System.out.println("Vida media hombres: " + hombre1.VIDA_MEDIA);

	}

}
