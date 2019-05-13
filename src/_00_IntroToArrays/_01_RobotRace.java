package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		//2. create an array of 5 robots.
		Robot[] robot = new Robot[5];
		Random rand = new Random();
		boolean isRacing = true;
	//3. use a for loop to initialize the robots.
		for (int i = 0; i < robot.length; i++) {
			robot[i] = new Robot();
			//4. make each robot start at the bottom of the screen, side by side, facing up
			robot[i].setX(200*i + 50);
			robot[i].setY(550);
			robot[i].setSpeed(30);
		}
		while (isRacing == true) {
			for (int j = 0; j < robot.length; j++) {
				int r = rand.nextInt(50);
				robot[j].move(r);
				if(robot[j].getY()> 0) {
					isRacing = false;
					System.out.println("winner!");
					break;
				}
			}
		}
		

	//5. use another for loop to iterate through the array and make each robot move 
	   //   a random amount less than 50.
		    	
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!
		    	
	//8. try different races with different amounts of robots.
		    	
	   //9. make the robots race around a circular track.

	}
		
	
}
