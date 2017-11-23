package MultiTasking;

public class MyThread extends Thread {
    @Override
    public synchronized void start() {
        super.start();
    }

    @Override
    public void run() {
        super.run();

        for (int i = 0; i < 15; i++) {
            System.out.println("I is:" + i);
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
