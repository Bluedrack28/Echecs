package Game;

import java.awt.MouseInfo;

import Exception.NoPieceException;
import Main.Panel;
import Pieces.Piece;
import Pieces.Roi;

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
		
		int x = this.getCoordonneX();
		int y = this.getCoordonneY();
		
		if(click){
			
			try {
				echec.takePiece(x,y,camp);
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
			
			if(echec.isAPosibleMove(echec.pBuffer,x,y,camp)){
				if(this.pieceTaked(x,y)){
					System.out.println(this.thePieceTaked(x,y));
				}
				echec.movePiece(x,y,camp);
				
				camp = !camp;
			}else{
				echec.resetTakedPiece();
			}
			
			p.drawTakePiece = false;
			click = true;
			
			
			p.repaint();
			
		}
	}

	public boolean pieceTaked(int x,int y){
		
		try {
			if(echec.getPiece(x, y).getCamp() != camp){
				return true;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return false;
	}

	public Piece thePieceTaked(int x,int y){
		return echec.getPiece(x, y);
	}
	
	public boolean isTheEnd(Piece p){
		return false;
	}
	public int getCoordonneX(){
		return (int)((MouseInfo.getPointerInfo().getLocation().x-p.getLocationOnScreen().x)/100);
	}

	public int getCoordonneY(){
		return (int)((MouseInfo.getPointerInfo().getLocation().y-p.getLocationOnScreen().y)/100);
	}
}
