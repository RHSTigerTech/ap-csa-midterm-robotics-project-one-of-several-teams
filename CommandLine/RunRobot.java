
import edu.cmu.ri.createlab.hummingbird.HummingbirdRobot;

import java.awt.*;

//if we want to pause use Thread.sleep and use an exception
 public class RunRobot extends HummingbirdRobot implements Runnable{
    //create main method


    public void run() {
        while (true) {
            if(Robot1.athena.getSensorValue(1) > 100) {
                Robot1.randomLights();
            } else
                Robot1.lightsOff();
        }
    }

    public static void main(String[] args) throws InterruptedException
    {
        while (true) {
            if(Robot1.athena.getSensorValue(1) > 100) {
                Robot1.randomLights();
            } else
                Robot1.lightsOff();
        }
    }
}