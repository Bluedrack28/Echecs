package Game;

import java.net.URL;
import java.util.ArrayList;

public class Pion extends Piece{

	public Pion(int x, int y,boolean c) {
		super(x, y,c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getURLImage() {
		// TODO Auto-generated method stub
		if(this.getCamp()) return "pieces/bPion.png";
		else return "pieces/nPion.png";
	}

	@Override
	public ArrayList<Coordonnee> possibleMove() {
		// TODO Auto-generated method stub
		ArrayList<Coordonnee> coor = new ArrayList<Coordonnee>();
	
		if(this.getCamp()){
			if(this.y==6){
				coor.add(new Coordonnee(this.x,this.y - 2));	
			}
			coor.add(new Coordonnee(this.x,this.y - 1));
		}else{
			if(this.y==1){
				coor.add(new Coordonnee(this.x,this.y + 2));
			}
			coor.add(new Coordonnee(this.x,this.y + 1));
		}
		return coor;
	}

}
