 package leagueInvaders;

import java.awt.Graphics;

public class Projectile extends GameObject {

	int speed;

	public Projectile(int x, int y, int height, int width) {
		super(x, y, height, width);
		// TODO Auto-generated constructor stub

		speed = 14;

	}

	void update() {

		super.update();

		y = y - speed;

		if (y < 0) {
			isAlive = false;
		}
		
		
	}

	void draw(Graphics g) {

		g.drawImage(GamePanel.bulletImg, x, y, width, height, null);

	}

}
