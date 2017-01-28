package game;

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

}
