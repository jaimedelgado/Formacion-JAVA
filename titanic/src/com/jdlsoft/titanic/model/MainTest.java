package com.jdlsoft.titanic.model;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class MainTest {

	public static void main(String[] args) {
		 Pasajero p1 = new Pasajero(10, "Carlos", "López", "Marín", 20.34, "H", 67.3, 1.60, true);
		 Pasajero p2 = new Pasajero(15, "Ana", "Ocaña", "Martini", 25.00, "M", 78.4, 1.58, false);
		 Pasajero p3 = new Pasajero(45, "Paco", "Blas", "Almirall", 26.02, "H", 80.2, 1.90, true);
		 Pasajero p4 = new Pasajero(18, "Ana", "Pi", "Moha", 22.50, "M", 77.3, 1.70, false);
		 Pasajero p5 = new Pasajero(24, "Luis", "Oña", "Smith", 23.10, "H", 57.3, 1.60, true);
		 Pasajero p6 = new Pasajero(23, "Carlota", "Zea", "Igual", 20.34, "M", 92.1, 1.73, false);
		 Pasajero p7 = new Pasajero(37, "Honorio", "Gómez", "Beltran", 21.02, "H", 82.7, 1.75, true);
		 Pasajero p8 = new Pasajero(46,	"Sebastian","Gallardo","Pizarro",48.90,"H",77.3,1.80,true);
		 Pasajero p9 = new Pasajero(38,	"Marta","Marquez","Hernandez",35.63,"M",60.1,1.65,false);
		 Pasajero p10 = new Pasajero(8,	"Carla","Alvarez","Mar",5.21,"M",50,1.32,true);
		 
		// FECHAS MAS BUENAS....

		 SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
			 	
			 	try {
					p1.setFechaNacimiento(sdf.parse("22-09-1968"));
					p2.setFechaNacimiento(sdf.parse("12-10-1971"));
					p3.setFechaNacimiento(sdf.parse("26-11-1978"));
					p4.setFechaNacimiento(sdf.parse("19-02-1989"));
					p5.setFechaNacimiento(sdf.parse("22-04-1996"));
					p6.setFechaNacimiento(sdf.parse("04-08-1999"));
					p7.setFechaNacimiento(sdf.parse("05-03-2010"));
					p8.setFechaNacimiento(sdf.parse("06-05-2009"));
					p9.setFechaNacimiento(sdf.parse("07-06-2000"));
					p10.setFechaNacimiento(sdf.parse("08-06-1988"));
									
				} catch (ParseException e) {
					e.printStackTrace();
				}
		 
		 // Creamos lista pasaje
		 List<Pasajero>	barco = new ArrayList<Pasajero>();
		 
		 // Embarcamos al pasaje
		 barco.add(p1);
		 barco.add(p2);
		 barco.add(p3);
		 barco.add(p4);
		 barco.add(p5);
		 barco.add(p6);
		 barco.add(p7);
		 barco.add(p8);
		 barco.add(p9);
		 barco.add(p10);
		 
		 // Creamos la lista de evacuación
		 
		 Collections.sort(barco,new Comparator4());
		System.out.println("****** Lista de Pasajeros una vez ordenada *******");
			
		for (Pasajero p : barco){
			System.out.println(p);
		}
		 

	}

}
