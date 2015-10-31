package com.jdlsoft.juegos.model;

public class MasterMind extends Juego{

	@Override
	public String getVendor() {
		return "JDL SOFT GAME DIVISION";
	}

	@Override
	public String getCredits() {
		return "Pepin Gálvez Ridruejo";
	}

	@Override
	public String getHelp() {
		StringBuilder sb = new StringBuilder();
		sb.append("AYUDA");
		//TODO El jueves ha de estar
		return sb.toString();
	}

	@Override
	public void start() {
		//TODO
		
	}

	@Override
	public String play(String jugada) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void reset(){
		super.reset();
		// TODO Continuar cosas de mastermind
	}
	
}
