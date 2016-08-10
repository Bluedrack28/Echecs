package Game;

import java.util.ArrayList;

public class Tour extends Piece{

	public Tour(int x, int y,boolean camp) {
		super(x, y, camp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getURLImage() {
		// TODO Auto-generated method stub
		if(this.getCamp()) return "pieces/bTour.png";
		else return "pieces/nTour.png";
	}

	@Override
	public ArrayList<Coordonnee> possibleMove() {
		// TODO Auto-generated method stub
		ArrayList<Coordonnee> coor = new ArrayList<Coordonnee>();
		for (int i = 0; i < 8; i++) {
			if(i!=this.x){
				coor.add(new Coordonnee(i,this.y));
			}

		}
		for (int i = 0; i < 8; i++) {
			if(i!=this.x){
				coor.add(new Coordonnee(this.x,i));
			}
		}

		return coor;
	}

}
