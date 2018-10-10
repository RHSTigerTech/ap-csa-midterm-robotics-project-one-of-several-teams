
import edu.cmu.ri.createlab.hummingbird.HummingbirdRobot;

//if we want to pause use Thread.sleep and use an exception
public class Robot1 extends HummingbirdRobot{
    static HummingbirdRobot athena = new HummingbirdRobot();



    public static void blinkLights(int red, int green, int blue, int durration){
        for(int i = 0; i<= durration; i++){
            athena.setFullColorLED(1, red, green, blue);
            athena.setFullColorLED(2, red, green, blue);

            //wait
            try { Thread.sleep(200);
            } catch (InterruptedException e){}

            //turn off colors
            athena.setFullColorLED(1, 0, 0, 0);
            athena.setFullColorLED(2, 0, 0, 0);

            //wait
            try { Thread.sleep(200);
            } catch (InterruptedException e){}
        }
    }

    public static void randomLights(){
        for(int i = 0; i<= 5; i++){
            int red = (int)(Math.random()*256);
            int green = (int)(Math.random()*256);
            int blue = (int)(Math.random()*256);

            athena.setFullColorLED(1, red, green, blue);
            athena.setFullColorLED(2, red, green, blue);

            //wait
            try { Thread.sleep(200);
            } catch (InterruptedException e){}

            //turn off colors
            athena.setFullColorLED(1, 0, 0, 0);
            athena.setFullColorLED(2, 0, 0, 0);

            //wait
            try { Thread.sleep(200);
            } catch (InterruptedException e){}
        }
    }

    public static void lightsOff(){
            //turn off colors
            athena.setFullColorLED(1, 0, 0, 0);
            athena.setFullColorLED(2, 0, 0, 0);
    }

    public static void moveHead(int pos){
        athena.setServoPosition(1, pos);

    }

    public static void resetHead(){
        athena.setServoPosition(1, 127);
    }

    public static void playerWin() {
        resetHead();
        athena.speak("Oh no!");
        blinkLights(255,0,0,2);
        moveHead(100);
        athena.speak("euoe");
        blinkLights(255,0,0,2);
        resetHead();
        athena.speak("euoe");
        blinkLights(255,0,0,2);
        moveHead(155);
        athena.speak("euoe");
        blinkLights(255,0,0,2);
        resetHead();
    }

    public static void aiWin() {
        resetHead();
        athena.speak("WooHoo");
        blinkLights(0,255,0,2);
        moveHead(110);
        athena.speak("hee");
        blinkLights(0,255,0,2);
        resetHead();
        athena.speak("hee");
        blinkLights(0,255,0,2);
        moveHead(145);
        athena.speak("hee");
        blinkLights(0,255,0,2);
        resetHead();
        athena.speak("hee");
    }

    public static void tie() {
        resetHead();
        blinkLights(0,0,255,3);
        athena.speak("Ah, well");
        moveHead(110);
        moveHead(145);
        resetHead();
        athena.speak("Better luck next time");
    }

}