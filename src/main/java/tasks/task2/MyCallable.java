package tasks.task2;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {

    private int countMessage = 0;

    @Override
    public Integer call() throws InterruptedException {
        try {
            while(countMessage < Math.random() * 10) {
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " Всем привет!");
                countMessage++;
            }
        } catch (InterruptedException err) {

        }
        return countMessage;
    }

}
