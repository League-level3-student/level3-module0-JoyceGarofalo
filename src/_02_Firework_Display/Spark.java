package _02_Firework_Display;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Spark {
	public int size = 5;
	
	public int x;
	public int y;
	public int xVelocity;
	public int yVelocity;
	public Color color;
	
	public boolean fire = false;
	public boolean dead = false;
	
	public Spark(int x, int y) {
		this.x = x;
		this.y = y;
		Random r = new Random();
		color = new Color(r.nextInt(128) + 128, r.nextInt(128) + 128, r.nextInt(128) + 128);
		yVelocity = -30;
		xVelocity = 0;
	}
//getters and setters
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}
