
import edu.cmu.ri.createlab.hummingbird.HummingbirdRobot;

//if we want to pause use Thread.sleep and use an exception
public class RunRobot extends HummingbirdRobot implements Runnable{
    //create main method


    public void run() {
        System.out.println("Hello from RunRobot!");
    }

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