/**
 * Created by Ethan on 4/30/2017.
 */

import java.awt.*;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class highAlchingWhileLoop {
    public static void main(String[] args) {
        try {
            Robot robot = new Robot();
            {
                int I = 0;

                while (I < 5)

                {
                    robot.mouseMove(1319, 552);
                    robot.mousePress(InputEvent.BUTTON1_MASK);
                    robot.mouseRelease(InputEvent.BUTTON1_MASK);
                    robot.delay(500);
                    robot.mouseMove(1222, 452);
                    robot.mousePress(InputEvent.BUTTON1_MASK);
                    robot.mouseRelease(InputEvent.BUTTON1_MASK);
                    robot.delay(1000);
                    I++;
                }
            }
        } catch (AWTException e) {
            System.out.print(e);
        }
    }
}
