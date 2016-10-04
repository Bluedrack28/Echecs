package Game;

import java.awt.MouseInfo;

import Exception.NoPieceException;
import Main.Panel;
import Pieces.Piece;

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
				if(echec.isAPosibleMove(echec.pBuffer, this.getCoordonneX(), this.getCoordonneY(),camp)){
					echec.movePiece(this.getCoordonneX(), this.getCoordonneY(),camp);
					
					camp = !camp;
				}else{
					echec.resetTakedPiece();
				}
				
				p.drawTakePiece = false;
				click = true;
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			p.repaint();
			
		}
	}
	public boolean isTheEnd(){
		for (Piece[] pieces : echec.getPieces()) {
			for (Piece piece : pieces) {
				
			}
		}
	}
	public int getCoordonneX(){
		return (int)((MouseInfo.getPointerInfo().getLocation().x-p.getLocationOnScreen().x)/100);
	}
	public int getCoordonneY(){
		return (int)((MouseInfo.getPointerInfo().getLocation().y-p.getLocationOnScreen().y)/100);
	}
}
