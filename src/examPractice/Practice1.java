package examPractice;

import java.util.Random;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.*;


/* Level 0 Practice: Coding  Exercise #1 */
public class Practice1 {


    public static void main(String[] args) {
	 // 1. Create a random number from 0 to 4 and store it in a ‘bases’ variable
    	int baces = new Random().nextInt(4);
    	Robot max = new Robot();
    	max.turn(45);
    	max.hide();
    	max.penDown();
    	max.setSpeed(10);

	 // 2. If the number is zero  display a window that says “the batter is out”
    	if (baces == 0){
    		JOptionPane.showMessageDialog(null, "Batter is out.");
    	}

   	 // 3. Otherwise display “the batter hit a ” and “single”, “double”, “triple” or “home run”
    	else if (baces == 1){
    		JOptionPane.showMessageDialog(null, "The batter hit a single.");
    		max.move(500);
    	}
    	else if (baces == 2){
    		JOptionPane.showMessageDialog(null, "The batter hit a dubble.");
    		for (int i = 0; i < 2; i++) {
				max.move(500);
				max.turn(90);
			}
    	}
    	else if (baces == 3){
    		JOptionPane.showMessageDialog(null, "The batter hit a triple.");
    		for (int i = 0; i < 3; i++) {
				max.move(500);
				max.turn(90);
			}
    	}
    	else if (baces == 4){
    		JOptionPane.showMessageDialog(null, "HOME RUN!!!");
    		for (int i = 0; i < 4; i++) {
				max.move(500);
				max.turn(90);
			}
    	}

   	 // 4. Make the robot draw the path of the base runner. For example, if 
	 //     the batter hit a double, draw a line from home plate to first and another line from
            //      first to second. Home plate should be at the bottom and first should be on the
    }       //      right. You do not need to draw the bases themselves or any other features.

}




