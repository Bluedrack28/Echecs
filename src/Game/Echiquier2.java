package Game;

public class Echiquier2 {

	public Piece[][] pieces;
	private Piece pBuffer;
	private boolean turn;
	
	public Echiquier2(){
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
	public boolean canTakeThisPiece(int x,int y,boolean tour){
		if(this.getPiece(x, y).getCamp() == tour){
			return true;
		}else{
			return false;
		}
		
	}
	
	
	
	public void takePiece(int x,int y){
		
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
		}
	}

}
