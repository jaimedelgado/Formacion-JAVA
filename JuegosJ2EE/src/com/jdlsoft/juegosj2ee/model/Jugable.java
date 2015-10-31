package com.jdlsoft.juegosj2ee.model;

public interface Jugable {

	public String getVendor();
	
	public String getCredits();
	
	public void start();						//cambia de ready a running
	
	public String play(String jugada); 		    //RUNNING->RUNNING , ->LOSE, ->WIN
	
	public void reset();						//De cualquier estado a READY
	
	public void resume();						//De PAUSSED ->RUNNING
	
	public void pause();						//De RUNNING -> PAUSSED
	
	public String getHelp(); 					//Muestra ajuda del string de las jugadas 
	

	public enum Estado {
		READY,RUNNING,PAUSSED,WIN,LOSE;
	}
	
	public Estado getEstado ();
	
	public String getChivato();
}
