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
	public ArrayList<Coordonnee> possibleMove(Echiquier2 echec) {
		// TODO Auto-generated method stub
		ArrayList<Coordonnee> coor = new ArrayList<Coordonnee>();
	
		coor.add(new Coordonnee(this.x+1,this.y+1));
		
		
		coor.add(new Coordonnee(this.x,this.y+1));
		coor.add(new Coordonnee(this.x,this.y-1));
		coor.add(new Coordonnee(this.x-1,this.y));
		coor.add(new Coordonnee(this.x+1,this.y));
		coor.add(new Coordonnee(this.x-1,this.y-1));
		coor.add(new Coordonnee(this.x-1,this.y+1));
		coor.add(new Coordonnee(this.x+1,this.y+1));
		coor.add(new Coordonnee(this.x+1,this.y-1));
		
		for (int i = 0; i < coor.size(); i++) {
			if(!coor.get(i).isInTheCheesBoard()){
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

}
