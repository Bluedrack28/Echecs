package Game;

public class Echiquier2 {

	private Piece[][] pieces;
	private Piece pBuffer;
	private boolean turn;
	public Echiquier2(){
		pieces = new Piece[8][8];
		turn = true;
	}
	
	public void setPiece(Piece p){
		pieces[p.getX()][p.getY()] = p;
	}
	public Piece getPiece(int x,int y){
		return pieces[x][y];
	}
	public Piece[][] getPieces(){
		return pieces;
	}
	
	public void takePiece(int x,int y){
		pBuffer = pieces[x][y];
	}
	
	public void movePiece(int x,int y){
		pieces[x][y] = pBuffer; 
	}
//	public void movePiece(Coordonnee c){
//		this.movePiece(c.getX(), c.getY());
//	}

}
