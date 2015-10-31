package com.jdlsoft.juegos.model;

public abstract class Juego implements Jugable{
	protected int numeroJugada;
	protected Estado estado;
	
	public Juego(){
		this.numeroJugada=0;
		this.estado=estado.READY;
	}
	@Override
	public void reset() {
		this.estado = Estado.READY;
		this.numeroJugada++;
		
	}

	@Override
	public void resume() {
		if(this.estado==Estado.PAUSED){
			this.estado = Estado.RUNNING;
		}else{
			//TODO
		}
		
	}

	@Override
	public void pause() {
		if(this.estado==Estado.RUNNING){
			this.estado = Estado.PAUSED;
		}else{
			//TODO
		}
		
	}
	
}
