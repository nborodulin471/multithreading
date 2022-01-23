package tasks.task1;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Создаю потоки...");

        ThreadGroup mainGroup = new ThreadGroup("Я группа потоков");
        MyThread myThread1 = new MyThread(mainGroup, "Я поток 1");
        MyThread myThread2 = new MyThread(mainGroup, "Я поток 2");
        MyThread myThread3 = new MyThread(mainGroup, "Я поток 3");
        MyThread myThread4 = new MyThread(mainGroup, "Я поток 4");
        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();

        Thread.sleep(15000);

        System.out.println("Завершаю все потоки.");
        mainGroup.interrupt();
    }

}
