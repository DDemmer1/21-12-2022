package de.demmer.dennis.pokemon;

import de.demmer.dennis.ui.Drawable;

public class Glumanda extends Pokemon implements Drawable{

	
	
	@Override
	public String getPokedexEntry() {
		return "Dieses Pokémon bevorzugt heiße Dinge. Bei Regen soll seine Schwanzspitze dampfen.";
	}

	@Override
	public String getImgUrl() {
		
		return "img/glumanda.png";
	}

	@Override
	public int compareTo(Pokemon pokemon) {
		
		if(id < pokemon.id) {
			return -1;
		} else if(id > pokemon.id) {
			return 1;
		} else {
			return 0;
		}
		
	}
	
	
	

}
