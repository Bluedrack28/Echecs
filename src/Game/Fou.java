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
	public ArrayList<Coordonnee> possibleMove(Echiquier2 echec)  {
		// TODO Auto-generated method stub
		ArrayList<Coordonnee> coor = new ArrayList<Coordonnee>();
		Blocker b = new Blocker(echec, this);
		if(this.x > this.y){
			for (int i = this.getY(); i > 0; i--) {
				
				coor.add(new Coordonnee(this.x-i,this.y-i));
			}
			for (int i = 1; i < 8-this.getX(); i++) {
				
				coor.add(new Coordonnee(this.x+i,this.y+i));
				
			}
			for (int i = this.getY(); i > 0; i--) {
				
				coor.add(new Coordonnee(this.x+i,this.y-i));
				
			}
			for (int i =this.getX() ; i > 0; i--) {
			
				coor.add(new Coordonnee(this.x-i,this.y+i));
			}
		}else{
			for (int i = this.getX(); i > 0; i--) {
				
				coor.add(new Coordonnee(this.x-i,this.y-i));
			}
			for (int i = 1; i < 8-this.getY(); i++) {
				
				coor.add(new Coordonnee(this.x+i,this.y+i));
			}
			for (int i = this.getY(); i > 0; i--) {
				
				coor.add(new Coordonnee(this.x+i,this.y-i));
			}
			for (int i = this.getX(); i > 0; i--) {
				
				coor.add(new Coordonnee(this.x-i,this.y+i));
			}
		}
		return coor;
	}

	
	
}
