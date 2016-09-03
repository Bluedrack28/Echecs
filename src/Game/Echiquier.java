package Game;

import java.util.ArrayList;

import javax.sql.rowset.spi.TransactionalWriter;

import Exception.NoPieceException;

public class Echiquier{
	public ArrayList<Piece> pieces;

//	private Piece[][] p = new Piece[8][8];	
	public Piece pBuffer;
	
	
//	1 = pion
//	2 = tourzh
//	3 = cheval
//	4 = fou
//	5 = reine
//	6 = roi
	
	
	public Echiquier(){
		pieces = new ArrayList<Piece>();
		
	}
	
	public void resetEchiquiquer(){

		pieces.removeAll(pieces);
		for (int i = 0; i < 8; i++) {
			pieces.add(new Pion(i,6,true));
		}
		for (int i = 0; i < 8; i++) {
			pieces.add(new Pion(i,1,false));
		}
		pieces.add(new Tour(0,7,true));
		pieces.add(new Tour(7,7,true));
		pieces.add(new Tour(0,0,false));
		pieces.add(new Tour(7,0,false));
		pieces.add(new Cheval(1,7,true));
		pieces.add(new Cheval(6,7,true));
		pieces.add(new Cheval(1,0,false));
		pieces.add(new Cheval(6,0,false));
		pieces.add(new Fou(2,7,true));
		pieces.add(new Fou(5,7,true));
		pieces.add(new Fou(2,0,false));
		pieces.add(new Fou(5,0,false));
		pieces.add(new Reine(4,7,true));
		pieces.add(new Reine(3,0,false));
		pieces.add(new Roi(3,7,true));
		pieces.add(new Roi(4,0,false));

		}
	
	
	public void addPiece(Piece p){
		pieces.add(p);
	}
	
	public ArrayList<Piece> getPieces(){	
		return pieces;
	}
	public Piece getBuffer(){
		return pBuffer;
	}
	
	public boolean isHereAPiece(int x,int y){
		for (Piece p : pieces) {
			if(p.x == x && p.y == y){
				 return true;
			 }
		}
		return false;
	}
	
	public Piece getPiece(int x,int y){
		for (Piece piece : pieces) {
			if(piece.getX() == x && piece.getY() == y){
				return piece;
			}
		}
		return null;
	}
	
	
	public void takePiece(int x,int y){
		
		pBuffer = null;
		
		for (int i = 0; i < pieces.size(); i++) {
			if(pieces.get(i).getX() == x && pieces.get(i).getY() == y){
				pBuffer = pieces.get(i);
				pieces.remove(i);
			}
		}
		
		if(pBuffer == null){
			//throw new NoPieceException();
			System.out.println("problem");
		}
		
	}

	public boolean isAPossibleMove(ArrayList<Coordonnee> coor,int x,int y) {
		for (Coordonnee c : coor) {
			if(c.getX() == x && c.getY() == y){
				return true;
			}
		}
		return false;
	}
	
	public void movePiece(int x,int y){
		
		
		if(this.isAPossibleMove(pBuffer.possibleMove(), x, y) && this.getPiece(x, y).getCamp() != pBuffer.getCamp()){
			if(this.getPiece(x, y) != null){
				pieces.remove(this.getPiece(x, y));
			}
			pBuffer.setX(x);
			pBuffer.setY(y);
			pieces.add(pBuffer);
		}else{
			pieces.add(pBuffer);
		}
	}
	
	
	
	
}
