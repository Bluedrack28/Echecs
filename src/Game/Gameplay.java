package Game;

import java.awt.MouseInfo;

import Exception.NoPieceException;
import Main.Panel;
import Pieces.Piece;
import Pieces.Pieces;
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
				
				
				// grand roque et petit roque
				if(echec.pBuffer.getIdentity() == Pieces.ROI){
					if(x == 2 && y == 7){
						echec.replacePiece(0, 7, 3, 7);
					}
					if(x == 6 && y == 7 ){
						echec.replacePiece(7, 7, 5, 7);
					}
					if(x == 2 && y == 0){
						echec.replacePiece(0, 0, 3, 0);
					}
					if(x == 6 && y == 0){
						echec.replacePiece(7, 0, 5, 0);
					}
				}
				
				// prise en charge de la defait
				if(this.pieceTaked(x,y)){
					if(this.isTheEnd(this.thePieceTaked(x, y))){
						echec.resetEchiquier(false);
					}
					System.out.println(this.thePieceTaked(x,y));
					
				}
				echec.pBuffer.plusOneMove();
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
		if(p.getIdentity() == Pieces.ROI){
			
			System.out.println("fin" );
			if(p.getCamp() == Pieces.BLANC){
				System.out.println("C'est les NOIRS qui gagnent");
			}else{
				System.out.println("C'est les BLANCS qui gagnent");
			}
			return true;
			
		}
		return false;
	}
	public int getCoordonneX(){
		return (int)((MouseInfo.getPointerInfo().getLocation().x-p.getLocationOnScreen().x)/100);
	}

	public int getCoordonneY(){
		return (int)((MouseInfo.getPointerInfo().getLocation().y-p.getLocationOnScreen().y)/100);
	}
}
