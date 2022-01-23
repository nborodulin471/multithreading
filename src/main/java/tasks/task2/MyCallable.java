package tasks.task2;

import java.util.concurrent.Callable;

public class MyCallable extends Thread implements Callable<Integer> {

    private int countMessage = 0;

    public MyCallable(String name) {
        super.setName(name);
    }

    @Override
    public Integer call() throws InterruptedException {
        try {
            while(countMessage < Math.random() * 10) {
                Thread.sleep(2000);
                System.out.println(super.getName() + " Всем привет!");
                countMessage++;
            }
        } catch (InterruptedException err) {

        }
        return countMessage;
    }

}
