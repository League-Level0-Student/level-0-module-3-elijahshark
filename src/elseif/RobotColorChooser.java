//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
import org.jointheleague.graphical.robot.RobotImage;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		Robot r2 = new Robot("batman");
		for (int i = 0; i < 1000000000; i++) {

			// 1. Create a new Robot
			r2.penDown();
			// 3. Ask the user what color they would like the robot to draw
			String WORD = JOptionPane.showInputDialog(null, "what color do you want");
			// 5. Use an if/else statement to set the pen color that the user requested
			if (WORD.equals("blue")) {
					r2.setPenColor(255, 187, 85);
			}
			if (WORD.equals("gold")) {
				r2.setPenColor(000, 238, 255);
			} else {
				r2.setRandomPenColor();
			}
			// 6. If the user doesn’t enter anything, choose a random color

			// 7. Put a loop around your code so that you keep asking the user for more
			// colors & drawing them

			// 4. Set the pen width to 10
			r2.setPenWidth(10);
			r2.setSpeed(10);
			// 2. Make the robot draw a shape (this will take more than one line of code)

			for (int i1 = 0; i1 < 360; i1++) {

				r2.move(1);
				r2.turn(1);
			}

		}
	}
}