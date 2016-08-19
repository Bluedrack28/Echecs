package Game;

public class Coordonnee  {

	public int x,y;
	
	public Coordonnee(int coordonneeX,int coordonneeY){
		x = coordonneeX;
		y = coordonneeY;
	}
	
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	public boolean isInTheCheesBoard(){
		if(this.y > 7 || this.x > 7|| this.y < 0 || this.x < 0){
			return false;
		}
		else{
			return true;
		}
	}
	
	
}
