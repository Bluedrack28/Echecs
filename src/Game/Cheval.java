package Game;

import java.util.ArrayList;

public class Cheval extends Piece{

	public Cheval(int x, int y,boolean camp) {
		super(x, y,camp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getURLImage() {
		// TODO Auto-generated method stub
		if(this.getCamp()) return "pieces/bCheval.png";
		else return "pieces/nCheval.png";
	}

	@Override
	public ArrayList<Coordonnee> possibleMove() {
		// TODO Auto-generated method stub
		ArrayList<Coordonnee> coor = new ArrayList<Coordonnee>();
		
		coor.add(new Coordonnee(this.x+2,this.y+1));
		coor.add(new Coordonnee(this.x+2,this.y-1));
		coor.add(new Coordonnee(this.x-2,this.y+1));
		coor.add(new Coordonnee(this.x-2,this.y-1));
		coor.add(new Coordonnee(this.x+1,this.y+2));
		coor.add(new Coordonnee(this.x+1,this.y-2));
		coor.add(new Coordonnee(this.x-1,this.y+2));
		coor.add(new Coordonnee(this.x-1,this.y-2));

		return coor;
	}

}
