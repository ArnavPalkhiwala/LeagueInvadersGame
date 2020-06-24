package leagueInvaders;

import java.awt.Graphics;
import java.awt.Rectangle;

public class GameObject {
	
	public boolean isAlive = true;
	
	Rectangle collisionBox;

	int x;
	int y;
	int height;
	int width;

	public GameObject(int x, int y, int width, int height) {

		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
		collisionBox = new Rectangle(x , y, width, height);
	}

	void update() {
		
        collisionBox.setBounds(x, y, width, height);


		
	}

	void draw(Graphics g) {


	}
}
