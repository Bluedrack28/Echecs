package Main;

import java.awt.Component;
import java.awt.MouseInfo;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import Game.Echiquier;
import Game.Gameplay;
import Game.Player;

public class MouseL implements MouseListener{
	public boolean click;
	public Echiquier echec;
	public Panel p;
	public Gameplay game;
	public MouseL(Echiquier echichiquer,Panel panel){
		click = true;
		p = panel;
		echec = echichiquer;
		game = new Gameplay(echec, p);
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
		game.plays();
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
