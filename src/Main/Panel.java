package Main;

import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import Game.Cheval;
import Game.Fou;
import Game.Piece;
import Game.Pion;
import Game.Tour;

public class Panel extends JPanel{
	
	private Graphics gr;
	Cheval p = new Cheval(7,7,false);
	
	public Panel(){
		
		Pion p = new Pion(1,100,true);
	
	}

	public void paintComponent(Graphics g){

		Graphisme graph = new Graphisme(g);
		graph.drawEchiquier();
		graph.drawCoordonnees(p.possibleMove());
		graph.drawPiece(p);
	}
}
