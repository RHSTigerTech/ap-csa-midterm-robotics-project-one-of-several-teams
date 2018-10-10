
import edu.cmu.ri.createlab.hummingbird.HummingbirdRobot;

import java.awt.*;

//if we want to pause use Thread.sleep and use an exception
 public class RunRobot extends HummingbirdRobot implements Runnable{
    //create main method


    public void run() {
        while (true) try {
            if (Robot1.athena.getSensorValue(1) > 150) {
                Robot1.randomLights();
            } else
                Robot1.lightsOff();
        } catch (UnsatisfiedLinkError e) {
        }
    }

    public static void main()
    {
        while (true) {
            if(Robot1.athena.getSensorValue(1) > 150) {
                Robot1.randomLights();
            } else
                Robot1.lightsOff();
        }
    }
}