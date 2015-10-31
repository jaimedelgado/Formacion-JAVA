package com.jdlsoft.gestionCoches.utils.test;

import static org.junit.Assert.assertEquals;

import java.sql.Date;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

import com.jdlsoft.gestionCoches.utils.GCDbQuery;

public class GCDbQueryTest {

	@Test
	public void generarQuery() {
		Map<String, Object> filtros = new LinkedHashMap<String, Object>();
		filtros.put(GCDbQuery.COCHES_HIBRIDOS, "CUALQUIERA");
		filtros.put(GCDbQuery.COCHES_SINIESTRADOS, "CUALQUIERA");
		Calendar calendar = Calendar.getInstance();
		calendar.set(2000, 0, 1);
		filtros.put(GCDbQuery.COCHES_FECHA_INICIO, new Date(calendar.getTimeInMillis()));
		String query = GCDbQuery.generarQuery(filtros);
		assertEquals(query.toLowerCase(), "SELECT * FROM gestioncoches.coches WHERE tipoMotor = 'Hibrido' AND Siniestrado = 1 AND fechaMatriculacion > '20000101'".toLowerCase());
	}

}
