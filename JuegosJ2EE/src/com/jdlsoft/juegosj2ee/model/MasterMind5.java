package com.jdlsoft.juegosj2ee.model;

/**
 * 
 * @author Christian, Juan y Santi
 *
 */
public class MasterMind5 extends Juego {
	
	private String[] colores = {"R","V","A","N","B","M","G","C"};
	private String[] combinacionSecreta = new String[4];

	// variables de instancia
	
	public MasterMind5(){
		super();
	}

	@Override
	public void reset() {
		super.reset();
		int aux;
		for (int i = 0; i < combinacionSecreta.length; i++){
			aux=(int) (Math.random()* colores.length);
			combinacionSecreta[i] = colores[aux];
		}
	}

	@Override
	public void start() {
		if (getEstado() == Estado.READY) {
			estado = Estado.RUNNING;
		} else {
			// TODO
		}

	}

	@Override
	public String play(String jugada) {
		jugada= jugada.toUpperCase();
		if(jugada.equals("C"))
			return getChivato();
		
		String[] combinacionJugador = convertirStringArray(jugada);
		String[] auxSecreta=combinacionSecreta.clone();
		int negra = 0;
		int blanca = 0;

		for (int i = 0; i < combinacionJugador.length; i++) {
			if(combinacionJugador[i].equals(combinacionSecreta[i])){
				negra++;
				auxSecreta[i]="-";
				combinacionJugador[i]="+";
			}
		}
		for (int i=0; i<combinacionJugador.length;i++){
			for(int j=0;j<combinacionJugador.length;j++){
				if(combinacionJugador[i].equals(auxSecreta[j])){
					blanca++;
					auxSecreta[i]="*";
					
					break;
				}
			}
		}
		if(negra==4){
			estado= Estado.WIN;
			return "Has ganado !!!"; 
		}else if(numeroJugada==9){
			estado=Estado.LOSE;
			return "YOU LOSE";
		}else {
			numeroJugada++;
			return "Numero de negras: "+ negra + "\nNumero de blancas: "+ blanca 
					+ "\nTe quedan "+ (10-numeroJugada) + " jugadas"
					+"\nIntroduce la nueva jugada: ";
		}
			
		
	}

	private String[] convertirStringArray(String jugada) {
		String[] aux = new String[4];
		for (int i = 0; i < jugada.length(); i++) {
			aux[i] = String.valueOf(jugada.charAt(i));
		}

		return aux;
	}

	@Override
	public String getHelp() {
		StringBuilder sb = new StringBuilder();
		sb.append("Ayuda de MASTERMIND \n")
		.append("Los colores son los siguientes : \n")
		.append("'R'-'r': Rojo , 'V'-'v':Verde, 'A'-'a':Amarillo, 'N'-'n':Negro, \n'B'-'b':Blanco, 'M'-'m':Marron, 'G'-'g':Gris y 'C'-'c':Cian")
		.append("\nIntroduzca la jugada de las siguiente forma: ANCM o ancm ");
		return sb.toString();
	}

	@Override
	public String getVendor() {
		return "csTechSoft GAME DIVISION";

	}

	@Override
	public String getCredits() {
		return "Pepin Glavez";
	}

	@Override
	public String getChivato() {
		StringBuilder combinacion=new StringBuilder("La combinacion es : ");
		for(String c:combinacionSecreta){
			combinacion=combinacion.append(c.toString());
		}
		return combinacion.toString();
	}

}
