package Game;

import java.util.ArrayList;

public class Fou extends Piece {

	public Fou(int x, int y, boolean camp) {
		super(x, y, camp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getURLImage() {
		// TODO Auto-generated method stub
		if (this.getCamp())
			return "pieces/bFou.png";
		else
			return "pieces/nFou.png";
	}

	@Override
	public ArrayList<Coordonnee> possibleMove(Echiquier echec) {
		// TODO Auto-generated method stub
		ArrayList<Coordonnee> coor = new ArrayList<Coordonnee>();
		Blocker b = new Blocker(echec, this);
		int x = this.x;
		int y = this.y;
		while(true){
			x ++;
			y ++;
			if(x >= 8 || y >= 8) break;
			if(b.isBlock(x, y)){
				if(!b.isBlockByAAlly(x, y)){
					coor.add(new Coordonnee(x,y));
				}
				break;
			}
			coor.add(new Coordonnee(x,y));
			
		}
		x = this.x;
		y = this.y;
		while(true){
			x --;
			y --;
			if(x < 0 || y < 0) break;
			if(b.isBlock(x, y)){
				if(!b.isBlockByAAlly(x, y)){
					coor.add(new Coordonnee(x,y));
				}
				break;
			}
			coor.add(new Coordonnee(x,y));
			
		}
		x = this.x;
		y = this.y;
		while(true){
			x --;
			y ++;
			if(x < 0 || y >= 8) break;
			if(b.isBlock(x, y)){
				if(!b.isBlockByAAlly(x, y)){
					coor.add(new Coordonnee(x,y));
				}
				break;
			}
			coor.add(new Coordonnee(x,y));
			
		}
		x = this.x;
		y = this.y;
		while(true){
			x ++;
			y --;
			if(x >= 8 || y < 0) break;
			if(b.isBlock(x, y)){
				if(!b.isBlockByAAlly(x, y)){
					coor.add(new Coordonnee(x,y));
				}
				break;
			}
			coor.add(new Coordonnee(x,y));
			
		}
		
			
		
		
		return coor;
	}

}
