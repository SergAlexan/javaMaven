package lesson17;

import org.apache.log4j.Logger;

public class Log {
    public static final Logger LOGGER = Logger.getLogger(Log.class);

    public static void main(String[] args) {
        System.out.println("Начало концерта");
        LOGGER.info("Начало концерта");
    }
}
