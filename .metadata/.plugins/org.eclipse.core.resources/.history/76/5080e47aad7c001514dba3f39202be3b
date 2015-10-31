package com.jdlsoft.juegosj2ee.model;

public class MasterMind3 extends Juego{
	
	private int numCorrectas;
	private int numDescolocadas;
	private Color[] combinacionSecreta;
	private enum Color {
		ROJO, VERDE, AZUL, AMARILLO, MARRON, NARANJA, NEGRO, BLANCO, AUX;
		public static Color getRandomFicha(){  // devuelve aleatoriamente un elemento de los internos
			int numeroAleatorio = (int) (Math.random()*values().length-1); //values devuelve un vector de Ficha
			return values()[numeroAleatorio];
			
		}
	}
	
	@Override
	public void reset(){
		super.reset();
		// Continuamos con nuestras cosas de MasterMind
		
	}
	
	public MasterMind3(){
		this.combinacionSecreta = new Color[4];
		this.combinacionSecreta[0] = Color.getRandomFicha();
		this.combinacionSecreta[1] = Color.getRandomFicha();
		this.combinacionSecreta[2] = Color.getRandomFicha();
		this.combinacionSecreta[3] = Color.getRandomFicha();	
	}

	@Override
	public void start() {
		this.combinacionSecreta = new Color[4];
		this.combinacionSecreta[0] = Color.getRandomFicha();
		this.combinacionSecreta[1] = Color.getRandomFicha();
		this.combinacionSecreta[2] = Color.getRandomFicha();
		this.combinacionSecreta[3] = Color.getRandomFicha();	
		this.estado = Estado.RUNNING;
	}

	@Override
	public String play(String jugada) {
		String resultado="";
		String[] ronda = jugada.split(",");
		Color[] combinacionJugada = new Color[4];
		for(int i=0; i<ronda.length; i++){
			combinacionJugada[i] = this.getColor(ronda[i]);
		}
		this.comprueba(combinacionJugada);
		this.numeroJugada++;
		if(this.numCorrectas==this.combinacionSecreta.length){
			this.estado = Estado.WIN;
			resultado="¡¡HAS GANADO!!" + " ESTADO: " + this.estado;
			
		}else{
			if(this.numeroJugada==10){
				this.estado = Estado.LOSE;
				resultado="¡¡HAS PERDIDO!!" + " ESTADO: " + this.estado;
			}else{
				resultado = "#" + (10-this.numeroJugada+1) + ": FICHAS COLOCADAS: " + numCorrectas + ", FICHAS DESCOLOCADAS: " +numDescolocadas
							+ " ESTADO: " + this.estado;
				this.estado = Estado.RUNNING;
			}
		}
		
		return resultado;
		
	}
	
	private void comprueba(Color[] combinacionJugada){
		this.numCorrectas=0;
		this.numDescolocadas=0;
		Color[] aux = new Color[this.combinacionSecreta.length];
		for(int i=0; i<this.combinacionSecreta.length; i++){
			aux[i] = this.combinacionSecreta[i];
			if(this.combinacionSecreta[i]==combinacionJugada[i]){
				this.numCorrectas++;
				aux[i] = Color.AUX;
				combinacionJugada[i] = Color.AUX;
			}
		}
		for(int i=0; i<combinacionJugada.length; i++){
			for(int j=0;j<combinacionSecreta.length;j++){
				if((i!=j)&&combinacionJugada[i]!=Color.AUX&&aux[j]!=Color.AUX && (combinacionJugada[i]==aux[j])){
					this.numDescolocadas ++;
					combinacionJugada[i]=Color.AUX;
					aux[j]=Color.AUX;					
				}
				
			}
		}
	}
	
	private Color getColor(String color){
		Color c = null;
		switch(color){
		case "ROJO": c = Color.ROJO; break;
		case "VERDE": c = Color.VERDE; break;
		case "AZUL": c = Color.AZUL; break;
		case "AMARILLO": c = Color.AMARILLO; break;
		case "MARRON": c = Color.MARRON; break;
		case "NARANJA": c = Color.NARANJA; break;
		case "NEGRO": c = Color.NEGRO; break;
		case "BLANCO": c = Color.BLANCO; break;
		default: c = Color.AUX; break;
		}
		return c;
	}
	
	private String getColor(Color color){
		String c = null;
		switch(color){
		case ROJO: c = "ROJO"; break;
		case VERDE: c = "VERDE"; break;
		case AZUL: c = "AZUL"; break;
		case AMARILLO: c = "AMARILLO"; break;
		case MARRON: c = "MARRON"; break;
		case NARANJA: c = "NARANJA"; break;
		case NEGRO: c = "NEGRO"; break;
		case BLANCO: c = "BLANCO"; break;
		default: c = "AUX"; break;
		}
		return c;
	}
	
	@Override
	public String getVendor() {
		return "MARJAILI GAME DIVISION";
	}

	@Override
	public String getCredits() {
		return "Pepin Gálvez Ridruejo";
	}

	@Override
	public String getHelp() {

		StringBuilder sb = new StringBuilder();
		sb.append(  "-----------------------------\n")
			.append("      AYUDA MASTERMIND\n")
			.append(  "-----------------------------\n")
			.append("Colores disponibles: ROJO, VERDE, AZUL, AMARILLO, MARRON, NARANJA, NEGRO, BLANCO. \n")
			.append("En la jugada hay que meter los colores disponibles en mayúsculas, separadas por comas, sin espacios. \n");

		return sb.toString();
	}

	@Override
	public Estado getEstado() {

		return this.estado;
	}

	@Override
	public String getChivato() {
		
		String resultado = "";
		for (int i=0; i<this.combinacionSecreta.length; i++) {
			if(i!=0){
				resultado+=", ";
			}
			resultado += this.getColor(this.combinacionSecreta[i]); 
			
		}
		
		return resultado;
	}



	public int getNumCorrectas() {
		return numCorrectas;
	}



	public void setNumCorrectas(int numCorrectas) {
		this.numCorrectas = numCorrectas;
	}



	public int getNumDescolocadas() {
		return numDescolocadas;
	}



	public void setNumDescolocadas(int numDescolocadas) {
		this.numDescolocadas = numDescolocadas;
	}

	

}
