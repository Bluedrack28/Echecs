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
		
		for (int i =0; i < this.x; i++) {
			coor.add(new Coordonnee(this.x-i-1,this.y-i-1));
		}
		for (int i = 0; i < 7-this.y; i++) {
			coor.add(new Coordonnee(this.x+i+1,this.y+i+1));
		}
		for (int i = 0; i < 7-this.x; i++) {
			coor.add(new Coordonnee(this.x+i+1,this.y-i-1));
		}
		for (int i = 0; i < 7-this.y; i++) {
			coor.add(new Coordonnee(this.x-i-1,this.y+i+1));
		}
		
		return coor;
	}
}
