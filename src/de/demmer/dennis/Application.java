package de.demmer.dennis;

import de.demmer.dennis.items.Pokeball;
import de.demmer.dennis.pokemon.Glumanda;
import de.demmer.dennis.ui.Renderer;

public class Application {

	public static void main(String[] args) {
		
		//STRG + SHIFT + O => auto-import
		Glumanda glumanda = new Glumanda();
		glumanda.id = 3;
		
		Glumanda glumanda2 = new Glumanda();
		glumanda2.id = 4;
		
		System.out.println(glumanda.compareTo(glumanda2));
	
		Pokeball pokeball = new Pokeball();
		
		Renderer renderer = new Renderer();
		
//
//		renderer.render(glumanda);
//		renderer.render(pokeball);
		
	}
	
	
}
