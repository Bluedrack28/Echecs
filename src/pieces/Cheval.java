package pieces;

import java.util.ArrayList;

import game.Coordonnee;
import game.Echiquier;

public class Cheval extends Piece{

	public Cheval(int x, int y,boolean camp) {
		super(x, y,camp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getURLImage() {
		// TODO Auto-generated method stub
		if(this.getCamp()) return "src/pieces/images/bCheval.png";
		else return "src/pieces/images/nCheval.png";
	}

	@Override
	public ArrayList<Coordonnee> possibleMove(Echiquier echec) {
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
		
		for (int i = 0; i < coor.size(); i++) {
			if(!echec.isInTheCheesBoard(coor.get(i).getX(),coor.get(i).getY() )){
				coor.remove(i);
				i--;
			}
		}
		for (int i = 0; i < coor.size(); i++) {
			if(echec.getPiece(coor.get(i).x, coor.get(i).y)!= null){
				if(echec.getPiece(coor.get(i).x, coor.get(i).y).getCamp() == this.getCamp()){
					coor.remove(i);
					i--;
				}
			}
		}
		
		return coor;
	}

	@Override
	public int getIdentity() {
		// TODO Auto-generated method stub
		return 2;
	}

}
