package Game;

import java.util.ArrayList;

public class Echiquier{
	private ArrayList<Piece> pieces;
	private int[][] g;
	private Piece[][] p = new Piece[8][8];	
	
//	1 = pion
//	2 = tour
//	3 = cheval
//	4 = fou
//	5 = reine
//	6 = roi
	
	
	public Echiquier(){
		g = new int[8][8];
		pieces = new ArrayList<Piece>();
		
		p[1][2]  = new Tour(1,1,true);
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
	
	
	
	public ArrayList<Piece> getPieces(){	
		return pieces;
	}
	public Piece getPiece(int x,int y){
	 for (Piece p : pieces) {
		 try {
			 if(p.x == x && p.y == y){
				 return p;
			 }
		} catch (Exception e) {
		
		}
	}	
	 return null;	
	}
	
	
	
}
