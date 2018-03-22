//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
import org.jointheleague.graphical.robot.RobotImage;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot r2 = new Robot("batman");
		//3. Ask the user what color they would like the robot to draw
		JOptionPane.showInputDialog(null, "what color do you want");
		//5. Use an if/else statement to set the pen color that the user requested

        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		r2.setPenWidth(10);
		r2.setSpeed(10);	
	    //2. Make the robot draw a shape (this will take more than one line of code)

for (int i = 0; i < 360; i++) {
	
	r2.move(1);
	r2.turn(1);	
	}

	}
}
