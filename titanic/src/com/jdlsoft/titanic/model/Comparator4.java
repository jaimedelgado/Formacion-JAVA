package com.jdlsoft.titanic.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
/**
 * 
 * @author Francisco Nájera, Miriam del Río, Jaime Delgado
 * 08/10/2015
 * Ordena una colección de pasajeros según la siguiente prioridad:
 * 1-Entra primero el pasajero mujer, en caso de igualdad entran a la vez.
 * 2-Entran primero los nacidos a partir del 01-01-1999, en caso de igualdad entran a la vez.
 * 3-Entran primero los que tengan menor peso, en caso de igualdad entran a la vez.
 *
 */
public class Comparator4 implements Comparator<Pasajero> {

	@Override
	public int compare(Pasajero p1, Pasajero p2) {
		int pas1 = 0;
		int pas2 = 0;
		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
		if(p1.getSexo().equals("M")){
			pas1 = pas1-4;
		}
		if(p2.getSexo().equals("M")){
			pas2 = pas2-4;
		}
		
		try {
			if(p1.getFechaNacimiento().getTime()>=sdf.parse("01-01-1999").getTime()){
				pas1 = pas1-2;
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			if(p2.getFechaNacimiento().getTime()>=sdf.parse("01-01-1999").getTime()){
				pas2 = pas2-2;
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(p1.getPeso()<p2.getPeso()){
			pas1 = pas1-1;
		}else{
			pas2 = pas2-1;
		}
		return pas1-pas2;
	}

}
