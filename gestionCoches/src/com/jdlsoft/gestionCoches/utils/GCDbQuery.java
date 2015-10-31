package com.jdlsoft.gestionCoches.utils;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/**
 * Realiza la consulta a la base de datos usando los filtros convenientes
 * @author Jaime Delgado
 *
 */
public class GCDbQuery {

	private GCDbQuery(){
		
	}
	
	public final static String COCHES_TODOS = "SELECT * FROM gestioncoches.coches";
	
	//Consultas para filtrar coches por tipo de motor
	public final static String COCHES_DIESEL = "tipoMotor = 'Diesel'";
	public final static String COCHES_GASOLINA = "tipoMotor = 'Gasolina'";
	public final static String COCHES_HIBRIDOS = "tipoMotor = 'Hibrido'";
	
	//Consultas para filtrar coches siniestrados
	public final static String COCHES_SINIESTRADOS = "Siniestrado = 1";
	public final static String COCHES_NO_SINIESTRADOS = "Siniestrado = 0";
	
	//Consultas para filtrar coches por fechas
	public final static String COCHES_FECHA_INICIO = "fechaMatriculacion > '";
	public final static String COCHES_FECHA_FIN = "fechaMatriculacion < '";
	/**
	 * Realiza la consulta a la base de datos usando los filtros que se le pasen
	 * @param filtros
	 * @return
	 */
	public static String generarQuery(Map<String,Object> filtros){
		String query = "";
		if(!filtros.isEmpty()){
			query = GCDbQuery.COCHES_TODOS;
			Set<String> keys = filtros.keySet();
			if(!keys.isEmpty()){
				query += " WHERE ";
			}
			boolean tipoMotor = false;
			Iterator<String> it = keys.iterator();
			for(int i=0; i<keys.size(); i++){
				String key = it.next();
				Object o = filtros.get(key);
				switch(key){
					case GCDbQuery.COCHES_GASOLINA: query += GCDbQuery.COCHES_GASOLINA; tipoMotor=true; break;
					case GCDbQuery.COCHES_DIESEL: query += GCDbQuery.COCHES_DIESEL; tipoMotor=true; break;
					case GCDbQuery.COCHES_HIBRIDOS: query += GCDbQuery.COCHES_HIBRIDOS; tipoMotor=true; break;
					case GCDbQuery.COCHES_SINIESTRADOS: query += GCDbQuery.COCHES_SINIESTRADOS; break;
					case GCDbQuery.COCHES_NO_SINIESTRADOS: query += GCDbQuery.COCHES_NO_SINIESTRADOS; break;
					case GCDbQuery.COCHES_FECHA_INICIO: query += GCDbQuery.COCHES_FECHA_INICIO + o.toString().replaceAll("-", "") + "'"; break;
					case GCDbQuery.COCHES_FECHA_FIN: query += GCDbQuery.COCHES_FECHA_FIN + o.toString().replaceAll("-", "") + "'"; break;
					default: break;
				}
				if(tipoMotor && it.hasNext()){
					query += " OR ";
				}else if(it.hasNext()){
					query += " AND ";
				}
				
			}
		}
		return query;
	}
	
	
}