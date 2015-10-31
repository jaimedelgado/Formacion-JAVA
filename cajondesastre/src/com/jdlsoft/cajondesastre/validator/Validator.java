package com.jdlsoft.cajondesastre.validator;
/**
 * 14/10/2015
 * Clase que implementa un validador de cadenas y DNI's. 
 * @author Jaime Delgado Linares
 *
 */
public class Validator {
	/**
	 * M�todo que comprueba que la cadena sea mayor que el m�nimo de caracteres
	 * deseados y menor que el m�ximo. Tambi�n comprueba que el m�nimo sea mayor que cero y menor que el m�ximo, as� como que
	 * el m�ximo tambi�n sea mayor que cero.
	 * @param cadena String con la cadena a comprobar.
	 * @param min M�nimo n�mero de letras que puede tener la cadena. Tiene que ser mayor que cero y menor que el m�ximo.
	 * @param max M�ximo n�mero de letras que puede tener la cadena. Tiene que ser mayor que cero y mayor que el m�nimo.
	 * @return True si la cadena cumple con todos los requisitos y False en cualquier otro caso.
	 */
	public static boolean validateLen(String cadena, int min, int max){		
		return cadena != null && min <= max && min > 0 && max > 0 && cadena.length() >= min && cadena.length() <= max;
	}
	/**
	 * M�todo que comprueba si un DNI tiene la forma correcta de un DNI. Comprueba que tenga 9 car�cteres, que los ocho primeros
	 * sean n�meros y lo �ltimo una letra. Adem�s el resto resultante de dividir el n�mero entre 23 tiene que ser la correcta.
	 * Las letras del cero al veintid�s son las siguientes: T,R,W,A,G,M,Y,F,P,D,X,B,N,J,Z,S,Q,V,H,L,C,K,E.
	 * @param dni DNI a comprobar
	 * @return True si tiene la forma correcta de un DNI y False en cualquier otro caso.
	 */
	public static boolean validateDNI(String dni){
		boolean ok = false;
		if(dni != null && dni.length()==9 && Character.isAlphabetic(dni.charAt(8))){
			ok = true;
			try{
				if(ok){
					int numero = Integer.parseInt(dni.substring(0, 8));
					int resto = numero%23;
					char[] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
					if(letras[resto] != dni.charAt(8)){
						ok = false;
					}
				}
			}catch(NumberFormatException e){
				ok = false;
			}finally{
				
			}
		}
		return ok;
	}
}
