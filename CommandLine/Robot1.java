
import edu.cmu.ri.createlab.hummingbird.HummingbirdRobot;

//if we want to pause use Thread.sleep and use an exception
public class Robot1 extends HummingbirdRobot {
    HummingbirdRobot athena = new HummingbirdRobot();

    public void blinkLights(int port, int red, int green, int blue){
        for(int i = 0; i<= 50; i++){
            athena.setFullColorLED(port, red, green, blue);

            //wait
            try { Thread.sleep(200);
            } catch (InterruptedException e){}

            //turn off colors
            athena.setFullColorLED(port, 0, 0, 0);
            //wait
            try { Thread.sleep(200);
            } catch (InterruptedException e){}
        }
    }
    public void moveHead(int pos){
        athena.setServoPosition(1, pos);
    }

    public void resetHead(){
        athena.setServoPosition(1, 127);
    }

    public void speak(String talk){
        athena.speak(talk);
    }

}