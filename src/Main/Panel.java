package Main;

import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import Exception.NoPieceException;
import Game.Echiquier;
import Game.Gameplay;
import Pieces.Cheval;
import Pieces.Fou;
import Pieces.Piece;
import Pieces.Pion;
import Pieces.Reine;
import Pieces.Roi;
import Pieces.Tour;
import Game.Echiquier;

public class Panel extends JPanel	{
	
	private Graphics gr;
	public boolean drawTakePiece;
	public Gameplay game;
	public Echiquier echec = new Echiquier();
	
	
	public Panel(Echiquier echiquier ){
		echec = echiquier;
		Roi p = new Roi(1,2,true);
		
	}

	public void paintComponent(Graphics g){
		
		Graphisme graph = new Graphisme(g);
		
		graph.drawEchiquier();
		
		if(drawTakePiece){
		graph.drawTheTakedPiece(echec.pBuffer);
		graph.drawCoordonnees(echec.pBuffer.possibleMove(echec));
		}
		
	
		graph.drawPieces2(echec.getPieces());
		
		
	}

	
}
