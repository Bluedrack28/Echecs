package Game;

public class Coordonnee  {

	public int x,y;
	
	public Coordonnee(int coordonneeX,int coordonneeY){
		x = coordonneeX;
		y = coordonneeY;
	}
	
	public void setX(int coordonneX){
		x = coordonneX;
	}
	public void setY(int coordonneY){
		y = coordonneY;
	}
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	public static boolean isInTheCheesBoard(int x,int y){
		if(y > 7 || x > 7|| y < 0 || x < 0){
			return false;
		}
		else{
			return true;
		}
	}
	
	
}
