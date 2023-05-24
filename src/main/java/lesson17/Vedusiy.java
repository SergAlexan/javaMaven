package lesson17;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerRepository;

public class Vedusiy {
    public static final Logger LOGGER = Logger.getLogger(Vedusiy.class);
    public static void main(String[] args) {
        System.out.println("Концерт начался");
        LOGGER.info("Начало концерта");
        Pevec1 pevec1 = new Pevec1();
        pevec1.setDaemon(true);
        Pevec2  pevec2 = new Pevec2();
        pevec2.setDaemon(true);
        Pevec3 pevec3 = new Pevec3();
        pevec3.setDaemon(true);
        pevec1.start();
        pevec2.start();
        pevec3.start();

        while(!pevec1.isAlive()){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Конец концерта");
    }
}
