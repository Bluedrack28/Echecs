package Game;

import java.util.ArrayList;

public class Reine extends Piece{

	public Reine(int x, int y, boolean camp) {
		super(x, y, camp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getURLImage() {
		// TODO Auto-generated method stub
		if(this.getCamp()) return "pieces/bReine.png";
		else return "pieces/nReine.png";
	}

	@Override
	public ArrayList<Coordonnee> possibleMove() {
		// TODO Auto-generated method stub
		return null;
	}

}
