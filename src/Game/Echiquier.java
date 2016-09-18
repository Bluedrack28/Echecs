package Game;

import Exception.NoPieceException;

public class Echiquier {

	public Piece[][] pieces;
	public  Piece pBuffer;
	private boolean turn;
	
	public Echiquier(){
		pieces = new Piece[8][8];
		turn = true;
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

	public void resetEchiquier(){
		for (int i = 0; i < 8; i++) {
			this.addPiece(new Pion(i,1,false));
		}
		for (int i = 0; i < 8; i++) {
			this.addPiece(new Pion(i,6,true));
		}
		this.addPiece(new Tour(0,7,true));
		this.addPiece(new Tour(7,7,true));
		this.addPiece(new Tour(0,0,false));
		this.addPiece(new Tour(7,0,false));
		this.addPiece(new Cheval(1,7,true));
		this.addPiece(new Cheval(6,7,true));
		this.addPiece(new Cheval(1,0,false));
		this.addPiece(new Cheval(6,0,false));
		this.addPiece(new Fou(2,7,true));
		this.addPiece(new Fou(5,7,true));
		this.addPiece(new Fou(2,0,false));
		this.addPiece(new Fou(5,0,false));
		this.addPiece(new Reine(4,7,true));
		this.addPiece(new Reine(3,0,false));
		this.addPiece(new Roi(3,7,true));
		this.addPiece(new Roi(4,0,false));
	}


	public boolean canTakeThisPiece(int x,int y,boolean tour){
		if(this.getPiece(x, y).getCamp() == tour){
			return true;
		}else{
			return false;
		}
		
	}
	
	public void takePiece(int x,int y) throws NoPieceException{
		pBuffer = null;
		pBuffer = pieces[x][y];
		if(pBuffer != null) pieces[x][y] = null;
		
		}

	public boolean isAPosibleMove(Piece p,int x,int y){
		for (Coordonnee c : p.possibleMove(this)) {
			if(c.getX() == x && c.getY() == y) return true;
		}
		return false;
	}

	public void movePiece(int x,int y){
		if(this.isAPosibleMove(pBuffer, x, y)){
			pBuffer.x = x;
			pBuffer.y = y;
			pieces[x][y] = pBuffer;
		}else{
			pieces[pBuffer.x][pBuffer.y] = pBuffer;
		}
	}
}
