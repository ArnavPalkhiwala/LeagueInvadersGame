package leagueInvaders;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class LeagueInvaders implements KeyListener {

	JFrame frame;
	GamePanel GP;
	
	final static int width = 500;
	final static int height = 800;

	public LeagueInvaders() {
		
		frame = new JFrame();
		GP = new GamePanel();
		

	}



	void setup() {
		
		frame.add(GP);
		frame.addKeyListener(GP);
		
		frame.setSize(500, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().setPreferredSize(new Dimension(500, 800));
        frame.pack();
		frame.setVisible(true);
		
		GP.startGame();

	}

	public static void main(String[] args) {
		LeagueInvaders LI = new LeagueInvaders();
		LI.setup();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
