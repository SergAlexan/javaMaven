package lesson17;

public class Pevec2 extends Thread{
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
                System.out.println("Fa_fa_________");
                try {
                    Thread.sleep(200);
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
