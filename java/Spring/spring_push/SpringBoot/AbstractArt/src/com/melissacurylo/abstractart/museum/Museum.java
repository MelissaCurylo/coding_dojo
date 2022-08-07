package com.melissacurylo.abstractart.museum;

import java.util.ArrayList;
import java.util.Collections;

import com.melissacurylo.abstractart.Art;
import com.melissacurylo.abstractart.museum.models.Painting;
import com.melissacurylo.abstractart.museum.models.Sculpture;

public class Museum {
	
    public static void main(String[] args) {
        ArrayList<Art> museum = new ArrayList<Art> ();
        
        
        // creating 3 Paintings and 2 Sculptures
        museum.add(new Painting("The Birth of Venus", "Sandro Botticelli", "Venus on a giant clamshell", "Canvas"));
        museum.add(new Painting("Arrangement in Grey and Black No.1", "James Abbott McNeill WHistler", "Portrait of Motherhood", "Unknown"));
        museum.add(new Painting("The Arnolfini Portrait", "Jan van Eyck", "Italian Portrait", "Oils"));
        museum.add(new Sculpture("Bust of Nefertiti", "Thutmose", "Queen Nefertiti", "Stucco-Coated Limestone"));
        museum.add(new Sculpture("The Terracotta Army", "Sculptor for Shi Huang", "Army to protect Emperor of China", "Terracotta Clay"));

        // storing paintings and sculptures in ArrayList Museum
    	Collections.shuffle(museum);
    	
    	for(Art artwork : museum) {
    		artwork.viewArt();
    	}
    }

}
