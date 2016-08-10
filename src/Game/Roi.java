package Game;

import java.util.ArrayList;

public class Roi extends Piece{

	public Roi(int x, int y,boolean camp) {
		super(x, y, camp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getURLImage() {
		// TODO Auto-generated method stub
		if(this.getCamp()) return "pieces/bRoi.png";
		else return "pieces/nRoi.png";
	}


	@Override
	public ArrayList<Coordonnee> possibleMove() {
		// TODO Auto-generated method stub	
		return null;
	}

}
