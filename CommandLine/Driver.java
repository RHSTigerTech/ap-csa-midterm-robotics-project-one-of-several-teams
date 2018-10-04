
import edu.cmu.ri.createlab.hummingbird.HummingbirdRobot;

//if we want to pause use Thread.sleep and use an exception
public class Driver extends HummingbirdRobot {
    //create main method
    public static void main(String[] args) throws InterruptedException{
        //create hummingbird object
        HummingbirdRobot athena = new HummingbirdRobot();

        /**
         * Write code here
         */


        //disconnect from robot
        athena.disconnect();
    }
}