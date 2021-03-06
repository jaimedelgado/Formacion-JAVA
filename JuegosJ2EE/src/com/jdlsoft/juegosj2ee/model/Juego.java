package com.jdlsoft.juegosj2ee.model;

public abstract class Juego implements Jugable{

	protected int numeroJugada;
	protected Estado estado;
	
	public Juego(){
		this.numeroJugada=0;
		this.estado=Estado.READY;
	}
	
	@Override
	public void reset() {
		this.numeroJugada = 0;
		this.estado= Estado.READY;
		
	}

	@Override
	public void resume() {
		if(estado==Estado.PAUSSED){
			estado = Estado.RUNNING;
		}else{
				//TODO
		}
		
	}

	@Override
	public void pause() {
		if(estado==Estado.RUNNING){
			estado = Estado.PAUSSED;
		}else{
				//TODO
		}
		
	}
	
	public Estado getEstado(){
		return this.estado;
	}
	
}
