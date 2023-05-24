package lesson17;

public class Pevec3 extends Thread {
    @Override
    public void run() {
        while(true){
            synchronized (Monitors.MIKROFON){
                try {
                    Monitors.MIKROFON.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            for(int i=0; i<3;i++ ){
                System.out.println("fy fy fу_________");
                try {
                    Thread.sleep(350);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (Monitors.MIKROFON){
                Monitors.MIKROFON.notify();
            }
        }
    }
}
