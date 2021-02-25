package oop.abstractionhomework;

public abstract class GameObject {
	
	public abstract void draw();
	
	public static void main (String[] args) {
		
		Player player = new Player();
		player.draw();
		
		FootBall football = new FootBall();
		football.draw();
		
		//GameObject myObject = new GameObject;
		
		
	}

}
