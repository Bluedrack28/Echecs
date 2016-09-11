package Main;

import java.awt.Component;
import java.awt.MouseInfo;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import Game.Echiquier2;
import Game.Player;

public class MouseL implements MouseListener{
	public boolean click;
	public Echiquier2 echec;
	public Panel p;
	public MouseL(Echiquier2 echichiquer,Panel panel){
		click = true;
		p = panel;
		echec = echichiquer;

	}
	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if(click){
			try {
				echec.takePiece(this.getCoordonneX(), this.getCoordonneY());
				click = false;
			} catch (Exception e2) {
				// TODO: handle exception
				
			}
			
		}else{
			try {
				echec.movePiece(getCoordonneX(), this.getCoordonneY());
			} catch (Exception e2) {
				// TODO: handle exception
			}
			click = true;
			p.repaint();
		}
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public int getCoordonneX(){
		return (int)((MouseInfo.getPointerInfo().getLocation().x-p.getLocationOnScreen().x)/100);
	}
	public int getCoordonneY(){
		return (int)((MouseInfo.getPointerInfo().getLocation().y-p.getLocationOnScreen().y)/100);
	}


}
