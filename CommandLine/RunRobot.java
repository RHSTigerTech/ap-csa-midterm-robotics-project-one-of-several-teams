
import edu.cmu.ri.createlab.hummingbird.HummingbirdRobot;

import java.awt.*;

//if we want to pause use Thread.sleep and use an exception
 public class RunRobot extends HummingbirdRobot implements Runnable{
    //create main method


    public void run() {
        System.out.println("Hello from RunRobot!");
    }

    public static void main(String[] args) throws InterruptedException
    {
        //create hummingbird object
        HummingbirdRobot athena = new HummingbirdRobot();

        Robot1.blinkLights(1,30,50,100);
        //try {
            Thread.sleep(200);
        //} catch (InterruptedException e){}
        Robot1.moveHead(100);

        //disconnect from robot
        athena.disconnect();
    }
}