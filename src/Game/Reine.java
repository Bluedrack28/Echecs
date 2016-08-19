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
