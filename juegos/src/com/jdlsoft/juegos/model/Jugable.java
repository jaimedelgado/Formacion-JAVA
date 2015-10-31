package com.jdlsoft.juegos.model;

public interface Jugable {
	public enum Estado{
		READY, RUNNING, PAUSED, WIN, LOSE;
	}
	public String getVendor();
	public String getCredits();
	public String getHelp();
	public void start();
	public String play(String jugada);
	public void reset();
	public void resume();
	public void pause();
}
