package Game;

import java.awt.MouseInfo;

import Exception.NoPieceException;
import Main.Panel;

public class Gameplay{
	public Echiquier echec;
	public boolean camp;
	public boolean click;
	public Panel p;
	
	public Gameplay(Echiquier echiquier, Panel panel){
		click = true;
		camp = true;
		echec = echiquier;
		p = panel;
	}
	
	
	public void plays(){
		
		if(camp){
			this.move();
			
		}else{
			this.move();
		}
	}
	private void move(){
		if(click){
			try {
				echec.takePiece(this.getCoordonneX(), this.getCoordonneY(),camp);
				if(echec.pBuffer != null){
					p.drawTakePiece = true;
					click = false;
					p.repaint();
				}
				
			} catch (NoPieceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}else{
			try {
				echec.movePiece(this.getCoordonneX(), this.getCoordonneY(),camp);
				p.drawTakePiece = false;
				click = true;
				camp = !camp;
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			p.repaint();
			
		}
	}
	
	public int getCoordonneX(){
		return (int)((MouseInfo.getPointerInfo().getLocation().x-p.getLocationOnScreen().x)/100);
	}
	public int getCoordonneY(){
		return (int)((MouseInfo.getPointerInfo().getLocation().y-p.getLocationOnScreen().y)/100);
	}
}
