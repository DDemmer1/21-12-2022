package de.demmer.dennis.pokemon;

public abstract class Pokemon implements Comparable<Pokemon>{
	
	int hp;
	String name;
	public long id;
	
	public abstract String getPokedexEntry();
	

}
