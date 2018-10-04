
import edu.cmu.ri.createlab.hummingbird.HummingbirdRobot;

//if we want to pause use Thread.sleep and use an exception
public class Robot1 extends HummingbirdRobot {
    //create main method
    public static void main(String[] args) throws InterruptedException{
        //create hummingbird object
        HummingbirdRobot athena = new HummingbirdRobot();

//        //turn on single color LED
//        athena.setLED(1,200);
//
//        //sleep 2 second
//        Thread.sleep(500);
//
//        //turn off single color LED
//        athena.setLED(1, 0);
//
//        //turn on single color LED
//        athena.setFullColorLED(1, 0, 150, 50);
//
//        //sleep 2 second
//        Thread.sleep(500);
//
//        //turn on single color LED
//        athena.setFullColorLED(1, 0, 0, 0);
//
//        for(int i = 0; i < 20; i++) {
//            int red = (int)(Math.random()*256);
//            int green = (int)(Math.random()*256);
//            int blue = (int)(Math.random()*256);
//
//            //turn on single color LED
//            athena.setFullColorLED(1, red, green, blue);
//
//            //sleep 1/5 second
//            Thread.sleep(200);
//
//            //turn on single color LED
//            athena.setFullColorLED(1, 0, 0, 0);
//        }

        //turn on motor
        athena.setMotorVelocity(1, 150);

        Thread.sleep(4000);

        athena.setMotorVelocity(1, 0);

        while(true) {
            System.out.println(athena.getSensorValue(1));
            athena.setLED(1, athena.getSensorValue(1));
            if (athena.getSensorValue(1) < -1) {
                break;
            }
        }

        //disconnect from robot
        athena.disconnect();
    }
}