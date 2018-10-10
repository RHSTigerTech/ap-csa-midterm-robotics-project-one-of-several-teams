public class TalonsTestFileToTestThingsThatNeedTesting implements Runnable {
    public void run(){

    }
    public static void main(String [] args){
        Robot1.moveHead(110);
        //wait
        try { Thread.sleep(200);
        } catch (InterruptedException e){}
        Robot1.resetHead();
        //wait
        try { Thread.sleep(200);
        } catch (InterruptedException e){}
        Robot1.moveHead(145);
        //wait
        try { Thread.sleep(200);
        } catch (InterruptedException e){}
        Robot1.resetHead();
    }
}
