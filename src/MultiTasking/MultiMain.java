package MultiTasking;

public class MultiMain {
    public static void main(String[] args) {
        MyThread tr = new MyThread();
        tr.setDaemon(true);

        tr.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("This is Main i: " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Finished!");
        try {
            tr.join(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }


    }
}
