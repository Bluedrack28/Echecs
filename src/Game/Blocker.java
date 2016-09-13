package Game;

public class Blocker {
	private Echiquier2 echec;
	private Piece p;
	public Blocker(Echiquier2 echiquier, Piece piece){
		echec = echiquier;
		p = piece;
	}
	
	
	public boolean isBlock(int x, int y){
		if(echec.getPiece(x, y) != null) return true;
		return false;
	}
	public boolean isBlockByAAlly(int x,int y){
		if(echec.getPiece(x, y).getCamp() == p.getCamp()) return true;
		return false;
	}
}
