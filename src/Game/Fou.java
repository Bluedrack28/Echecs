package Game;

import java.util.ArrayList;

public class Fou extends Piece{

	public Fou(int x, int y, boolean camp) {
		super(x, y,camp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getURLImage() {
		// TODO Auto-generated method stub
		if(this.getCamp()) return "pieces/bFou.png";
		else return "pieces/nFou.png";
	}

	@Override
	public ArrayList<Coordonnee> possibleMove() {
		// TODO Auto-generated method stub
		ArrayList<Coordonnee> coor = new ArrayList<Coordonnee>();
		
		
		
		return coor;
	}

}
