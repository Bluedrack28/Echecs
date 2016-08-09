package Game;

import java.awt.Image;

public abstract class Piece extends Coordonnee{
	
	public void mourir(){
		
	}
	public Coordonnee getCoordonnee(){
		
		return null;
	}
	
	public abstract int[] mouvement();
	public abstract Image setImage();
	
	
}
