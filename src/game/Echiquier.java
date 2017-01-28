package game;

import exception.NoPieceException;
import pieces.Cheval;
import pieces.Fou;
import pieces.Piece;
import pieces.Pion;
import pieces.Reine;
import pieces.Roi;
import pieces.Tour;

public class Echiquier {

	public Piece[][] pieces;
	public  Piece pBuffer;
	private boolean c = true;
	private int x;
	private int y;

	public Echiquier(){
		x = 7;
		y = 7;
		pieces = new Piece[x+1][y+1];
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public void addPiece(Piece p){
		pieces[p.getX()][p.getY()] = p;
	}
	
	public Piece getPiece(int x,int y){
		return pieces[x][y];
	}
	
	public Piece[][] getPieces(){
		return pieces;
	}
	public boolean getCamp(){
		return c;
	}
	public void resetEchiquier(boolean camp){
		pieces = new Piece[x+1][y+1];
		c = camp;
		for (int i = 0; i < 8; i++) {
			this.addPiece(new Pion(i,1,!camp));
		}
		for (int i = 0; i < 8; i++) {
			this.addPiece(new Pion(i,6,camp));
		}
		this.addPiece(new Tour(0,7,camp));
		this.addPiece(new Tour(7,7,camp));
		this.addPiece(new Tour(0,0,!camp));
		this.addPiece(new Tour(7,0,!camp));
		this.addPiece(new Cheval(1,7,camp));
		this.addPiece(new Cheval(6,7,camp));
		this.addPiece(new Cheval(1,0,!camp));
		this.addPiece(new Cheval(6,0,!camp));
		this.addPiece(new Fou(2,7,camp));
		this.addPiece(new Fou(5,7,camp));
		this.addPiece(new Fou(2,0,!camp));
		this.addPiece(new Fou(5,0,!camp));
		this.addPiece(new Reine(3,7,camp));
		this.addPiece(new Reine(3,0,!camp));
		this.addPiece(new Roi(4,7,camp));
		this.addPiece(new Roi(4,0,!camp));
	}


	public boolean canTakeThisPiece(int x,int y,boolean tour){
		if(this.getPiece(x, y).getCamp() == tour){
			return true;
		}else{
			return false;
		}
		
	}
	
	public void takePiece(int x,int y,boolean camp) throws NoPieceException{
		pBuffer = null;
		if(pieces[x][y] != null){
			if(pieces[x][y].getCamp() == camp)pBuffer = pieces[x][y];
		}
		
		if(pBuffer != null) pieces[x][y] = null;
		
	}
	public void resetTakedPiece(){
		pieces[pBuffer.getX()][pBuffer.getY()] = pBuffer;
		pBuffer = null;
	}
	public boolean isAPosibleMove(Piece p,int x,int y,boolean camp){
		for (Coordonnee c : p.possibleMove(this)) {
			if(c.getX() == x && c.getY() == y && p.getCamp() == camp) return true;
		}
		return false;
	}
	public boolean isBeatable(int x,int y,boolean camp){
		if(this.getPiece(x, y)!= null){
			if(this.getPiece(x, y).getCamp() != camp){
				return true;
			}
		}
		return false;
	}
	public void movePiece(int x,int y,boolean camp){
			pBuffer.x = x;
			pBuffer.y = y;
			pieces[x][y] = pBuffer;
	}
	public void replacePiece(int xDebut,int yDebut,int xFin,int yFin){
		Piece p = this.getPiece(xDebut, yDebut);
		p.setX(xFin);
		p.setY(yFin);
		this.addPiece(p);
		pieces[xDebut][yDebut] = null;
	}
	public boolean isInTheCheesBoard(int x,int y){
		if(y > this.getX() || x > this.getY()|| y < 0 || x < 0){
			return false;
		}
		else{
			return true;
		}
	}
}
