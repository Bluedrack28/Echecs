package Main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import java.net.URL;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.text.IconView;
import javax.swing.text.html.ImageView;

import Game.Coordonnee;
import Game.Piece;

public class Graphisme {
	
	private Graphics g;
	
	public Graphisme(Graphics gr){
		g = gr;
	}
	
	public void drawEchiquier(){
		boolean color = true;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if(color){
					g.setColor(Color.gray);
				}else{
					g.setColor(Color.white);
				}
				g.fillRect(100*i, 100*j, 100, 100);
				color = !color;
			}
			color = !color;
		}
	}
	
	public void drawPiece(Piece p){
		g.drawImage(new ImageIcon(p.getURLImage()).getImage(), p.getX()*100, p.getY()*100, 100 ,100,null);
	}

	public void drawPieces2(Piece[][] pieces){
		for (Piece[] p : pieces) {
			for (Piece piece : p) {
				if(piece != null) this.drawPiece(piece);
			}
			
		}
	}

	public void drawPieces(ArrayList<Piece> pieces){
		for (Piece p : pieces) {
			this.drawPiece(p);
		}
	}
	
	public void drawTheTakedPiece(Piece p){
		g.setColor(Color.green);
		g.fillOval(p.x*100, p.y*100, 100, 100);
		this.drawPiece(p);
	}

	public void drawCoordonnees(ArrayList<Coordonnee> coor){
		for (Coordonnee c : coor) {
			g.setColor(Color.RED);
			g.fillRect(c.getX()*100, c.getY()*100, 100, 100);
		}
	}
}
