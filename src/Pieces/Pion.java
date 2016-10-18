package Pieces;

import java.net.URL;
import java.util.ArrayList;

import Game.Coordonnee;
import Game.Echiquier;

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
	public ArrayList<Coordonnee> possibleMove(Echiquier echec) {
		// TODO Auto-generated method stub
		ArrayList<Coordonnee> coor = new ArrayList<Coordonnee>();
	
		if(echec.getCamp() == this.getCamp()){

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
		for (int i = 0; i < coor.size(); i++) {
			if(echec.getPiece(coor.get(i).x, coor.get(i).y)!= null){
				coor.remove(i);
				i--;
			}
		
		}
		if(echec.getCamp() == this.getCamp()){
			if(echec.isInTheCheesBoard(this.x - 1, this.y - 1)){
				if(echec.isBeatable(this.x - 1, this.y - 1, this.getCamp())) coor.add(new Coordonnee(this.x - 1,this.y - 1));
			}
			if(echec.isInTheCheesBoard(this.x + 1, this.y - 1)){
				if(echec.isBeatable(this.x + 1, this.y - 1, this.getCamp())) coor.add(new Coordonnee(this.x + 1,this.y - 1));
			}
		}else{
			if(echec.isInTheCheesBoard(this.x + 1, this.y + 1)){
				if(echec.isBeatable(this.x + 1, this.y + 1, this.getCamp())) coor.add(new Coordonnee(this.x + 1,this.y + 1));
			}
			if(echec.isInTheCheesBoard(this.x - 1, this.y + 1)){
				if(echec.isBeatable(this.x - 1, this.y + 1, this.getCamp())) coor.add(new Coordonnee(this.x - 1,this.y + 1));
			}
		}
		
		return coor;
	}

	@Override
	public int getIdentity() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
