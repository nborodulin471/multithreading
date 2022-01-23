package tasks.task1;

public class MyThread extends Thread {

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        try {
            while(!isInterrupted()) {
                Thread.sleep(2500);
                System.out.println(Thread.currentThread().getName() + " Всем привет!");
            }
        } catch (InterruptedException err) {

        } finally{
            System.out.printf("%s завершен\n", getName());
        }
    }



}
