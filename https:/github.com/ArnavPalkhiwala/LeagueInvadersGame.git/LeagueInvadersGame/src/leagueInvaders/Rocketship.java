package leagueInvaders;

import java.awt.Graphics;

public class Rocketship extends GameObject {

	int speed;

	public Rocketship(int x, int y, int width, int height) {
		super(x, y, width, height);

		speed = 15;

	}

	void update() {

	}

	void updatePositionR() {

		super.update(); 

		speed = 45;
		x += speed;

	}

	void updatePositionL() {

		super.update();

		speed = -45;
		x += speed;

	}

	void updatePositionU() {

		super.update();

		speed = 45;
		y += speed;

	}

	void updatePositionD() {

		super.update();

		speed = -45;
		y += speed;

	}

	void draw(Graphics g) {

		g.drawImage(GamePanel.rocketImg, x, y, width, height, null);

	}

}
