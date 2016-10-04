package Pieces;

import java.util.ArrayList;

import Game.Coordonnee;
import Game.Echiquier;

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
	public ArrayList<Coordonnee> possibleMove(Echiquier echec) {
		// TODO Auto-generated method stub
		ArrayList<Coordonnee> coor = new ArrayList<Coordonnee>();
		Blocker b = new Blocker(echec, this);
		for (int i = this.y+1 ; i < 8; i++) {
			
			if(b.isBlock(this.x, i)){
				if(!b.isBlockByAAlly(this.x, i)){
					coor.add(new Coordonnee(this.x, i));
				}
				break;
			}
			
			coor.add(new Coordonnee(this.x, i));
			
		}
		for (int i = this.x+1 ; i < 8; i++) {
			
			if(b.isBlock(i, this.y)){
				if(!b.isBlockByAAlly(i, this.y)){
					coor.add(new Coordonnee(i, this.y));
				}
				break;
			}
			coor.add(new Coordonnee(i, this.y));
			
		}
		for (int i = this.y-1 ; i > -1; i--) {
			
			if(b.isBlock(this.x, i)){
				if(!b.isBlockByAAlly(this.x, i)){
					coor.add(new Coordonnee(this.x, i));
				}
				break;
			}
			
			coor.add(new Coordonnee(this.x, i));
			
		}
		for (int i = this.x-1 ; i > -1; i--) {
			
			if(b.isBlock(i, this.y)){
				if(!b.isBlockByAAlly(i, this.y)){
					coor.add(new Coordonnee(i, this.y));
				}
				break;
			}
			coor.add(new Coordonnee(i, this.y));
			
		}

		return coor;
	}

	
}
