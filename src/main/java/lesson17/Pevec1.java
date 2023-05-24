package lesson17;
import org.apache.log4j.Logger;
public class Pevec1 extends Thread {
    public static final Logger LOGGER = Logger.getLogger(Pevec1.class);
    private int count = 5;
    public Pevec1(){
    }


    @Override
    public void run() {
        int j = 0;
        while (true) {
            //лог певец 1 начал петь
            LOGGER.info("Певец 1 начал петь");
            for (int i = 0; i < 3; i++) {
                System.out.println("La_la_________");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (Monitors.MIKROFON) {
                // певец 1 передал микрофон
                Monitors.MIKROFON.notify();
            }
            synchronized (Monitors.MIKROFON) {
                try {
                    //певец 1 ждет
                    Monitors.MIKROFON.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            j++;
        }

    }
}

