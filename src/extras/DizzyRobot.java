//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package extras;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class DizzyRobot {
	static Robot robot = new Robot("batman");
	public static void main(String[] args) {
		
		 // 2. Ask the user how dizzy you want the robot from 1-10, then spin that number of times.
String ans = JOptionPane.showInputDialog("how many times do you want Batman to move");
 // 1. Use the dance method to make the robot spin.
int LAZER_CATS_ARE_TAKING_OVER_THE_WORLD = Integer.parseInt(ans);



	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			robot.turn(360);
		}
	}
}

