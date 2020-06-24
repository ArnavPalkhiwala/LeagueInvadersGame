package leagueInvaders;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {

	ArrayList<Projectile> projectilesList = new ArrayList<Projectile>();

	ArrayList<Alien> aliensList = new ArrayList<Alien>();

	Rocketship rs;

	long enemyTimer = 0;

	int enemySpawnTime = 1000;

	private int score = 0;

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public ObjectManager(Rocketship rs) {

		this.rs = rs;
	}

	void update() {

		for (Projectile pL : projectilesList) {

			pL.update();

		}

		for (Alien a : aliensList) {

			a.update();
		}

		rs.update();
		
		

	}

	void addProjectile(Projectile p) {

		projectilesList.add(p);

	}

	void addAlien(Alien a) {

		aliensList.add(a);

	}

	void draw(Graphics g) {

		for (Projectile pjL : projectilesList) {

			pjL.draw(g);

		}

		for (Alien al : aliensList) {

			al.draw(g);
		}

		rs.draw(g);
	}

	public void manageEnemies() {
		if (System.currentTimeMillis() - enemyTimer >= enemySpawnTime) {
			addAlien(new Alien(new Random().nextInt(LeagueInvaders.width), 0, 50, 50));

			enemyTimer = System.currentTimeMillis();

		}
	}

	void purgeObjects() {


		for (int i = 0; i < aliensList.size(); i++) {
			
			if (aliensList.get(i).isAlive == false) {
				aliensList.remove(i);
			}
			
		}
		
		for (int i = 0; i < projectilesList.size(); i++) {
			
			if (projectilesList.get(i).isAlive == false) {
				projectilesList.remove(i);
				
			}
			
		}
			
			

		}

	

	void checkCollision() {

		for (Alien alien : aliensList) {

			if (rs.collisionBox.intersects(alien.collisionBox)) {

				rs.isAlive = false;
				alien.isAlive = false;
				

			}

		}

		for (Projectile pj : projectilesList) {

			for (Alien alien : aliensList) {

				if (alien.collisionBox.intersects(pj.collisionBox)) {

					alien.isAlive = false;
					pj.isAlive = false;
					
				

					score = score + 1;

				}

			}

		}

	}

}
