package com.jdlsoft.helloworld.servlets;


/**
 * 
 * @author Administrador
 *
 */
public class LetraNumero {
	
	private Unidad unidad;
	private Decena decena;
	private Centena centena;
	
	public LetraNumero(){
		
	}

	public String cdu (int numero){
		//TODO
		
		
			
		
		int cifra1 = numero%10, cifra2 = 0 , cifra3=0 ;
		
	    numero=numero/10;

	    
			cifra2 = numero%10;
			numero=numero/10;	
	      
		
			cifra3 = numero%10;
			
		
		
		this.unidad = new Unidad(cifra1, cifra2, cifra3);
		this.decena = new Decena(cifra1, cifra2, cifra3);
		this.centena = new Centena(cifra1, cifra2, cifra3);
		
		return this.toString();
	}
	
	public String toString(){
		return centena.toString() + " " + decena.toString() + unidad.toString();
	}
	
	
	private class Unidad {

		private int digito1;
		
		private int digito2;
		
		private int digito3;
		
		public Unidad(){
			
		}
		
		public Unidad(int cifra1, int cifra2, int cifra3) {
			this.digito1 = cifra1;
			this.digito2 = cifra2;
			this.digito3 = cifra3;
		}

		public String toString(){
			String numero="";
			String [] numeros ={"diez", "once","doce","trece", "catorce", "quince", "dieciséis", "diecisiete",	"dieciocho","diecinueve", "veinte", "veintiuno","veintidós","veintitres", "veinticuatro", "veinticinco", "veintiséis", "veintisiete",
					"veintiocho","veintinueve"};
			int num = digito3*100 + digito2 * 10 + digito1;
			//numero = numeros [num-10];
			
			if (num>9&&num<30){
				
			}else if(num==0){
				numero="cero";
			}else if(num==100){
				numero="cien";
			}else{
				String [] numeros1 = {"uno", "dos", "tres", "cuatro",
						"cinco", "seis", "siete", "ocho", "nueve"};
				if(num>=10){
					numero+= " y ";
				}
				numero += numeros1[digito1-1];
			}
			
			return numero;
		}
	}
	
	private class Decena {
		
		private int digito1;
		
		private int digito2;
		
		private int digito3;
		
		public Decena(){
			
		}
		
		
		public Decena(int cifra1, int cifra2, int cifra3) {
			this.digito1 = cifra1;
			this.digito2 = cifra2;
			this.digito3 = cifra3;
			
		}

		public String toString(){
			
			String numero="";
			String [] numeros ={"diez", "once","doce","trece", "catorce", "quince", "dieciséis", "diecisiete",	"dieciocho","diecinueve", "veinte", "veintiuno","veintidós","veintitres", "veinticuatro", "veinticinco", "veintiséis", "veintisiete",
					"veintiocho","veintinueve"};
			int num = digito2 * 10 + digito1;
			
			
			if (num>9&&num<30){
				numero = numeros [num-10];
			}else if(num<10){
							
			}else{
				String [] numeros1 = {"excepcion1", "excepcion2", "treinta", "cuarenta",
						"cincuenta", "sesenta", "setenta", "ochenta", "noventa"};
				numero = numeros1[digito2-1];
			}
			
			return numero;
		}

	}
	
	private class Centena {
		
		private int digito1;
		
		private int digito2;
		
		private int digito3;
		
		public Centena(){
			
		}
		
		public Centena(int cifra1, int cifra2, int cifra3) {
			this.digito1 = cifra1;
			this.digito2 = cifra2;
			this.digito3 = cifra3;
		}

		public String toString(){
			if(digito1==0&&digito2==0||digito3==1&&digito1==0&&digito2==0){
				return "";
			}else if(digito3!=0){
			
				String [] numeros = {"ciento", "doscientos", "trescientos", "cuatrocientos",
						"quinientos", "seiscientos", "setecientos", "ochocientos", "novecientos"};
				return numeros [digito3-1];
			}
			else{
				return "";
			}
		}

	}
}

