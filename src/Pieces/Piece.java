package Pieces;

import java.awt.Image;
import java.util.ArrayList;

import Game.Coordonnee;
import Game.Echiquier;

public abstract class Piece extends Coordonnee{

	private boolean c;
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @param camp true = blanc false = noir
	 */

	public Piece(int x ,int y, boolean camp){
		super(x,y);
		c = camp;
	}
	
	public boolean getCamp(){
		return c;
	}
	
	public void mourir(){
	}
	
	public abstract ArrayList<Coordonnee> possibleMove(Echiquier echec);

	public abstract String getURLImage();
	
	
	
	
}