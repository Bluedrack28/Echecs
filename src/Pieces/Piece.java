package Pieces;

import java.awt.Image;
import java.util.ArrayList;

import Game.Coordonnee;
import Game.Echiquier;

public abstract class Piece extends Coordonnee{

	private boolean c;
	private int move = 0;
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
	public int getMovement(){
		return move;
	}
	public void mourir(){
	}
	public void plusOneMove(){
		move ++;
	}
	public abstract ArrayList<Coordonnee> possibleMove(Echiquier echec);

	public abstract String getURLImage();
	
	public abstract int getIdentity();
	
	
}
