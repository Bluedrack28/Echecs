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
	public ArrayList<Coordonnee> possibleMove(Echiquier2 echec) {
		// TODO Auto-generated method stub
		ArrayList<Coordonnee> coor = new ArrayList<Coordonnee>();
		
		
		for (int i = this.x; i > -1; i--) {
			if(i != this.x){
				if(echec.getPiece(this.x, i) != null){
					if(echec.getPiece(this.x, i).getCamp() != this.getCamp()){
						coor.add(new Coordonnee(this.x, i));
					}
					break;
				}
				coor.add(new Coordonnee(this.x, i));
			}
		}
		for (int i = this.y; i > -1; i--) {
			if(i != this.y){
				if(echec.getPiece(i, this.y) != null){
					if(echec.getPiece(i, this.y).getCamp() != this.getCamp()){
						coor.add(new Coordonnee(i, this.y));
					}
					break;
				}
				coor.add(new Coordonnee(i, this.y));
			}
		}
		for (int i = this.x; i < 8; i++) {
			if(i != this.x){
				if(echec.getPiece(this.x, i) != null){
					if(echec.getPiece(this.x, i).getCamp() != this.getCamp()){
						coor.add(new Coordonnee(this.x, i));
					}
					break;
				}
				coor.add(new Coordonnee(this.x, i));
			}
		}
		for (int i = this.y; i < 8; i++) {
			if(i != this.y){
				if(echec.getPiece(i, this.y) != null){
					if(echec.getPiece(i, this.y).getCamp() != this.getCamp()){
						coor.add(new Coordonnee(i, this.y));
					}
					break;
				}
				coor.add(new Coordonnee(i, this.y));
			}
		}
		return coor;
	}

}
